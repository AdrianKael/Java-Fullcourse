import javax.swing.*;

public class Exercise_1 {
    public static void main(String[] args) {
        int num;

        num=Integer.parseInt(JOptionPane.showInputDialog("Enter a Number: "));

        JOptionPane.showMessageDialog(null,(num%10==0) ? "It's multiple of 10":"It's not multiple of 10");
    }
}
