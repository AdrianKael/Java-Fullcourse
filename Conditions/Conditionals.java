import javax.swing.*;

/*
    Conditionals
        value= (condition) ? valor1:valor2;  //also known as the one line if else
 */
public class Conditionals {
    public static void main(String[] args) {
        int num;
        String msg;

        num=Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));

        msg = (num%2==0) ? "It's even":"It's odd";

        //JOptionPane.showMessageDialog(null,msg);
        JOptionPane.showMessageDialog(null,(num%2==0) ? "It's even":"It's odd"); //also could be used inside classes
    }
}
