import javax.swing.*;

public class Exercise_14 {
    public static void main(String[] args) {
        int options;
        float input;

        options = Integer.parseInt(JOptionPane.showInputDialog("Change Kg to: "+
                "\n1. Pounds"+
                "\n2. Grams"+
                "\n3. Milligrams"));
        input = Integer.parseInt(JOptionPane.showInputDialog("Enter the Kg to convert: "));
        switch (options){
            case 1:
                input/= 0.4535f;
                JOptionPane.showMessageDialog(null,"Pounds: "+input);
                break;
            case 2:
                input*= 1000;
                JOptionPane.showMessageDialog(null,"Grams: "+input);
                break;
            case 3:
                input*= 1000000;
                JOptionPane.showMessageDialog(null,"Milligrams: "+input);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Invalid Option: "+options);
                break;
        }
    }
}
