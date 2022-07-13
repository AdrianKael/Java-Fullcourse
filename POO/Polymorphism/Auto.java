package Polymorphism;

public class Auto {
    //Attributes
    protected String Registration;
    protected String Brand;
    protected String Model;

    //Methods

    public Auto(String registration, String brand, String model) {
        Registration = registration;
        Brand = brand;
        Model = model;
    }

    public String getRegistration() {
        return Registration;
    }

    public String getBrand() {
        return Brand;
    }

    public String getModel() {
        return Model;
    }

    public String DisplayData(){
        return("The Registration is: "+Registration+" The Brand is: "+Brand+"The Model is: "+Model);
    }
}
