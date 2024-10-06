package utils.inputs;

import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class StudentInput{

  public static void main(String[] args){
    Scanner inputScanner = new Scanner(System.in);
    System.out.print("Please enter student first name: ");
    String firstName = inputScanner.nextLine();
    System.out.print("Please enter student last name: ");
    String lastName = inputScanner.nextLine();
    System.out.print("Please enter student age: ");
    int age = inputScanner.nextInt();
    System.out.print("Please enter student's date of birth: ");
    DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    String dob = inputScanner.nextLine();
    try{
     //formattedDate = format.parse(dob);
    }catch (Exception e){
      System.err.println("Error in inputting date");
    }
    System.out.print("Please enter student ID: ");
    String sID = inputScanner.nextLine();
    System.out.print("Please enter student score: ");
    float Score = inputScanner.nextFloat();
    
    System.out.println("Student Info");
    System.out.println("First name: "+ firstName);
    System.out.println("Last name: "+lastName);
    System.out.println("Age: "+ age);
    System.out.println("DoB: "+ dob);
    System.out.println("Student ID: "+sID);
    System.out.println("Score: "+Score);
  }
}
