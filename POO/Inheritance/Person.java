package Inheritance;
//Father Class
public class Person {
    protected String Name; // changed from private to protected in order to use them on inherited classes
    protected String Surname; // 'protected' means that are not only private but also can be access by the children classes
    protected int Age;

    public Person(String name, String surname, int age) {
        Name = name;
        Surname = surname;
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public int getAge() {
        return Age;
    }
}
