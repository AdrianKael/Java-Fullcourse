import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        float Guillermo,Luis,Juan,total;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Quantity of Money that Guillermo has: ");
        Guillermo=input.nextFloat();
        Luis= Guillermo/2; //Luis has half of Guillermo's Money
        Juan = Luis/2 + Guillermo/2; // Juan has the half of Guillermo's and Juan's Money

        total= Guillermo+Luis+Juan;// Summation all of them

        System.out.println("\nGuillermo has: "+Guillermo+" Luis has:"+Luis+" Juan has: "+Juan);
        System.out.println("The 3 has in total: "+total);
    }
}
