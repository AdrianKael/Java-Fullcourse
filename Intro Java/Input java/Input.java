import java.util.Scanner;//need to import this to use Scanner, also this is part of the java libraries

public class Input {
    public static void main(String[] args) {
        //Scanner is the input type
        Scanner input =new Scanner(System.in); //need to be declared this way
        char num;
        System.out.print("Enter a number/word: ");
        // num = input.nextInt(); // the method is only for Int
        // num = input.nextFloat(); // This method is for floats, also take into account we don't need to use 'f' on console
        // num = input.nextDouble(); // This method is for double
        // num = input.next(); // the method next is for Strings, but only take the fist string of characters until a blank space ' '
        // num = input.nextLine(); //this method is for strings and also get all the chain of words
        num = input.next().charAt(0); // this extra method is to take the character of the String, the 0 means that need to take the first character
        System.out.println("The number/word is: " + num);


    }
}
