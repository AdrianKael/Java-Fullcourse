import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

// SELECTION SORT
/*
    1. Search min element of the Array
    2. Swap min with the first element of the Array
    3. Search the second min element of the Array
    4. Swap with the second element of the Array
    5. Repeat with next min to next element of the Array
 */
public class SelectionSort {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int nElements,min,aux;
        nElements=Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity of elements desired for the array"));
        int [] a = new int[nElements];

        for (int i=0;i<nElements;i++){
            System.out.print("\n"+(i+1)+". Enter the Number: ");
            a[i]= input.nextInt();
        }

        // SELECTION SORT
        for (int i=0;i<nElements;i++){
            min = i; //starts pointing to position 0 of array
            for(int j=i+1;j<nElements;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            aux=a[i];
            a[i]=a[min];
            a[min]=aux;
        }

        System.out.println(Arrays.toString(a));
    }
}
