import javax.swing.*;

public class Exercise_6 {
    public static void main(String[] args) {
        int a,b;
        String result;
        a= Integer.parseInt(JOptionPane.showInputDialog("Enter the first Number: "));
        b= Integer.parseInt(JOptionPane.showInputDialog("Enter the second Number: "));
        EvenOdd(a);
        EvenOdd(b);
    }
    public static void EvenOdd(int a){
        if (a%2==0){
            JOptionPane.showMessageDialog(null,"The Number:" +a +" is even");
        }else{
            JOptionPane.showMessageDialog(null,"The Number:" +a +" is odd");
        }
    }
}
