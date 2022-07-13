package Polymorphism;

public class VanCar extends Auto{
    //Attributes:
    private int Load;

    //Methods

    public VanCar(String registration, String brand, String model, int load) {
        super(registration, brand, model);
        Load = load;
    }

    public int getLoad() {
        return Load;
    }

    public String DisplayData() {
        return ("The Registration is: "+Registration+"\nThe Brand is: "+Brand+"\nThe Model is: "+Model+"\nThe Load is: "+Load);
    }
}
