package Q5;

public class Main {

    public static void main(String[] args) {

        Lecturer lecturer = new Lecturer();
        lecturer.setLecturerName("Mr. Silva");
        lecturer.setCourseTeaching("Object Oriented Programming");

        Course course = new Course();
        course.setCourseName("OOP");
        course.setCourseCode("IT202");
        course.setLecturer(lecturer);

        Student student = new Student();
        student.setStudentName("Kamal");
        student.setDegreeName("BICT");
        student.setCourseFollowing("OOP");

        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Course Code: " + course.getCourseCode());
        System.out.println("Lecturer: " +
                course.getLecturer().getLecturerName());

        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Degree: " + student.getDegreeName());
        System.out.println("Course Following: " +
                student.getCourseFollowing());
    }
}
