import javax.swing.*;

public class Exercise_2 {
    public static void main(String[] args) {
        int a,b;

        a=Integer.parseInt(JOptionPane.showInputDialog("Enter the First Number: "));
        b=Integer.parseInt(JOptionPane.showInputDialog("Enter the Second Number: "));

        if(a>b){
            JOptionPane.showMessageDialog(null,"The number: "+a+" It's Bigger than Second Number: "+b);
        } else if (b>a) {
            JOptionPane.showMessageDialog(null,"The number: "+b+" It's Bigger than Second Number: "+a);
        }else{
            JOptionPane.showMessageDialog(null,"The number: "+a+" It's Equal to Second Number: "+b);
        }
    }
}
