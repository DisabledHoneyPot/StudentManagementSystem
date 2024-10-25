package utils.inputs;

import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import utils.inputs.DatatypeInput;

public class StudentInput{
  public static void main(){
    String firstName = promptFirstName();
    String lastName = promptLastName();
    int age = promptAge();
    String sID = promptSID();
    Date dobDate = promptDOBDate();
  }


  public static String promptFirstName(){
    Scanner inputScanner = new Scanner(System.in);
    System.out.print("Please enter student first name: ");
    String firstName = inputScanner.nextLine();
    return firstName;
  }

  public static String promptLastName(){
    Scanner inputScanner = new Scanner(System.in);
    System.out.print("Please enter student last name: ");
    String lastName = inputScanner.nextLine();
    return lastName;
  }

    public static int promptAge(){
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Please enter student age: ");
        int age = inputScanner.nextInt();
        return age;
    }


    public static String promptSID(){
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Please enter student ID: ");
        String sID = inputScanner.nextLine();
        return sID;
    }

    public static Date promptDOBDate(){
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Please enter student's date of birth: ");
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String dob = inputScanner.nextLine();
        Date formattedDate = null;
        try{
            formattedDate = format.parse(dob);
        }catch (Exception e){
            System.err.println("Error in inputting date");
        }
        return formattedDate;
    }

}
