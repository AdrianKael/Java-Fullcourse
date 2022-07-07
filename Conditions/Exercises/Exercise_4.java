import javax.sql.rowset.Joinable;
import javax.swing.*;

public class Exercise_4 {
    public static void main(String[] args) {
        float Cost,TotalCost;

        Cost = Float.parseFloat(JOptionPane.showInputDialog("Enter Cost of Bought things:"));

        if (Cost>300){
            TotalCost = Cost-(Cost*0.2f);
            JOptionPane.showMessageDialog(null,"Total Cost with discount is: "+TotalCost);
        }else{
            JOptionPane.showMessageDialog(null,"Total Cost without discount is: "+Cost);
        }
    }
}
