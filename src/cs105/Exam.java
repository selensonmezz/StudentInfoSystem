package cs105;

public class Exam { //3
    private int id;
    private Student student;
    private double score;

    public Exam(int id, Student student, double score) {
        this.student = student;
        this.id = id;
        this.score = score;
    }

    public double getScore() {
        return this.score;
    }

    public Student getStudent() {
        return this.student;
    }

    public String toString() {
        return "Exam " + this.id + ": " + this.student + " " + this.score;
    }
}
