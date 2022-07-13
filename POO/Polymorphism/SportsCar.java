package Polymorphism;

public class SportsCar extends Auto{
    // Attribute
    private int Displacement;

    //Methods

    public SportsCar(String registration, String brand, String model, int displacement) {
        super(registration, brand, model);
        Displacement = displacement;
    }

    public int getDisplacement() {
        return Displacement;
    }
    public String DisplayData(){
        return ("The Registration is: "+Registration+"\nThe Brand is: "+Brand+"\nThe Model is: "+Model+"\nThe Displacement is: "+Displacement);
    }
}
