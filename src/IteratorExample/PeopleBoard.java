package IteratorExample;

import IteratorExample.Containers.PersonContainer;
import IteratorExample.Interfaces.Iterator;

public class PeopleBoard
{
    PersonContainer people;

    //Adds a PersonContainer containing instances of Person
    public PeopleBoard(PersonContainer people)
    {
        this.people = people;
    }

    //Prints out the names of all people associated with the PeopleBoard
    public void printBoard()
    {
        Iterator iterator = people.createIterator();
        System.out.println("Registered people:");


        //Iterator is used to parse through the array
        int i = 1;
        while (iterator.hasNext())
        {
            Person person = (Person)iterator.next();
            System.out.println(i + ". " + person.getName());
            i++;
        }
    }
}
