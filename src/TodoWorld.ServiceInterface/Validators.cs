using ServiceStack.FluentValidation;
using TodoWorld.ServiceModel;

namespace TodoWorld.ServiceInterface
{
    public class CreateTodoValidator : AbstractValidator<CreateTodo>
    {
        public CreateTodoValidator()
        {
            RuleFor(x => x.Title).NotEmpty();
            RuleFor(x => x.Order).GreaterThanOrEqualTo(0);
        }
    }
    
    public class UpdateTodoValidator : AbstractValidator<UpdateTodo>
    {
        public UpdateTodoValidator()
        {
            RuleFor(x => x.Id).GreaterThan(0);
            RuleFor(x => x.Title).NotEmpty();
            RuleFor(x => x.Order).GreaterThanOrEqualTo(0);
        }
    }
}