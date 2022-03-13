package storage;

import model.Person;

import java.io.IOException;
import java.util.ArrayList;

public interface IPersonData {
    ArrayList<Person> readfile(ArrayList<Person> personList) throws IOException;

    void writeFile(ArrayList<Person> personList) throws IOException;
}
