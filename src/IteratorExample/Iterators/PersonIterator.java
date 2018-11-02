package IteratorExample.Iterators;

import IteratorExample.Interfaces.Iterator;
import IteratorExample.Person;


//Class creates the algorithm for parsing through an array
public class PersonIterator implements Iterator
{

    Person[] personList;

    int currentPosition = 0;

    public  PersonIterator (Person[] personList)
    {
        this.personList = personList;
    }

    @Override
    public Object next()
    {
        Person person =  personList[currentPosition];
        currentPosition++;
        return person;
    }

    @Override
    public boolean hasNext()
    {
        if (currentPosition >= personList.length ||personList[currentPosition] == null)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
