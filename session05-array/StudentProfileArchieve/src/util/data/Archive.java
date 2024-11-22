package util.data;
import java.util.Scanner;
import util.data.Student;
//This is a place to archive student profiles includes sort, access

/**
 * @author Chi Kien-Luu | github/luwukien
 * Date: 11/19/2024
 */

public class Archive {

    private Student studentList[] = new Student[300];

    //Count variable to use method access information
    private int countStudent = 0;

    //Characteristic student
    private String id;
    private String name;
    private int birth;
    private double gpa;

    private final Scanner sc = new Scanner(System.in);
    //Method input information student
    public void inputInformation() {
        System.out.println("Please input your ID student ");
        id = sc.nextLine();

        System.out.println("Please input your name");
        name = sc.nextLine();

        System.out.println("Please input your birth");
        birth = Integer.parseInt(sc.nextLine());

        System.out.println("Please input your gpa");
        gpa = Double.parseDouble(sc.nextLine());

        studentList[countStudent++] = new Student(id, name, birth, gpa);
        System.out.println("Add student information successfully");

    }
    
    public void printStudentList() {
        System.out.println("The list student: ");
        for (int i = 0; i < countStudent; i++) {
            studentList[i].showProfile();
        }
    }
    public void sortGPAStudent() {
        Student temp;
        for (int i = 0; i < studentList.length; i++) {
            for (int j = 0; j < studentList.length - i - 1; j++) {
                if (studentList[j].getGpa() > studentList[j + 1].getGpa()) {
                    temp = studentList[j];
                    studentList[j] = studentList[j + 1];
                    studentList[j + 1] = temp;
                }
            }
        }
        printStudentList();
        System.out.println("Sorted successfully");
    }
}


