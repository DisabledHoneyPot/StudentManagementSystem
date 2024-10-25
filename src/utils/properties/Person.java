package utils.properties;


import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.Year;

public class Person{

  private String DOB;
  private String firstName;
  private String lastName;
  private String country;

  public Person(String DOB, String firstName, String lastName, String country){
    this.DOB = DOB;
    this.firstName = firstName;
    this.lastName = lastName;
    this.country = country;
  }

  public String getFirstName(){
    return firstName;
  }

  public String getLastName(){
    return lastName;
  } 

  public void setFirstName(String NewName){
    this.firstName = NewName;
  }

  public void setLastName(String NewName){
    this.firstName = NewName;
  }

  public String getDOB(){
    return DOB;
  }

  public String getCountry(){
    return country;
  }

  public void setDOB(String NewDOB){
    SimpleDateFormat dobStringFormat = new SimpleDateFormat("dd/MM/yyyy");
    try{
      Date d1 = dobStringFormat.parse(NewDOB);
      String dobString = dobStringFormat.format(d1);
      this.DOB = dobString;
    } catch(ParseException pe){
      pe.printStackTrace();
    } 
  }
  
  public void setCountry(String NewCountry){
    this.country = NewCountry;
  }

  public int getAge(){
    return Year.now().getValue() - Integer.valueOf(this.DOB.split("/")[2]); 
  }
}
