package ClassObj;

import javax.swing.*;

public class MMMain {
    public static void main(String[] args) {
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
        String Hi= JOptionPane.showInputDialog("Enter your name: ");

        Summ o =new Summ();

        System.out.println(o.Summa(n1,n2));
        System.out.println(o.Salute(Hi));

        int sum=o.Summa(n1,n2);
        String Hello= o.Salute(Hi);

        System.out.println("\n"+sum);
        System.out.println(Hello);
    }
}
