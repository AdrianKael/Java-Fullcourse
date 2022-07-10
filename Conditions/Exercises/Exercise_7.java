import javax.swing.*;

public class Exercise_7 {
    public static void main(String[] args) {
        int a,b,c;

        a= Integer.parseInt(JOptionPane.showInputDialog("Enter the First number:"));
        b= Integer.parseInt(JOptionPane.showInputDialog("Enter the Second number:"));
        c= Integer.parseInt(JOptionPane.showInputDialog("Enter the Third number:"));
        //2 3 1
        if (a>=b && a>=c){
            if(b>c){
                JOptionPane.showMessageDialog(null,"Orden de mayor a menor: "+a+" "+b+" "+c);
            }else{
                JOptionPane.showMessageDialog(null,"Orden de mayor a menor: "+a+" "+c+" "+b);
            }
        }else if (b>=a && b>=c){
            if(a>c){
                JOptionPane.showMessageDialog(null,"Orden de mayor a menor: "+b+" "+a+" "+c);
            }else{
                JOptionPane.showMessageDialog(null,"Orden de mayor a menor: "+b+" "+c+" "+a);
            }
        }else if (c>=a && c>=b) {
            if (a > b) {
                JOptionPane.showMessageDialog(null, "Orden de mayor a menor: " + c + " " + a + " " + b);
            } else {
                JOptionPane.showMessageDialog(null, "Orden de mayor a menor: " + c + " " + b + " " + a);
            }
        }
    }
}
