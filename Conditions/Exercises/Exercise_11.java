import javax.swing.*;
import java.util.Locale;

public class Exercise_11 {
    public static void main(String[] args) {
        int a,b;
        float result;
        char operation;

        operation= JOptionPane.showInputDialog("Enter The operation desired: ").charAt(0);
        operation= Character.toLowerCase(operation);
        a=Integer.parseInt(JOptionPane.showInputDialog("Enter the first number: "));
        b=Integer.parseInt(JOptionPane.showInputDialog("Enter the second number: "));

        switch (operation){
            case ('s'):
                result=a+b;
                JOptionPane.showMessageDialog(null,"The result is: "+result);
                break;
            case ('r'):
                result=a-b;
                JOptionPane.showMessageDialog(null,"The result is: "+result);
                break;
            case ('p'):
            case ('m'):
                result=a*b;
                JOptionPane.showMessageDialog(null,"The result is: "+result);
                break;
            case ('d'):
                result=(float) a/b;
                JOptionPane.showMessageDialog(null,"The result is: "+result);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Invalid operation");
                break;
        }
    }
}
