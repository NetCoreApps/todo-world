using System.Runtime.Serialization;

namespace TodoWorld.ServiceModel.Types
{
    [DataContract]
    public class Todo
    {
        [DataMember(Order = 1)]
        public long Id { get; set; }

        [DataMember(Order = 2)]
        public string Title { get; set; }

        [DataMember(Order = 3)]
        public int Order { get; set; }

        [DataMember(Order = 4)]
        public bool Completed { get; set; }
    }
}