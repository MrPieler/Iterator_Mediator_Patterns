package IteratorExample;

import IteratorExample.Containers.PersonContainer;

public class Run
{

    public static void main(String[] args)
    {
        PersonContainer personContainer = new PersonContainer();
        PeopleBoard peopleBoard = new PeopleBoard(personContainer);

        personContainer.addPerson("Bob");
        personContainer.addPerson("Herman");
        personContainer.addPerson("Karsten");

        peopleBoard.printBoard();
    }
}
