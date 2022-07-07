import javax.swing.*;
/*
if condition:
    if(condition){
        Instruction1
    }
    else{
        Instruction2
    }
 */
public class IfElse {
    public static void main(String[] args) {
        int num,data=5;
        num= Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));

        if (num==data){ // == is conditional equal, = is to assign data
            JOptionPane.showMessageDialog(null,"The number is equal to 5");
        }else {
            JOptionPane.showMessageDialog(null,"The number is not equal to 5");
        }

        if (num>data){
            JOptionPane.showMessageDialog(null,"The number is major to 5");
        }else {
            JOptionPane.showMessageDialog(null,"The number is minor to 5");
        }
        /*
         other options for conditions
          '!=' is different
          '>'  major to
          '>=' major equal to
          '<'  minor to
          '<=' minor equal to
         */
    }
}
