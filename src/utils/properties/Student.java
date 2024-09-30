package properties;
import properties.Person;
import properties.ContactInfo;

class Student extends Person implements ContactInfo{

  private String sID;
  private String Grade;
  private String StudentClass;
  private String Email;
  private String PhoneNumber;
  private String Address;

  public Student(String sID, String Grade, String StudentClass, String Address){
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
    return this.Email;
  }
  
  @Override
  public String getPhoneNumber(){
    return this.PhoneNumber;
  }

  public void setsID(String sID){
    this.sID = sID;
  }

  public void setGrade(int Grade){
    this.Grade = Grade;
  }

  public void setStudentClass(String StudentClass){
    this.StudentClass = StudentClass;
  }

  public void setAddress(String Address){
    this.Address = Address;
  }
  
  @Override
  public void setEmail(String Email){
    this.Email = Email;
  }

  @Override
  public void setPhoneNumber(String PhoneNumber){
    this.PhoneNumber = PhoneNumber;
  }
}
