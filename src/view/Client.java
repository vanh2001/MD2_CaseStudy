package view;

import controller.PersonManager;
import model.Person;
import model.Shipper;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    private static List<Person> personListClient = PersonManager.personList;

    public static void main(String[] args) {
        Scanner inputChoice = new Scanner(System.in);
        int choice = -1;
        while (choice != 0){
            System.out.println("Menu");
            System.out.println("1. Add new Person");
            System.out.println("2. Add new Goods");
            System.out.println("0. Exit");
            choice = inputChoice.nextInt();
            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Please let's choose one!");
            }
        }
    }

    public static Person createNewCustomer(){
        Validate valid = new Validate();

        System.out.print("Input the id customer: ");
        String id = valid.checkNullString();

        System.out.print("Input the name customer: ");
        String name = valid.checkNullString();

        int age = valid.checkAge();

        System.out.print("Input the address customer: ");
        String address = valid.checkNullString();

        System.out.print("Input the phone number customer: ");
        int phoneNumber;

        Person p = new Person(id, name, age, address, phoneNumber);
        return p;
    }


    public static Shipper createNewShipper(){
        Validate valid = new Validate();

        System.out.print("Input the id shipper: ");
        String id = valid.checkNullString();

        System.out.print("Input the name shipper: ");
        String name = valid.checkNullString();

        int age = valid.checkAge();

        System.out.print("Input the address shipper: ");
        String address = valid.checkNullString();

        System.out.print("Input the phone number shipper: ");
        String phoneNumber = valid.checkNullString();

        System.out.print("Input the identityCard shipper: ");
        String identityCard = valid.checkNullString();

        System.out.print("Input the area shipper: ");
        String area = valid.checkNullString();

        boolean status = valid.checkStatus();

        Shipper s = new Shipper(id, name, age, address, phoneNumber, identityCard, area, status);
        return s;
    }
}
