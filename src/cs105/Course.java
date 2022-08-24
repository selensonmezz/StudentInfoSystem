package cs105;

import java.util.ArrayList;

public class Course { //9
    private String name;
    private Instructor instructor;
    private ArrayList<Student> studentsEnrolled;
    private int examCount;
    private ArrayList<Exam> exams;

    public Course(String name, Instructor instructor, int examCount) {
        this.name = name;
        this.instructor = instructor;
        this.examCount = examCount;

        exams = new ArrayList<Exam>();
        studentsEnrolled = new ArrayList<Student>();
    }

    public String getName() {
        return name;
    }

    public void enrollStudent(Student student) {
        studentsEnrolled.add(student);
    }

    public int getExamCount() {
        return examCount;
    }

    public void addExam(int ID, Student student, double score) {
        Exam exam = new Exam(ID, student, score);
        exams.add(exam);
    }

    public ArrayList<Exam> getExams() {
        return exams;
    }

    public double getFinalScore(Student student) {
        int score = 0;
        boolean found = false;
        for (Student s : studentsEnrolled) {
            if (student == s) {
                for (Exam exam : exams) {
                    if (exam.getStudent() == s) {
                        score += exam.getScore();
                    }
                }
                score = score / examCount;
                found = true;
            }
        }
        if (found == false)
            System.out.println(name + " is not enrolled in this course!");
        return score;
    }

    public double getAverageFinalScore() {
        int score = 0;
        for (Student s : studentsEnrolled) {
            score += getFinalScore(s);
        }
        if (studentsEnrolled.size() > 0) {
            score = score / studentsEnrolled.size();
        }
        return score;
    }

    public String toString() {
        return name;
    }
}
