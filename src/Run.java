import Iterator.TaskRepository;

public class Run
{
    public static void main(String[] args)
    {
        TaskRepository taskRepository = new TaskRepository();

        taskRepository.addTask("Fyr op for radioen");
        taskRepository.addTask("Start gravkoen");
        taskRepository.addTask("Byg mur");
        taskRepository.addTask("Fjern mur der er sat forkert op");

        Mediator newMediator = new Mediator();
        Worker sebastian = new Worker("Sebastian");
        Worker mikkel = new Worker("Mikkel");

        sebastian.isWorkerDone("Fyr op for radioen", false);
        mikkel.isWorkerDone("Byg mur", true);

        taskRepository.getIterator().print();
    }
}
