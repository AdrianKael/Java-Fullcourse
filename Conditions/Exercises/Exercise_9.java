import javax.swing.*;

public class Exercise_9 {
    public static void main(String[] args) {
        int a,b,c;

        a=Integer.parseInt(JOptionPane.showInputDialog("Enter the Day: "));
        b=Integer.parseInt(JOptionPane.showInputDialog("Enter the Month: "));
        c=Integer.parseInt(JOptionPane.showInputDialog("Enter the Year: "));

        if(a>30 || a<1){
            JOptionPane.showMessageDialog(null,"Day not Valid");
        }else if (b>12 || b<1){
            JOptionPane.showMessageDialog(null,"Month not Valid");
        }else{
            JOptionPane.showMessageDialog(null,"The Date is Valid: "+a+"/"+b+"/"+c);
        }
    }
}
