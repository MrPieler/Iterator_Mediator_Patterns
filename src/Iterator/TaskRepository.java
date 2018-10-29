package Iterator;

import Interfaces.Container;
import Interfaces.Iterator;

import java.util.ArrayList;
import java.util.List;


public class TaskRepository implements Container
{
    public List<String> tasks = new ArrayList<>();

    public void addTask(String taskName)
    {
        tasks.add(taskName);
    }

    @Override
    public Iterator getIterator()
    {
        return new TaskIterator();
    }

    private class TaskIterator implements Iterator
    {
        int index;

        @Override
        public boolean hasNext()
        {
            if(index < tasks.size()){
                return true;
            }
            return false;
        }

        @Override
        public Object next()
        {
            if(this.hasNext()){
                return tasks.get(index++);
            }
            return null;
        }

        @Override
        public void print()
        {
            for (Iterator iter = getIterator(); iter.hasNext(); )
            {
                String taskName = (String) iter.next();
                System.out.println("Task name : " + taskName);
            }
        }
    }
}
