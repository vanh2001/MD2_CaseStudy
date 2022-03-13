package view;

import controller.GoodsManager;
import controller.PersonManager;
import model.Goods;
import model.Person;
import model.Shipper;

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
            System.out.print("Please your choice: ");
            choice = inputChoice.nextInt();
            switch (choice){
                case 1:
                    addNewPerson();
                    break;
                case 2:
                    createNewGoods();
                    GoodsManager.displayAllGoods();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Please let's choose one!");
            }
        }
    }

    public static void addNewPerson() {
        int choice = -1;
        Scanner inputChoice = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Add new Person:");
            System.out.println("1. New Custommer");
            System.out.println("2. New Shipper ");
            System.out.println("0. Return to main menu ");
            System.out.print("Please your choice: ");
            choice = inputChoice.nextInt();
            switch (choice) {
                case 1:
                    Person person = createNewCustomer();
                    PersonManager.addPerson(person);
                    PersonManager.displayAllPerson();
                    break;
                case 2:
                    Shipper shipper = createNewShipper();
                    PersonManager.addPerson(shipper);
                    PersonManager.displayAllPerson();
                    break;
                case 0:
                    return;
                default:
                    System.err.println("Please let's choose one!");
            }
        }
    }

    public static Person createNewCustomer(){
        ValidatePerson valid = new ValidatePerson();

        System.out.print("Input the id customer: ");
        String id = valid.checkNullString();

        System.out.print("Input the name customer: ");
        String name = valid.checkNullString();

        int age = valid.checkAge();

        System.out.print("Input the address customer: ");
        String address = valid.checkNullString();

        System.out.print("Input the phone number customer: ");
        String phoneNumber = valid.checkPhoneNumber();

        Person p = new Person(id, name, age, address, phoneNumber);
        return p;
    }


    public static Shipper createNewShipper(){
        ValidatePerson valid = new ValidatePerson();

        System.out.print("Input the id shipper: ");
        String id = valid.checkNullString();

        System.out.print("Input the name shipper: ");
        String name = valid.checkNullString();

        int age = valid.checkAge();

        System.out.print("Input the address shipper: ");
        String address = valid.checkNullString();

        System.out.print("Input the phone number shipper: ");
        String phoneNumber = valid.checkPhoneNumber();

        System.out.print("Input the identityCard shipper: ");
        String identityCard = valid.checkNullString();

        System.out.print("Input the area shipper: ");
        String area = valid.checkNullString();

        boolean status = valid.checkStatus();

        Shipper s = new Shipper(id, name, age, address, phoneNumber, identityCard, area, status);
        return s;
    }

    public static Goods createNewGoods(){
        ValidateGoods valid = new ValidateGoods();

        System.out.println("Input the id goods: ");
        String id = valid.checkNullString();

        System.out.println("Input the name goods: ");
        String name = valid.checkNullString();

        System.out.println("Input the price goods: ");
        double price = valid.checkDouble();

        Scanner inputAmount = new Scanner(System.in);
        System.out.println("Input the amount goods: ");
        int amount = inputAmount.nextInt();

        Goods g = new Goods(id, name, price, amount);
        return g;
    }
}
