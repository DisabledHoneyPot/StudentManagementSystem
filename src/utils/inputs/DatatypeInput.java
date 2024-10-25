package utils.inputs;
import java.util.Scanner;

public class DatatypeInput {
    private Scanner inputScanner = new Scanner(System.in);
    public DatatypeInput(){
    }
    public DatatypeInput DisplayPrompt(String inputString){
        System.out.print(inputString);
        return this;
    };
    public String returnString(){
        return inputScanner.nextLine();
    }

    public Boolean returnBoolean(){
        return inputScanner.nextBoolean();
    }

    public int returnInt(){
        return inputScanner.nextInt();
    }

    public double returnDouble(){
        return inputScanner.nextDouble();
    }

    public float returnFloat(){
        return inputScanner.nextFloat();
    }

    public long returnLong(){
        return inputScanner.nextLong();
    }

    public short returnShort(){
        return inputScanner.nextShort();
    }

    public void closeScanner(){
        inputScanner.close();
    }
}
