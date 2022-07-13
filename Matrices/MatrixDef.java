import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

//Matrix
//is a bi-dimensional array, need to be the same type on both dimensions, on java is an array of an array, like vertical array with horizontal arrays
public class MatrixDef {
    public static void main(String[] args) {
        // declare
        Scanner input = new Scanner(System.in);
        int [][] b={{1,2,3},
                    {4,5,6},
                    {7,8,9}};
        int nRows,nCol;

        for (int[] i:b) {
            System.out.println(Arrays.toString(i));
        }

        nRows=Integer.parseInt(JOptionPane.showInputDialog("Enter the # of Rows: "));
        nCol=Integer.parseInt(JOptionPane.showInputDialog("Enter the # of Columns: "));

        int [][] a=new int[nRows][nCol];

        for (int i=0;i<nRows;i++){
            for (int j=0;j<nCol;j++){
                System.out.print("Enter Value of"+"["+i+"]"+"["+j+"]:");
                a[i][j]= input.nextInt();
            }
        }
        for (int[] i:a) {
            System.out.println(Arrays.toString(i));
        }
    }
}
