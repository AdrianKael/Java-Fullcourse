package ClassObj;

public class Person {
    //Attributes
    String Name;
    int Age;

    //Method
    public Person(String _name,int _age){//Constructor Method - Can Facilitate the initialization of the Attributes
        this.Name=_name;
        this.Age=_age; //'This' used to point the Attribute
    }

    public void Display(){
        System.out.println("The Name is: "+Name);
        System.out.println("The Age is: "+Age);
    }
}
