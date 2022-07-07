import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        float HoursWeek,SalaryHour,SalaryWeek;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the Hours per Week and the Payment per Hour: ");
        HoursWeek = input.nextFloat();
        SalaryHour = input.nextFloat();

        SalaryWeek = SalaryHour * HoursWeek;

        System.out.print("The Salary per Week is: "+SalaryWeek);
    }
}
