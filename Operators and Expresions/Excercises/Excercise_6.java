import java.util.Scanner;

public class Excercise_6 {
    public static void main(String[] args) {
        //Declare variables
        double a,b,Result;
        //Input values
        Scanner input = new Scanner(System.in);
        //Ask for values and save
        System.out.print("Enter the value of a: ");
        a=input.nextFloat();
        System.out.print("\nEnter the value of b: ");
        b=input.nextFloat();
        //Calculate the problem
        Result = Math.pow(a,2)+Math.pow(b,2)+2*a*b;
        //Print the result
        System.out.print("\nThe result of (a+b)^2 is: "+Result);
    }
}
