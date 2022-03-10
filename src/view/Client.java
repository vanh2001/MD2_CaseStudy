package view;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner inputChoice = new Scanner(System.in);
        int choice = -1;
        while (choice != 0){
            System.out.println("Menu");
            System.out.println("1. Add new Shipper");
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
}
