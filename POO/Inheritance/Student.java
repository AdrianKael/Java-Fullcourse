package Inheritance;
// Children Class
public class Student extends Person{    //'extends' is like 'inheritance from' so all Attributes on 'Person' exist now on Student
    private int CodeStudent;
    private float FinalGrade;

    public Student(String name, String surname, int age, int codeStudent, float finalGrade) { //generated with IDE, takes 5 Attributes, 2 here on Student and 3 Inherited by Person
        super(name, surname, age); // this means that 3 Attributes Inherited by Person are already Initialized
        CodeStudent = codeStudent;
        FinalGrade = finalGrade;
    }

    public int getCodeStudent() {
        return CodeStudent;
    }

    public float getFinalGrade() {
        return FinalGrade;
    }
    public void displayData(){ // to call the data Attribute Inherited, now is Private so can't be use by other class, does not care if it's inherited, so we can change them from private to protected
        //System.out.println("Name: "+Name+" SurName: "); Can be used with protected but to maintain the 'Encapsulate' we use the methods
        System.out.println("Name: "+getName()+" Surname: "+getSurname()+" Age: "+getAge()+" Student Code:"+CodeStudent+" Final Grade: "+FinalGrade); // the methods are called like are part of this class because of the inheritance
    }
}
