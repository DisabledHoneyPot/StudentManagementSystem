import utils.inputs.StudentInput;
import utils.inputs.DatatypeInput;

public class mainProgram {
    public static void main(String[] args) {
        StudentInput studentInput = new StudentInput();
        studentInput.main();
        DatatypeInput datatypeInput = new DatatypeInput();
        datatypeInput.DisplayPrompt("Please enter a string: ").returnString();
    }
}
