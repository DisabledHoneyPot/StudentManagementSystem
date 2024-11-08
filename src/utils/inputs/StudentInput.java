package utils.inputs;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import helpers.formats.DateTimeFormat;
import utils.inputs.DatatypeInput;

public class StudentInput{
  private static DatatypeInput dtInput = new DatatypeInput();

  public static String promptFirstName(){
    return dtInput.DisplayPrompt("Please enter student's first name: ").returnString();
  }

  public static String promptLastName(){
    return dtInput.DisplayPrompt("Please enter student's last name: ").returnString();
  }

  public static int promptAge(){
    return dtInput.DisplayPrompt("Please enter student's age: ").returnInt();
  }


  public static String promptSID(){
    return dtInput.DisplayPrompt("Please enter student's ID: ").returnString();
  }

  public static String promptDOBDate(){

      DateFormat format = new SimpleDateFormat(DateTimeFormat.getDateFormat());
      String dob = dtInput.DisplayPrompt("Please enter student's date of birth in the format "+ DateTimeFormat.getDateFormat()+ ": ").returnString();
      Date formattedDate = null;
      try{
          formattedDate = format.parse(dob);
          String DateString = format.format(formattedDate);
          return DateString;
      }catch (Exception e) {
          System.err.println("Error in inputting date");
          return "";
      }
  }
  public static String promptCountry(){
      return dtInput.DisplayPrompt("Please enter student's country: ").returnString();
  }

  public static String promptGrade(){
    return dtInput.DisplayPrompt("Please enter student's grade: ").returnString();
  }

  public static String promptClass(){
    return dtInput.DisplayPrompt("Please enter student's class: ").returnString();
  }

  public static String promptAddress(){
      return dtInput.DisplayPrompt("Please enter student's address: ").returnString();
  }
}
