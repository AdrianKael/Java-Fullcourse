// Works with increasing sorted arrays
import javax.swing.*;

public class BinarySearch {
    public static void main(String[] args) {
        int []a = {1,2,3,4,5};
        int data,inf,sup,half,i;
        boolean flag=false;

        data= Integer.parseInt(JOptionPane.showInputDialog("Enter the number to search on Array"));

        // BINARY SEARCH
        inf=0;
        sup=a.length;
        i=0;
        half=(inf+sup)/2;

        while(inf<=sup && i<a.length){
            if(a[half]==data){
                flag=true;
                break;
            }else if(a[half]>data){
                sup=half;
                half=(inf+sup)/2;
            } else if (a[half]<data) {
                inf=half;
                half=(inf+sup)/2;
            }
            i++;
        }

        if(flag){
            JOptionPane.showMessageDialog(null,"The number is on the Array position: "+half);
        }else{
            JOptionPane.showMessageDialog(null,"The number is not on the Array");
        }
    }
}
