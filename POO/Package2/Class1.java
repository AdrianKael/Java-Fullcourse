package Package2;
//Constants in Classes
public class Class1 {
    private final String Name; //'final' to declare it as constant, we can't use Setters with a Constant
    private int Age;

    //Constructor
    public Class1(String Name, int Age){
        this.Name = Name;
        this.Age=Age;
    }
    public void DisplayData(){
        System.out.println("The Name is: "+Name);
        System.out.println("The Age is: "+Age);
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {//we can set again that Age value because is a variable, but we can't set again a constant
        Age = age;
    }
}