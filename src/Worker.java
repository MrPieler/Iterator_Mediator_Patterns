public class Worker
{
    private String name;
    private boolean done;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Worker(String name){
        this.name  = name;
    }

    public void isWorkerDone(String taskName, boolean done){
        Mediator.workerDone(this,taskName, done);
    }
}

