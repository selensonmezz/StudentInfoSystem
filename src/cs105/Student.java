
package cs105;

import java.util.ArrayList;
import java.util.Random;

public class Student { //8
    private int ID;
    private String name;
    private ArrayList<Course> enrolledCourses;

    public Student(int ID, String name) {
        this.ID = ID;
        this.name = name;

        enrolledCourses = new ArrayList<Course>();
    }

    public void enroll(Course course) {
        course.enrollStudent(this);
        enrolledCourses.add(course);
    }

    public void listEnrolledCourses() {
        System.out.println(name + " is enrolled in the following courses:");
        for (Course course : enrolledCourses) {
            System.out.println(course);
        }
    }

    public void takeExams(Course course) {
        boolean found = false;
        for (Course c : enrolledCourses) {
            if (course == c) {
                int count = course.getExamCount();
                Random randomGenerator = new Random();
                String out = "";
                for (int i = 1; i <= count; i++) {
                    int score = randomGenerator.nextInt(100);
                    course.addExam(i, this, score);
                    out += score + " ";
                }
                found = true;
                System.out.println(name + " got the following scores in " + course.getName() + " exams: " + out);
            }
        }
        if (found == false)
            System.out.println(name + " is not enrolled in this course!");
    }

    public void getFinalScore(Course course) {
        boolean found = false;
        for (Course c : enrolledCourses) {
            if (course == c) {
                double score = course.getFinalScore(this);
                System.out.println(name + "'s final score from " + course.getName() + " is " + score);
                found = true;
            }
        }
        if (found == false)
            System.out.println(name + " is not enrolled in this course!");
    }

    public String toString() {
        return ID + "-" + name;
    }
}
