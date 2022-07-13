package ClassObj;

public class in {
    public static void main(String[] args) {
        Overload p1 = new Overload("Adrian",26); // depends on the quantity of Arguments and also the Types to sent to correct Method
        p1.Run();

        Overload p2 = new Overload("8189972");
        p2.Run(100);
    }
}
