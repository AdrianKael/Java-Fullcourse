In inheritance, an object fo the super/father class can store an object of the sub/child classes.

Super/Father CLass is compatible with the types of the child but not by-versa

Poly = A lot
Morphism= Shape

Example:
    Auto: (father/super)
        Attributes: Registration:String
                    Brand: String
                    Model: String
        Methods:
                    ShowData():String
    SportsCar: (child)
        Attributes: Displacement:int
        Methods:
                    ShowData():String (Override)
    TouristCar: (child)
        Attributes: nDoors:int
        Methods:
                    ShowData():String (Override)
    VanCar: (child)
        Attributes: Load:int
        Methods:
                    ShowData():String (Override)

 Auto Car= New Auto("12GB","Ferrari","A8"); //in this case we are using the constructor of the same father class

//With Polymorphism
Auto Car = new TouristCar("12GB","Ferrari","A8",4);// we can use the constructor of our Child Class also using the Attribute on child class

Auto Car = new SportsCar("12GB","Ferrari","A8",500);

Auto Car = new VanCar("12GB","Ferrari","A8",2000);