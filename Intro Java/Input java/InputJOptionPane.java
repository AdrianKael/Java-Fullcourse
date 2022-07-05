import javax.swing.JOptionPane;//Import needed to use JOptionPane

public class InputJOptionPane {
    public static void main(String[] args) {
        String One;
        int Two;
        char Three;
        double Four;

        One= JOptionPane.showInputDialog("Enter a String: ");
        //Two= JOptionPane.showInputDialog("Enter a number: "); // error because JOptionPane works with Strings
        Two= Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));// Integer.parseInt in order to change data Type to Integer
        Three= JOptionPane.showInputDialog("Enter a character: ").charAt(0); // needed to get a String then with charAy(0) get the first character
        Four = Double.parseDouble(JOptionPane.showInputDialog("Enter a Decimal: ")); // Double.parseDouble in order to change data Type to Double

        JOptionPane.showMessageDialog(null,"The String is: "+One); // first parameter to put parent Component
        JOptionPane.showMessageDialog(null,"The Integer is: "+Two);
        JOptionPane.showMessageDialog(null,"The Char is: "+Three);
        JOptionPane.showMessageDialog(null,"The Decimal is: "+Four);

        System.out.println(One+" "+Two+" "+Three+" "+Four);
    }
}
