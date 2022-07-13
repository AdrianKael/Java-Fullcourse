package Polymorphism;

public class Principal {
    public static void main(String[] args) {
        Auto[] car =new Auto[4]; //Declared all with Father Class, note: The Declaration of an Array need to have the '[]' Before the name, could work after the name, but it won't be correct/organized

        car[0]= new Auto("GH67","Ferrari","A89"); //Using the same constructor of the Class used
        car[1]= new TouristCar("78JG","Audi","P14",4); // we use the constructor of the Child Classes with the Father Class 'Auto'
        car[2]= new SportsCar("45JS","Toyota","KJ8",500); // we use the constructor of the Child Classes with the Father Class 'Auto'
        car[3]= new VanCar("23HD","Mazda","J9",2000); // we use the constructor of the Child Classes with the Father Class 'Auto'

        for (Auto cars: car) {
            System.out.println(cars.DisplayData());
            System.out.println("");
        }
    }
}
