import java.util.Scanner;

public class Exercise_7 {
    public static void main(String[] args) {
        //Declare Variables
        int TotalHours,Weeks,Days,Hours;        //Scanner to get Data
        Scanner input = new Scanner(System.in);
        //Get data and save
        System.out.print("Enter total Hours to convert: ");
        TotalHours= input.nextInt();
        //Calculate Weeks, Days and Hours
        Weeks = TotalHours/168; //168 is the total hours in a week
        Days = (TotalHours%168)/24; // '%' will get me the hours left that are not enough to be a week, 24 is total hours in a day
        Hours = (TotalHours%168)%24; // '%' will get me first hours that are not weeks then hours that are not days.
        //Print the result
        System.out.println("\nTotal Weeks are: "+Weeks+ "\nTotal Days are: "+Days+"\nTotal Hours are: "+Hours);
    }
}
