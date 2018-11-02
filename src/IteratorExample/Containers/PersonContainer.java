package IteratorExample.Containers;

import IteratorExample.Interfaces.Container;
import IteratorExample.Interfaces.Iterator;
import IteratorExample.Iterators.PersonIterator;
import IteratorExample.Person;


//Creates a specific type of Array, and defining methods that can be used on it.
public class PersonContainer implements Container
{
    static final int maxPersons = 3;
    int numberOfPersons = 0;
    Person[] personList;


    //Sets the defined parameters for the array.
    public PersonContainer()
    {
        personList = new Person[maxPersons];
    }

    public void addPerson(String personName)
    {
        Person person = new Person(personName);
        if (numberOfPersons >= maxPersons)
        {
            System.out.println("The list is full");
        }
        else
        {
            personList[numberOfPersons] = person;
            numberOfPersons++;
        }
    }


    //Returns a new iterator object
    @Override
    public Iterator createIterator()
    {
        return new PersonIterator(personList);
    }
}
