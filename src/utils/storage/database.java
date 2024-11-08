package utils.storage;
import java.util.ArrayList;
import utils.properties.Student;
import utils.inputs.StudentInput;
public class database{
    private static ArrayList<Student> students = new ArrayList<Student>();
    StudentInput stdinp = new StudentInput();
    public void addStudent() {
        Student student = new Student(stdinp.promptFirstName(), stdinp.promptLastName(), stdinp.promptDOBDate(), stdinp.promptCountry(), stdinp.promptSID(), stdinp.promptGrade(), stdinp.promptClass(), stdinp.promptAddress());
        this.students.add(student);
    }

    public void retrieveStudents(){
        for(Student student: students){
            System.out.println("Student ID: " + student.getsID());
            System.out.println("First Name: " + student.getFirstName());
            System.out.println("Last Name: " + student.getLastName());
            System.out.println("Date of Birth: " + student.getDOB());
            System.out.println("Country: " + student.getCountry());
            System.out.println("Grade: " + student.getGrade());
            System.out.println("Class: " + student.getStudentClass());
            System.out.println("Address: " + student.getAddress());
        }
    }

    public void deleteStudent(String sID)


}
