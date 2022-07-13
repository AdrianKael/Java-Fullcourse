import java.util.Scanner;

/*
    Cycle While

    while(condition){
        Instructions;
    }
 */
public class Cycles {
    public static void main(String[] args) {
        int i=1,cont;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many numbers display on screen: ");
        cont= input.nextInt();

        while(i<=cont){
            System.out.print("\n"+i); //1 2 ... 10
            i++;
        }
    }
}
