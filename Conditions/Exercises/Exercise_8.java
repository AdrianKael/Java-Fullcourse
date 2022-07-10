import javax.swing.*;

public class Exercise_8 {
    public static void main(String[] args) {
        int a;
        String num;
        a= Integer.parseInt(JOptionPane.showInputDialog("Please Enter a number between 0 - 99999"));

        if (a<0 || a>99999){
            JOptionPane.showMessageDialog(null,"Error Number not between 0 - 99999");
        }else{
            num = String.valueOf(a);
            JOptionPane.showMessageDialog(null,"The number has: "+num.length()+" digits");
        }

    }
}
