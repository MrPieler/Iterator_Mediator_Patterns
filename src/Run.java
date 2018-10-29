import Interfaces.Iterator;
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


        taskRepository.getIterator().print();
    }
}
