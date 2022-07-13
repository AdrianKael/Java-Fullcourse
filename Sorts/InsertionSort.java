import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

// INSERT SORT
// If LeftNum>NumActual then swap
// 5,3,4,1,2 check if the left num is bigger, so 5<?, no then next num, 3<5 yes so, 3,5,4,1,2 next num so, 4<5 yes, so 3,4,5,1,2, then 1<5? yes, 3,4,1,5,2......
public class InsertionSort {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int nElements,position,aux;
        nElements=Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity of elements desired for the array"));
        int [] a = new int[nElements];

        for (int i=0;i<nElements;i++){
            System.out.print("\n"+(i+1)+". Enter the Number: ");
            a[i]= input.nextInt();
        }

        // INSERT SORT

        for (int i=0;i<nElements;i++){
            position=i;
            aux=a[i];
            while((position>0)&&(a[position-1]>aux)){
                // System.out.println(i+":");
                a[position]=a[position-1];
                position--;
                a[position]=aux;
                // System.out.println(Arrays.toString(a));
            }
        }
        /*6,2,3,1,5
            1:
                while:
                    2,6,3,1,5
            2:
                while:
                    2,3,6,1,5
                    -------
            3:
                while:
                    2,3,1,6,5
                    2,1,3,6,5
                    1,2,3,6,5
            4:
                while:
                    1,2,3,5,6
         */
        System.out.println(Arrays.toString(a));
    }
}
