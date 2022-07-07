import javax.swing.*;

public class Exercise_3 {
    public static void main(String[] args) {
        char letter;

        letter= JOptionPane.showInputDialog("Enter a Character: ").charAt(0);

        if(Character.isUpperCase(letter)){
            JOptionPane.showMessageDialog(null,"The character: "+letter+" It's Uppercase");
        }else{
            JOptionPane.showMessageDialog(null,"The character: "+letter+" It's Lowercase");
        }
    }
}
