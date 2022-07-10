import javax.swing.*;

public class Exercise_12 {
    public static void main(String[] args) {
        int a;
        a= Integer.parseInt(JOptionPane.showInputDialog("Enter a grade: "));
        /*
        if (a<11 && a>8){
            JOptionPane.showMessageDialog(null,"The grade is outstanding: "+a);
        }else if (a<9 && a>6){
            JOptionPane.showMessageDialog(null,"The grade is remarkable: "+a);
        }else if (a<7 && a>4){
            JOptionPane.showMessageDialog(null,"The grade is good: "+a);
        }else if (a<5 && a>2) {
            JOptionPane.showMessageDialog(null, "The grade is enough: " + a);
        }else if (a<3 && a>=0) {
            JOptionPane.showMessageDialog(null, "The grade is not enough: " + a);
        }else{
            JOptionPane.showMessageDialog(null, "The grade is invalid: " + a);
        }
         */
        switch (a){
            case 0:
            case 1:
            case 2:
            case 3:
                JOptionPane.showMessageDialog(null, "The grade is not enough: " + a);
                break;
            case 4:
            case 5:
                JOptionPane.showMessageDialog(null, "The grade is enough: " + a);
                break;
            case 6:
            case 7:
                JOptionPane.showMessageDialog(null, "The grade is good: " + a);
                break;
            case 8:
            case 9:
                JOptionPane.showMessageDialog(null, "The grade is remarkable: " + a);
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "The grade is outstanding: " + a);
                break;
            default:
                JOptionPane.showMessageDialog(null, "The grade is invalid: " + a);
                break;
        }
    }
}
