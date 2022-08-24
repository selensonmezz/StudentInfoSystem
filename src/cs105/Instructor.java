package cs105;

import java.util.ArrayList;

public class Instructor { //4
    private String name;
    private ArrayList<Course> courses;

    public Instructor(String name) {
        courses = new ArrayList<Course>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void listCourses() {
        System.out.println(name + " is offering the following courses:");
        for (Course course : courses) {
            System.out.println(course);
        }
    }

    public void getAverageFinalScore(Course course) {
        boolean found = false;
        for (Course c : courses) {
            if (course == c) {
                double score = course.getAverageFinalScore();
                System.out.println(course.getName() + "'s average final score is " + score);
                found = true;
            }
        }
        if (found == false)
            System.out.println(course.getName() + " is not offered by " + name);
    }
}
