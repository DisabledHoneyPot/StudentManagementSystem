package utils.properties;
import java.util.Date;

public class Student extends Person implements ContactInfo{

  private String sID;
  private String Grade;
  private String StudentClass;
  private String email;
  private String PhoneNumber;
  private String Address;

  public Student(String firstName, String lastName,String DOB ,String country ,String sID, String Grade, String StudentClass, String Address){
    super(DOB,firstName,lastName,country);
    this.sID = sID;
    this.Grade = Grade;
    this.StudentClass = StudentClass;
    this.Address = Address;

  }
  
  public String getsID(){
    return this.sID;
  }

  public String getGrade(){
    return this.Grade;
  }

  public String getStudentClass(){
    return this.StudentClass;
  }

  public String getAddress(){
    return this.Address;
  }

  @Override
  public String getEmail(){
    return this.email;
  }
  
  @Override
  public String getPhoneNumber(){
    return this.PhoneNumber;
  }

  public void setsID(String sID){
    this.sID = sID;
  }

  public void setGrade(String Grade){
    this.Grade = Grade;
  }

  public void setStudentClass(String StudentClass){
    this.StudentClass = StudentClass;
  }

  public void setAddress(String Address){
    this.Address = Address;
  }
  
  @Override
  public void setEmail(String email){
    this.email = email;
  }

  @Override
  public void setPhoneNumber(String phoneNumber){
    this.PhoneNumber = phoneNumber;
  }
}
