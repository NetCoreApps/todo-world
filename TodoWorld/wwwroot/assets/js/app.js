/*global Vue */

(function (exports) {

	'use strict';
	var client = exports.client;

// visibility filters
	var filters = {
		all: function (todos) {
			return todos
		},
		active: function (todos) {
			return todos.filter(function (todo) {
				return !todo.completed
			})
		},
		completed: function (todos) {
			return todos.filter(function (todo) {
				return todo.completed
			})
		}
	};

// app Vue instance
	var app = new Vue({
		// app initial state
		data: {
			todos: window.TODOS,
			newTodo: '',
			editedTodo: null,
			visibility: 'all'
		},

		// computed properties
		// http://vuejs.org/guide/computed.html
		computed: {
			filteredTodos: function () {
				return filters[this.visibility](this.todos);
			},
			remaining: function () {
				return filters.active(this.todos).length;
			},
			allDone: {
				get: function () {
					return this.remaining === 0;
				},
				set: function (value) {
					this.todos.forEach(function (todo) {
						todo.completed = value;
					});
				}
			}
		},

		filters: {
			pluralize: function (n) {
				return n === 1 ? 'item' : 'items';
			}
		},

		// methods that implement data logic.
		// note there's no DOM manipulation here at all.
		methods: {
			addTodo: function () {
				var value = this.newTodo && this.newTodo.trim();
				if (!value) {
					return;
				}

				var $this = this;
				return client.post(new CreateTodo({
						title: value,
						completed: false
					}))
					.then(function(r) {
						console.log(r);
						$this.todos.push(r.result);
						$this.newTodo = ''
					});
			},

			removeTodo: function (todo) {
				this.todos.splice(this.todos.indexOf(todo), 1);
				return client.delete(new DeleteTodo({ id: todo.id }))
			},

			editTodo: function (todo) {
				this.beforeEditCache = todo.title;
				this.editedTodo = todo;
			},

			doneEdit: function (todo) {
				if (!this.editedTodo) {
					return;
				}
				this.editedTodo = null;
				todo.title = todo.title.trim();
				if (!todo.title) {
					return this.removeTodo(todo);
				} else {
					return client.put(new UpdateTodo(todo))
				}
			},
			
			update: function(todo) { return client.put(new UpdateTodo(todo)) },

			cancelEdit: function (todo) {
				this.editedTodo = null;
				todo.title = this.beforeEditCache
			},

			removeCompleted: function () {
				var removeTodoIds = filters.completed(this.todos).map(function(x) { return x.id });
				this.todos = filters.active(this.todos);
				return client.delete(new DeleteTodos({ ids: removeTodoIds }))
			}
		},

		// a custom directive to wait for the DOM to be updated
		// before focusing on the input field.
		// http://vuejs.org/guide/custom-directive.html
		directives: {
			'todo-focus': function (el, binding) {
				if (binding.value) {
					el.focus()
				}
			}
		}
	});

// handle routing
	function onHashChange () {
		var visibility = window.location.hash.replace(/#\/?/, '');
		if (filters[visibility]) {
			app.visibility = visibility;
		} else {
			//window.location.hash = ''; // tabs in docs uses #
			app.visibility = 'all';

			var activeTab = location.hash
				? document.querySelector('.tabs .' + location.hash.substring(1))
				: null;
			if (activeTab) {
				activeTab.click();
			}
		}
	}

	window.addEventListener('hashchange', onHashChange);
	onHashChange();

// mount
	app.$mount('.todoapp');
	
})(window);
