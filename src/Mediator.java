import java.util.Date;

public class Mediator
{
    public static void workerDone(Worker worker, String taskName, boolean done){
        System.out.println(new Date().toString() + " [" + worker.getName() + "] : " + taskName +  " " + done);
    }
}
