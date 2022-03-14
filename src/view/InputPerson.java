package view;

import controller.PersonManager;
import model.Person;
import model.Shipper;

import java.util.List;

public class InputPerson {
    private static List<Person> personListClient = PersonManager.personList;
    public static ValidatePerson valid = new ValidatePerson();


    public static Person createNewCustomer(){

        System.out.print("Input the id customer: ");
        String id = valid.checkNullString();

        System.out.print("Input the name customer: ");
        String name = valid.checkNullString();

        System.out.print("Input the age customer: ");
        int age = valid.checkAge();

        System.out.print("Input the address customer: ");
        String address = valid.checkNullString();

        System.out.print("Input the phone number customer: ");
        String phoneNumber = valid.checkPhoneNumber();

        Person p = new Person(id, name, age, address, phoneNumber);
        return p;
    }


    public static Shipper createNewShipper(){

        System.out.print("Input the id shipper: ");
        String id = valid.checkNullString();

        System.out.print("Input the name shipper: ");
        String name = valid.checkNullString();

        System.out.print("Input the age shipper: ");
        int age = valid.checkAge();

        System.out.print("Input the address shipper: ");
        String address = valid.checkNullString();

        System.out.print("Input the phone number shipper: ");
        String phoneNumber = valid.checkPhoneNumber();

        System.out.print("Input the identityCard shipper: ");
        String identityCard = valid.checkNullString();

        System.out.print("Input the area shipper: ");
        String area = valid.checkNullString();

        System.out.print("Input the status shipper: ");
        boolean status = valid.checkStatus();

        Shipper s = new Shipper(id, name, age, address, phoneNumber, identityCard, area, status);
        return s;
    }

    public static void editPersonById(){
        System.out.print("Input Person's Id need edit: ");
        String id = valid.checkNullString();
        int check = -1;
        if(PersonManager.getPersonById(id) == check){
            System.err.println("Can't find the id!");
        }else {
            int index = PersonManager.getPersonById(id);
            if(personListClient.get(index) instanceof Person){
                System.out.println("Editing Customer...");
                System.out.println("Edit id customer: " + "(" + personListClient.get(index).getId() + ")");
                String editId = valid.checkNullString();

                System.out.println("Edit name customer: " + "(" + personListClient.get(index).getName() + ")");
                String editName = valid.checkNullString();

                System.out.println("Edit age customer: " + "(" + personListClient.get(index).getAge() + ")");
                int editAge = valid.checkAge();

                System.out.println("Edit address customer: " + "(" + personListClient.get(index).getAddress() + ")");
                String editAddress = valid.checkNullString();

                System.out.println("Edit phone number customer: " + "(" + personListClient.get(index).getPhoneNumber() + ")");
                String editPhoneNumber = valid.checkNullString();

                Person p = new Person(editId, editName, editAge, editAddress, editPhoneNumber);
                PersonManager.editPersonByIndex(index, p);
            }
            if (personListClient.get(index) instanceof Shipper){
                System.out.println("Editing Shipper...");
                System.out.println("Edit id Shipper: " + "(" + personListClient.get(index).getId() + ")");
                String editId = valid.checkNullString();

                System.out.println("Edit name Shipper: " + "(" + personListClient.get(index).getName() + ")");
                String editName = valid.checkNullString();

                System.out.println("Edit age Shipper: " + "(" + personListClient.get(index).getAge() + ")");
                int editAge = valid.checkAge();

                System.out.println("Edit address Shipper: " + "(" + personListClient.get(index).getAddress() + ")");
                String editAddress = valid.checkNullString();

                System.out.println("Edit phone number Shipper: " + "(" + personListClient.get(index).getPhoneNumber() + ")");
                String editPhoneNumber = valid.checkNullString();

                System.out.println("Edit identity card Shipper: " + "(" + ((Shipper) personListClient.get(index)).getIdentityCard() + ")");
                String editIdentityCard = valid.checkNullString();

                System.out.println("Edit area Shipper: " + "(" + ((Shipper) personListClient.get(index)).getArea() + ")");
                String editArea = valid.checkNullString();

                System.out.println("Edit status Shipper: " + "(" + ((Shipper) personListClient.get(index)).isStatus() + ")");
                boolean editStatus = valid.checkStatus();

                Shipper s = new Shipper(editId, editName, editAge, editAddress, editPhoneNumber, editIdentityCard, editArea, editStatus);
                PersonManager.editPersonByIndex(index, s);
            }
        }
    }

    public static void deletePersonByIndex(){
        System.out.println("Input Person's id need remove: ");
        String id = valid.checkNullString();
        int index = PersonManager.getPersonById(id);
        PersonManager.deletePersonByIndex(index);
    }

    public static void searchPersonByName () {
        System.out.println("Input Person's id: ");
        while (true) {
            String idPerson = valid.checkNullString();
            int index = PersonManager.getPersonById(idPerson);
            if (index == -1) {
                System.err.println("Can't find this person! Input again!");
            } else {
                System.out.println(personListClient.get(index));
                break;
            }
        }
    }
}
