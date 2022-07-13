package ClassObj;

public class Auto {
    //Attributes
    String Color;
    String Branch;
    int Km;

    //Method main
    public static void main(String[] args) {
        Auto Car1=new Auto();
        Car1.Color = "White";
        Car1.Branch= "Audi";
        Car1.Km=0;

        System.out.println("The Color of the Car1 is: "+Car1.Color);
        System.out.println("The Branch of the Car1 is: "+Car1.Branch);
        System.out.println("The Km of the Car1 is: "+Car1.Km);

        Auto Car2=new Auto();

        Car2.Color="Red";
        Car2.Branch="Ferrari";
        Car2.Km=0;

        System.out.println("\nThe Color of the Car1 is: "+Car2.Color);
        System.out.println("The Branch of the Car1 is: "+Car2.Branch);
        System.out.println("The Km of the Car1 is: "+Car2.Km);
    }
}
