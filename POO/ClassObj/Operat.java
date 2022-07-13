package ClassObj;

import javax.swing.*;

public class Operat {
    /*Attributes
        int num1; // Global Parameters
        int num2; // Global Parameters
     */
    int add;
    int sub;
    int mult;
    int div;

    //Methods
    public void Summation(int num1,int num2){
        add=num1+num2; //local Parameters
    }

    public void Subtraction(int num1,int num2){
        sub=num1-num2;
    }

    public void Multiplication(int num1,int num2){
        mult=num1*num2;
    }
    public void Division(int num1,int num2){
        div=num1/num2;
    }
    public void DisplayResults(){
        System.out.println("The Summation is :"+add);
        System.out.println("The Subtraction is :"+sub);
        System.out.println("The Multiplication is :"+mult);
        System.out.println("The Division is :"+div);
    }
}
