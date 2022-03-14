package view;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePerson {

    private static final String PHONE_REGEX = "(84|0[3|5|7|8|9])+([0-9]{8})\\b";


    public int checkAge(){
        Scanner inputAge = new Scanner(System.in);
        int age;
        while (true) {
            try {
                age = Integer.parseInt(inputAge.nextLine());
                if(age >= 0 && age <= 100){
                    break;
                }else {
                    System.err.println("Age must from 0 to 100!");
                }
            }catch (Exception e){
                System.err.println("Age must is a Integer!");
            }
        }
        return age;
    }

    public boolean checkRegexPhoneNumber(String input){
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public String checkPhoneNumber(){
        Scanner inputPhoneNumber = new Scanner(System.in);
        String phoneNumber = "";
        while (!checkRegexPhoneNumber(phoneNumber)) {
            try {
                phoneNumber = inputPhoneNumber.nextLine();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return phoneNumber;
    }


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

    public boolean checkStatus(){
        Scanner inputStatus = new Scanner(System.in);
        boolean status = false;
        while (true){
            status = inputStatus.nextBoolean();
            if (status){
                break;
            }else {
                System.err.println("Shipper is now free");
            }
        }
        return status;
    }

}
