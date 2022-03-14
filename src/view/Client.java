package view;

import controller.GoodsManager;
import controller.PersonManager;
import model.Goods;
import model.Person;
import model.Shipper;

import java.util.Scanner;

public class Client {

    //menu chính
    public static void main(String[] args) {
        Scanner inputChoice = new Scanner(System.in);
        int choice = -1;
        while (choice != 0){
            System.out.println("Menu");
            System.out.println("1. Person Manager");
            System.out.println("3. Goods Manager");
            System.out.println("0. Exit");
            System.out.print("Please your choice: ");
            choice = inputChoice.nextInt();
            switch (choice){
                case 1:
                    person();
                    break;
                case 2:
                    goods();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Please let's choose one!");
            }
        }
    }

    //Menu Person:
    public static void person() {
        int choice = -1;
        Scanner inputChoice = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Person Manager: ");
            System.out.println("1. Add New Custommer");
            System.out.println("2. Add New Shipper ");
            System.out.println("3. Edit Person");
            System.out.println("4. Remove Person");
            System.out.println("5. Search Person");
            System.out.println("6. Display all Person");
            System.out.println("0. Return to main menu ");
            System.out.print("Please your choice: ");
            choice = inputChoice.nextInt();
            switch (choice) {
                case 1:
                    Person person = InputPerson.createNewCustomer();
                    PersonManager.addPerson(person);
                    break;
                case 2:
                    Shipper shipper = InputPerson.createNewShipper();
                    PersonManager.addPerson(shipper);
                    break;
                case 3:
                    InputPerson.editPersonById();
                    break;
                case 4:
                    InputPerson.deletePersonByIndex();
                    break;
                case 5:
                    InputPerson.searchPersonById();
                    break;
                case 6:
                    PersonManager.displayAllPerson();
                    break;
                case 0:
                    return;
                default:
                    System.err.println("Please let's choose one!");
            }
        }
    }

    //Menu Goods:
    public static void goods() {
        int choice = -1;
        Scanner inputChoice = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Goods Manager: ");
            System.out.println("1. Add New Goods");
            System.out.println("2. Edit Goods");
            System.out.println("3. Remove Goods");
            System.out.println("4. Search Goods");
            System.out.println("5. Display all Goods");
            System.out.println("0. Return to main menu ");
            System.out.print("Please your choice: ");
            choice = inputChoice.nextInt();
            switch (choice) {
                case 1:
                    Goods goods = InputGoods.createNewGoods();
                    GoodsManager.addGoods(goods);
                    break;
                case 2:
                    InputGoods.editGoodsById();
                    break;
                case 3:
                    InputGoods.deleteGoodsByIndex();
                    break;
                case 4:
                    InputGoods.searchGoodsById();
                    break;
                case 5:
                    GoodsManager.displayAllGoods();
                    break;
                case 0:
                    return;
                default:
                    System.err.println("Please let's choose one!");
            }
        }
    }
}
