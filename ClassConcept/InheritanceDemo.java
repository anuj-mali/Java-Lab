package ClassConcept;

//NOTE: property by which one class can acquire properties of another class
class Person {
    private String name;
    private String gender;
    private String phone;

    // constructor
    public Person(String name, String gender, String phone) {
        this.name = name;
        this.gender = gender;
        this.phone = phone;
    }

    // method
    public void displayPerson() {
        System.out.println("Name is " + this.name);
        System.out.println("Gender is " + this.gender);
        System.out.println("Phone is " + this.phone);
    }
}

class Student extends Person {
    private int roll;
    private String faculty;
    private String grade;

    // NOTE: super keyword is used to call the constructor of parent
    public Student(String name, String gender, String phone, int roll, String faculty, String grade) {
        super(name, gender, phone);
        this.roll = roll;
        this.faculty = faculty;
        this.grade = grade;
    }

    public void displayStudent() {
        super.displayPerson();
        System.out.println("Roll is " + this.roll);
        System.out.println("Faculty is " + this.faculty);
        System.out.println("Grade is " + this.grade);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Anuj", "Male", "12345", 2, "CSIT", "A");
        s1.displayPerson();
        s1.displayStudent();
    }
}