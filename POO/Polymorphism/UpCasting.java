package Polymorphism;
// Using the same files of Polymorphism
// UpCasting can make an object of a child can be an object of Super/father class
public class UpCasting {
    public static void main(String[] args) {
        TouristCar car=new TouristCar("23DS","Ferrari","A89",2);

        Auto cars=car; //create a super class obj and save it with a subclass object

        System.out.println(cars); // so this is linked to subclass TourismCar

        //this is the same as just declare in one line:

        Auto Cars = new TouristCar("23DS","Ferrari","A89",2);
    }
}
