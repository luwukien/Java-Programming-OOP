package main;
import util.data.Archive;
import util.data.Student;

/**
 * @author Chi Kien-Luu | github/luwukien
 * Date: 11/19/2024
 */

//How do you write code assignment to archive many student profiles?

public class Main {
    public static void main(String[] args) {
        Archive student = new Archive();

        student.inputInformation();
        student.inputInformation();


        student.printStudentList();
    }

}