package ClassObj;

public class Overload {
    //Attributes
    String Name;
    int Age;
    String CI;
    //Methods

    public Overload(String CI) {
        this.CI = CI;
    }

    public Overload(String name, int age) { // can have same name but need to have different Parameters on methods constructors or not
        Name = name;
        Age = age;
    }

    public void Run(){
        System.out.println("I am "+Name+", I have "+Age+" years and I am running");
    }
    public void Run(int km){
        System.out.println("I ran "+km+" km");
    }

    // Java does not accept same name method with same parameters but one with return
    //public int Run(int a){
    // vs
    //public void Run(int a){
    // This can not be used/ error will show
}
