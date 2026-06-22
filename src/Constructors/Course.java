package Constructors;

public class Course {

    static int maxCapacity;

    String courseName;
    int enrolledStudents;


    static void setMaxCapacity(int capacity){
         maxCapacity = capacity;
    }


    Course(String courseName){
        this.courseName = courseName;
        enrolledStudents = 0;
    }

    public void enrollStudents(String studentName){
        if (this.enrolledStudents >= maxCapacity) {
            System.out.println("\n\t Sorry all Seats are Full For the " + this.courseName +" Course");
        }else {
            System.out.println("\n\t You're Successfully Enrolled To the " + this.courseName +" Course");
            enrolledStudents++;
        }
    }

    public void unEnrolledStudents(String studentName){
        if (enrolledStudents > 0) {
            enrolledStudents--;
            System.out.println("\n\t You're Successfully UnEnrolled To the " + this.courseName +" Course");
        } else {
            System.out.println("\n\t Seats available Of the " + this.courseName + " Course.");
        }
    }

    public static void main(String[] args){

        Course java = new Course("Java");
        Course Edit = new Course("Edit");

        Course.setMaxCapacity(2);
        java.enrollStudents("Mira");
        java.enrollStudents("Kumar");
        java.enrollStudents("Sahil");
        java.unEnrolledStudents("Kumar");
        java.enrollStudents("Sahil");
        Course.setMaxCapacity(1);
        Edit.unEnrolledStudents("djbravo");
        Edit.enrollStudents("Gamerkumar");
        Edit.enrollStudents("Gamerkumar");
    }
}
