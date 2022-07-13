package Polymorphism;

public class TouristCar extends Auto{
    //Attributes
    private int nDoors;

    public TouristCar(String registration, String brand, String model, int nDoors) {
        super(registration, brand, model);
        this.nDoors = nDoors;
    }

    public int getnDoors() {
        return nDoors;
    }

    //Methods:
    public String DisplayData(){
        return ("The Registration is: "+Registration+"\nThe Brand is: "+Brand+"\nThe Model is: "+Model+"\nThe # of Doors are: "+nDoors);
    }
}
