public class StudentInfo {
    String name;
    int rollNumber;
    int age;
    String course;
    void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
    public static void main(String[] args) {
        StudentInfo s1 = new StudentInfo();
        s1.name = "Aisha";
        s1.rollNumber = 15;
        s1.age = 20;
        s1.course = "CSE AIML";
        s1.displayInfo();
    }
}