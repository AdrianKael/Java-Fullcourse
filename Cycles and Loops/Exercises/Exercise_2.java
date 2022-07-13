import javax.swing.*;

public class Exercise_2 {
    public static void main(String[] args) {
        int input;
        do {
            input=Integer.parseInt(JOptionPane.showInputDialog("Enter a Number:"));
            if (input >0 ) {
                JOptionPane.showMessageDialog(null,"The number is positive");
            }else if(input<0) {
                JOptionPane.showMessageDialog(null,"The number is negative");
            }else{
                break;
            }
        }while(input>0 || input<0);
    }
}
