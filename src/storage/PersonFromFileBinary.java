package storage;

import model.Goods;
import model.Person;

import java.io.*;
import java.util.ArrayList;

public class PersonFromFileBinary implements IPersonData{
    @Override
    public ArrayList<Person> readfile(ArrayList<Person> personList) throws IOException {
        File file = new File("person.txt");
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            Object result = ois.readObject();
            personList = (ArrayList<Person>) result;
            return personList;
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }finally {
            ois.close();
            fis.close();
        }
        return new ArrayList<>();
    }

    @Override
    public void writeFile(ArrayList<Person> personList) throws IOException {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("person.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(personList);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            oos.close();
            fos.close();
        }
    }
}
