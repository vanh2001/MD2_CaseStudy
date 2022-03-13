package controller;

import model.Person;

import java.util.ArrayList;

public class PersonManager {
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
    public static void getPersonByIndex(int index, Person person) {
        personList.set(index, person);
    }

    //Xóa khách hàng
    public static void deletePersonByIndex(int index) {
        personList.remove(index);
    }
}
