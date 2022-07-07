import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) {
        float Participation,FirstExam, SecondExam,FinalExam, FinalGrade;

        Scanner input = new Scanner(System.in); //Receive the necessary data

        //ask for the data and save it
        System.out.print("Enter the Participation note: ");
        Participation = input.nextFloat();
        System.out.print("\nEnter the note of the First Exam: ");
        FirstExam= input.nextFloat();
        System.out.print("\nEnter the note of the Second Exam: ");
        SecondExam = input.nextFloat();
        System.out.print("\nEnter the note of the Final Exam: ");
        FinalExam = input.nextFloat();
        // calculate the final grade and save on variable
        FinalGrade = ((0.10f*Participation)+(0.25f*FirstExam)+(0.25f*SecondExam)+(0.4f*FinalExam));
        // Display the final grade
        System.out.print("The Final Grade is: "+FinalGrade);
    }
}
