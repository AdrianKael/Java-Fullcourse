package Package2;

public class Class2 {
    public static void main(String[] args) {
        Class1 person = new Class1("Adrian",26);
        person.setAge(22); //we can set again that value, because is a variable, but we can't set again a constant
        person.DisplayData();
    }
}
