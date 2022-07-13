We can re-use the code, we need at least 2 classes, The newest class will absorb the members of the existent one

Example:
    1st Class Person: (Named: Class Father)
        Attributes:
            Name
            Surname
            Age
        Constructor: 
            Person:
                Name
                Surname
                Age
        Methods:
            getName:    String
            getSurname: String
            getAge:     int
    2nd Class Student: (Named: Class Children)
        Attributes:
            Name        //can be inherited
            Surname     //can be inherited
            Age         //can be inherited
            CodeStudent //new
            FinalGrade  //new
    Constructor:
        Student:
            Name            
            Surname
            Age
            CodeStudent //new
            FinalGrade  //new
        Methods:
            getName:    String
            getSurname: String
            getAge:     int
            DisplayData: void //new
The phrase to make sure with class is father and witch is Children is to ask:
'It is' => so a Student It is a Person? or a Person It is a Student? No, so Person is Father and Student is Children