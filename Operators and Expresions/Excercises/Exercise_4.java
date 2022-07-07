import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args) {
        final int BaseSalary= 1000;
        int CarsSold;
        float CostCar,Salary;

        Scanner input= new Scanner(System.in);
        System.out.print("Please enter the Quantity of Cars sold: ");
        CarsSold = input.nextInt();
        System.out.print("\nPlease enter the average price of all Cars sold: ");
        CostCar = input.nextFloat();

        Salary = BaseSalary + 150*CarsSold + (0.05f*CostCar*CarsSold);
        System.out.print("\nTotal of Salary: "+Salary);
    }
}
