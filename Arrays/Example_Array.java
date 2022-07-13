import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Example_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nElements;

        nElements = Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity of characters desired:"));

        char[] letters = new char[nElements];

        JOptionPane.showMessageDialog(null,"Enter the characters of the Array");
        for (int i =0;i<nElements;i++){
            System.out.print("\n"+(i+1)+". Enter the character: ");
            letters[i]= input.next().charAt(0);
        }

        System.out.println("The Array is:"+ Arrays.toString(letters));
    }
}
