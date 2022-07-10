import javax.swing.*;

public class Exercise_10 {
    public static void main(String[] args) {
        int a,b,c;

        a=Integer.parseInt(JOptionPane.showInputDialog("Enter the Day: "));
        b=Integer.parseInt(JOptionPane.showInputDialog("Enter the Month: "));
        c=Integer.parseInt(JOptionPane.showInputDialog("Enter the Year: "));

        if(b==2 && a>28){
            JOptionPane.showMessageDialog(null,"Day not Valid for month");
        }else if ((b==3 || b==5 || b==7 ||b==8||b==10||b==12)){
            if(a<31 && a>1){
                JOptionPane.showMessageDialog(null,"Day not Valid for month");
            }else{
                JOptionPane.showMessageDialog(null,"The Date is Valid: "+a+"/"+b+"/"+c);
            }
        }else if(a<30 && a>1){
            JOptionPane.showMessageDialog(null,"The Date is Valid: "+a+"/"+b+"/"+c);
        }else{
            JOptionPane.showMessageDialog(null,"Day not Valid for month");
        }
    }
}
