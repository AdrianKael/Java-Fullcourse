import java.util.Scanner;

public class Exercise_8 {
    public static void main(String[] args) {
        //Declare the variables
        double a,b,c,NegativeResult,PositiveResult;
        //Scanner to Get data
        Scanner input = new Scanner(System.in);
        //Get data and save
        System.out.print("Enter the value of a: ");
        a=input.nextDouble();
        System.out.print("Enter the value of b: ");
        b=input.nextDouble();
        System.out.print("Enter the value of c: ");
        c=input.nextDouble();
        //Calculate the Problem and save
        NegativeResult =(-b-Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
        PositiveResult =(-b+Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
        //Print the results
        System.out.println("The Negative Result is: "+NegativeResult);
        System.out.println("The Positive Result is: "+PositiveResult);
    }
}
