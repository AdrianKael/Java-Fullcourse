package ClassObj;

import javax.swing.*;

public class Operation_Methods {
    //Attributes
    int num1;
    int num2;
    int add;
    int sub;
    int mult;
    int div;

    //Methods
    // Create a method to ask the user to enter 2 numbers
    public void ReadNumbers() {
        num1=Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
    }

    public void Summation(){
        add=num1+num2;
    }

    public void Subtraction(){
        sub=num1-num2;
    }

    public void Multiplication(){
        mult=num1*num2;
    }
    public void Division(){
        div=num1/num2;
    }
    public void DisplayResults(){
        System.out.println("The Summation is :"+add);
        System.out.println("The Subtraction is :"+sub);
        System.out.println("The Multiplication is :"+mult);
        System.out.println("The Division is :"+div);
    }
}

