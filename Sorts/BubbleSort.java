import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

// THE BUBBLE SORT
// the most known and easiest of the sorts
// 4,5,2,1,3 => (4,5) check if 4>5 if yes change else nothing next number, 5>2? yes so: 4,2,5,1,3 then 5>1, so:4,2,1,5,3 then 5>3.... 4,2,1,3,5, go back to first number so: 4>2? then.... 2,1,3,4,5 then 2>1, then 2>3? no.... so 1,2,3,4,5
public class BubbleSort {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int nElements,aux;
        nElements=Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity of elements desired for the array"));
        int [] a = new int[nElements];

        for (int i=0;i<nElements;i++){
            System.out.println((i+1)+". Enter the Number: ");
            a[i]= input.nextInt();
        }

        //Bubble Sort
        for (int i=0;i<nElements-1;i++){
            for(int j=0;j<nElements-1;j++){
                if(a[j]>a[j+1]){ //if array[0]>array[1] else then next [1]>[2]
                    aux=a[j];
                    a[j]=a[j+1];
                    a[j+1]=aux;
                }// else nothing so no need to put something
            }
        }

        // show the array sorted
        System.out.println(Arrays.toString(a));
    }
}
