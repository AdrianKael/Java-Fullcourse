package ClassObj;

public class Main {
    public static void main(String[] args) {
        Operation_Methods op = new Operation_Methods(); //call java class on same package to create an object
        //Methods of the Class Operation_Methods
        op.ReadNumbers();
        op.Summation();
        op.Subtraction();
        op.Multiplication();
        op.Division();
        op.DisplayResults();
    }
}
