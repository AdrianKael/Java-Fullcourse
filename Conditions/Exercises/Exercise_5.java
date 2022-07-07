import javax.swing.*;

public class Exercise_5 {
    public static void main(String[] args) {
        int Hours;
        float Salary;

        Hours= Integer.parseInt(JOptionPane.showInputDialog("Enter The Hours Worked: "));

        if(Hours<=40){
            Salary = Hours*16;
        }else {
            Salary =(Hours-40)*20+(40*16);
        }
        JOptionPane.showMessageDialog(null,"The Salary is :"+Salary);
    }
}
