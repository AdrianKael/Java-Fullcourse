import com.sun.source.tree.CaseTree;

import javax.swing.*;

/*
Multiple conditional or Switch
    Switch(){
        case 1: Instruction1;
                break;
        case 2: Instruction2;
                break;
        .........
        case n: InstructionN;
                break;
        default: Contrarytoallcases;
                break;
    }
 */
public class Switch {
    public static void main(String[] args) {
        int data;

        data= Integer.parseInt(JOptionPane.showInputDialog("Enter a number between 1 and 5: "));

        switch(data){
            case 1: JOptionPane.showMessageDialog(null,"This is the number 1");
                    break; // needed to end the condition
            case 2: JOptionPane.showMessageDialog(null,"This is the number 2");
                    break;
            case 3: JOptionPane.showMessageDialog(null,"This is the number 3");
                    break;
            case 4: JOptionPane.showMessageDialog(null,"This is the number 4");
                    break;
            case 5: JOptionPane.showMessageDialog(null,"This is the number 5");
                    break;
            default: JOptionPane.showMessageDialog(null,"The number is not between 1 to 5");
                    break; //could not be a break for default, better always use it
        }
    }
}
