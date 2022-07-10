import javax.swing.*;

public class Exercise_13 {
    public static void main(String[] args) {
        final int base=1000;
        int input;
        int in;
        in = Integer.parseInt(JOptionPane.showInputDialog("Enter the operation desired:"
                +"\n1. Deposit Money"
                +"\n2. Withdraw Money"
                +"\n3. Close the program"));
        input = Integer.parseInt(JOptionPane.showInputDialog("Enter the money desired: "));
        switch (in){
            case 1:
                input+= base;
                JOptionPane.showMessageDialog(null,"The money in the account now is: "+input);
                break;
            case 2:
                if (input<base){
                    input-= base;
                    JOptionPane.showMessageDialog(null,"The money in the account now is: "+input);
                    break;
                }else {
                    JOptionPane.showMessageDialog(null,"The money in the account is not enough: "+base +"To withdrawal "+input);
                    break;
                }
            case 3:
                JOptionPane.showMessageDialog(null,"Closed");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Invalid Operation "+input);
                break;
        }
    }
}
