public class Main {
    public static void main(String[] args) {
        // Creating object of Student
        Student student = new Student();

        // Setting values using setters
        student.setName("Aaryan Kundap");
        student.setRollNumber(101);
        student.setGrade('A');

        // Getting and displaying values using getters
        System.out.println("Student Information:");
        System.out.println("Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Grade: " + student.getGrade());
    }
}
