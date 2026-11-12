public class StudentDriver {
    public static void main(String[] args) {
        // Membuat object menggunakan constructor yang valid
        Student student = new Student("Budi Santoso", 20, 70);

        // Mencetak informasi ke layar sesuai atribut yang tersedia di class Student
        System.out.println("Student Name: " + student.name);
        System.out.println("Credits     : " + student.credits);
        System.out.println("Grade Points: " + student.gradePoints);
        System.out.println("IPK (GPA)   : " + student.gpa);
    }
}