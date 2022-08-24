
package cs105;

public class LMS {
    public static void main(String[] args) {
        Student ali = new Student(1, "Ali");
        Student fuat = new Student(2, "Fuat");
        Student celal = new Student(3, "Celal");
        Student didem = new Student(5, "Didem");

        Instructor hasanSozer = new Instructor("Hasan Sozer");
        Instructor furkanKirac = new Instructor("Furkan Kirac");

        Course cs102 = new Course("CS102", hasanSozer, 3);
        Course cs101 = new Course("CS101", furkanKirac, 2);
        Course cs201 = new Course("CS201", hasanSozer, 1);

        hasanSozer.addCourse(cs102);
        furkanKirac.addCourse(cs101);
        hasanSozer.addCourse(cs201);

        hasanSozer.listCourses();
        furkanKirac.listCourses();
        System.out.println();

        ali.enroll(cs101);
        celal.enroll(cs101);
        didem.enroll(cs102);
        fuat.enroll(cs102);
        ali.enroll(cs102);

        ali.listEnrolledCourses();
        fuat.listEnrolledCourses();
        celal.listEnrolledCourses();
        didem.listEnrolledCourses();
        System.out.println();

        ali.takeExams(cs101);
        ali.takeExams(cs102);
        didem.takeExams(cs102);
        celal.takeExams(cs102);
        celal.takeExams(cs101);
        System.out.println();

        ali.getFinalScore(cs101);
        ali.getFinalScore(cs102);
        fuat.getFinalScore(cs102);
        celal.getFinalScore(cs101);
        celal.getFinalScore(cs102);
        didem.getFinalScore(cs102);
        System.out.println();

        furkanKirac.getAverageFinalScore(cs101);
        hasanSozer.getAverageFinalScore(cs101);
        hasanSozer.getAverageFinalScore(cs102);
        hasanSozer.getAverageFinalScore(cs201);
        System.out.println();
    }
}
