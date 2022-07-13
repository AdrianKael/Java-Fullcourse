package ClassObj;

import javax.swing.*;

public class MMain {
    public static void main(String[] args) {
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));

        Operat ope = new Operat();

        ope.Summation(n1,n2);
        ope.Subtraction(n1,n2);
        ope.Multiplication(n1,n2);
        ope.Division(n1,n2);

        ope.DisplayResults();
    }
}
