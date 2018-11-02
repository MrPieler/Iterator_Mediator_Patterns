public abstract class Worker {
        public WorkerMediator mediator;
        public String name;

        public Worker(WorkerMediator med, String name){
            this.mediator=med;
            this.name=name;
        }

        public abstract void send(String msg);

        public abstract void receive(String msg);
}



