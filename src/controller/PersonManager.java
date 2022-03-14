package controller;

import model.Person;
import storage.IPersonData;
import storage.PersonFromFileBinary;

import java.io.IOException;
import java.util.ArrayList;

public class PersonManager {
    public static IPersonData personData = new PersonFromFileBinary();
    public static ArrayList<Person> personList = new ArrayList<>();


    //Hiển thị danh sách:
    public static void displayAllPerson() {
        for (Person p : personList) {
            System.out.println(p);
        }
    }

    //Thêm mới khách hàng
    public static void addPerson(Person person) {
        personList.add(person);
        try {
            personData.writeFile(personList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Lấy ra chuỗi id thành số
    public static int getPersonById(String personId) {
        for (int i = 0; i < personList.size(); i++) {
            Person person = personList.get(i);
            if (person.getId().equals(personId)) {
                return i;
            }
        }
        return -1;
    }

    //Sửa khách hàng
    public static void editPersonByIndex(int index, Person person) {
        personList.set(index, person);
        try {
            personData.writeFile(personList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Xóa khách hàng
    public static void deletePersonByIndex(int index) {
        personList.remove(index);
        try {
            personData.writeFile(personList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
