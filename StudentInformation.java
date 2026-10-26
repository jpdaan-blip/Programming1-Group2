class Student {
    String name;
    String studentNumber;
    int yearLevel;

    Student(String name, String studentNumber, int yearLevel) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.yearLevel = yearLevel;
    }

    void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("Student Number: " + studentNumber);
        System.out.println("Year Level: " + yearLevel);
        System.out.println("------------------------");
    }
}

    public class StudentInformation {
    public static void main(String[] args) {
        Student student1 = new Student("Jimwell P. Daan", "26CCS-0321", 1);

        student1.displayInformation();

    }
}
