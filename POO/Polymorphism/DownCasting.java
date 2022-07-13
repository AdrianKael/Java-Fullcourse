package Polymorphism;
// This is go in hierarchy of classes by going down
// So we make an object of super class and save it on a subclass
public class DownCasting {
    public static void main(String[] args) {
        Auto car1 = new TouristCar("23FD","Ferrari","A89",4);

        TouristCar car2= (TouristCar) car1;

        System.out.println(car1);
        System.out.println(car2);

        /////////////////////////////////////////////////////////
        Auto car3= new TouristCar("23FD","Ferrari","A89",4);

        TouristCar car4= (TouristCar) car3;
        
        System.out.println("\n"+car3);
        System.out.println(car4);
    }
}
