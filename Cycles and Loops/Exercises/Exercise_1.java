import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        int input,i=0;
        double result;
        while (i<1){
            Scanner in = new Scanner(System.in);
            System.out.print("\nEnter a number to get the square: ");
            input= in.nextInt();
            if (input>0){
                result= Math.pow(input,2);
                System.out.print("\nValid number, Square of "+input+" is: "+result);
            }else{
                System.out.print("\nInvalid number, negative number: "+input);
                i++;
            }
        }
    }
}
