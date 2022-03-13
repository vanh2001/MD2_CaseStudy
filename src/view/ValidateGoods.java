package view;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateGoods {

    public String checkNullString(){
        Scanner inputString = new Scanner(System.in);
        String str;
        while (true){
            str = inputString.nextLine();
            if(!str.trim().equals("")){
                break;
            }else {
                System.err.println("String is not empty!");
            }
        }
        return str;
    }

    public double checkDouble(){
        Scanner inputDouble = new Scanner(System.in);
        double number;
        while (true){
            try {
                number = Double.parseDouble(inputDouble.nextLine());
                if(number > 0){
                    break;
                }else {
                    System.err.println("Do not input negative number!");
                }
            }catch (Exception e){
                System.err.println("Please input the number!");
            }
        }
        return number;
    }
}
