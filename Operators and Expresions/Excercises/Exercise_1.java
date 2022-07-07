import java.awt.*;
import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        float grade1,grade2,grade3,sum; // declare of variables
        Scanner enter = new Scanner(System.in);

        //Ask for 3 grades and save them on each variable
        System.out.println("Enter 3 Grades: ");
        grade1 = enter.nextFloat();
        grade2 = enter.nextFloat();
        grade3 = enter.nextFloat();

        sum = grade1+grade2+grade3; //add 3 grades into summation

        System.out.println("The Summation is: "+sum);
    }
}
