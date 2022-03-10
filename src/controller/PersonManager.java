package controller;

import model.Person;

import java.util.ArrayList;

public class PersonManager {
    public static ArrayList<Person> personList = new ArrayList<>();

    //Hiển thị danh sách:
    public static void displayAllPerson(){
        for (Person p: personList) {
            System.out.println(p);
        }
    }

    //Thêm mới nhân viên

}
