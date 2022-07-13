package OverwriteMembers;

public class Principal {
    public static void main(String[] args) {
        Person person=new Person();
        Dog dog=new Dog();
        Cow cow=new Cow();

        person.eat(); // because this children class has already a method called 'eat' and another inherited, the one on the class overwrite the inherited one so, will be only showing the one class 'person', will work sane with 'dog' or 'cow'
        dog.eat();
        cow.eat();
    }
}
