import Iterator.TaskRepository;

public class Run
{
    public static void main(String[] args)
    {
        WorkerMediator mediator = new WorkerMediatorImpl();
        Worker worker1 = new WorkerImpl(mediator, "Sebastian");
        Worker worker2 = new WorkerImpl(mediator, "Mikkel");
        Worker worker3 = new WorkerImpl(mediator, "Simon");
        Worker worker4 = new WorkerImpl(mediator, "Lars");


        mediator.addWorker(worker1);
        mediator.addWorker(worker2);
        mediator.addWorker(worker3);
        mediator.addWorker(worker4);

        worker1.send("Hi All");









        TaskRepository taskRepository = new TaskRepository();
        taskRepository.addTask("Fyr op for radioen");
        taskRepository.addTask("Start gravkoen");
        taskRepository.addTask("Byg mur");
        taskRepository.addTask("Fjern mur der er sat forkert op");
        taskRepository.getIterator().print();
    }
}
