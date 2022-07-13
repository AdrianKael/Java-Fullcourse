import javax.swing.*;

// SEQUENTIAL SEARCH
// find a specific data in an Array sorted or not
// Array= [3,1,2,5,4]; data=2;
public class SequentialSearch {
    public static void main(String[] args) {
        int []a = {4,1,5,2,3};
        int data;
        boolean flag=false;

        data= Integer.parseInt(JOptionPane.showInputDialog("Enter the data to search on Array"));

        // SEQUENTIAL SEARCH
        for (int i=0;i<a.length;i++){
            if (data==a[i] && !flag){
                flag=true;
                i=a.length; // just to exit for the for quicker
            }
        }
        if(flag){
            JOptionPane.showMessageDialog(null,"The number is on the Array");
        }else{
            JOptionPane.showMessageDialog(null,"The number is not on the Array");
        }
    }
}
