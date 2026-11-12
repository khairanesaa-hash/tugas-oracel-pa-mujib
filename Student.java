public class Student {
    String name;
    int credits;
    int gradePoints;
    double gpa;

    // Constructor berparameter
    public Student(String name, int credits, int gradePoints) {
        this.name = name;
        this.credits = credits;
        this.gradePoints = gradePoints;
        calculateGPA();
    }

    // Default Constructor (kosong) agar bisa dipanggil jika dibutuhkan
    public Student() {
        this.name = "";
        this.credits = 0;
        this.gradePoints = 0;
        this.gpa = 0.0;
    }

    // Method untuk menghitung/mengembalikan IP (GPA)
    public double calculateGPA() {
        if (credits == 0) {
            gpa = 0.0;
        } else {
            gpa = (double) gradePoints / credits;
        }
        return gpa;
    }

    // Method untuk memperbarui kredit, poin mutu, dan IP
    public void addCourse(int newCredits, int newGradePoints) {
        this.credits += newCredits;
        this.gradePoints += newGradePoints;
        calculateGPA();
    }
}