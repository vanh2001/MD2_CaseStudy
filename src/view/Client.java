package view;

import controller.GoodsManager;
import controller.PersonManager;
import model.Goods;
import model.Person;
import model.Shipper;

import java.util.List;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner inputChoice = new Scanner(System.in);
        int choice = -1;
        while (choice != 0){
            System.out.println("Menu");
            System.out.println("1. Add new Person");
            System.out.println("2. Show add Person");
            System.out.println("3. Edit Person");
            System.out.println("4. Add new Goods");
            System.out.println("5. Show add Goods");
            System.out.println("6. Edit Goods");
            System.out.println("0. Exit");
            System.out.print("Please your choice: ");
            choice = inputChoice.nextInt();
            switch (choice){
                case 1:
                    addNewPerson();
                    break;
                case 2:
                    PersonManager.displayAllPerson();
                    break;
                case 3:
                    InputPerson.editPersonById();
                    break;
                case 4:
                    InputGoods.createNewGoods();
                    GoodsManager.displayAllGoods();
                    break;
                case 5:
                    GoodsManager.displayAllGoods();
                    break;
                case 6:
                    InputGoods.editGoodsById();
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
                    Person person = InputPerson.createNewCustomer();
                    PersonManager.addPerson(person);
                    PersonManager.displayAllPerson();
                    break;
                case 2:
                    Shipper shipper = InputPerson.createNewShipper();
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

}
