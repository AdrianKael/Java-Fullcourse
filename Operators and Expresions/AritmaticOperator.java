import java.util.Scanner;

public class AritmaticOperator {
    public static void main(String[] args) {
        Scanner enter= new Scanner(System.in);
        float num1,num2,sum,subs,multi,div,rest;

        System.out.println("Enter 2 numbers:");

        num1= enter.nextFloat();
        num2= enter.nextFloat();

        sum= num1+num2;
        subs= num1-num2;
        multi= num1 * num2;
        div= num1/num2;
        rest= num1%num2;

        System.out.println("The Sum is:" +sum);
        System.out.println("The Subs is:" +subs);
        System.out.println("The multi is:" +multi);
        System.out.println("The div is:" +div);
        System.out.println("The rest is:" +rest);
    }
}
