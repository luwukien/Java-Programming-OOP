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

    Scanner sc = new Scanner(System.in);
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

    }
    
    public void printStudentList() {
        System.out.println("The list student: ");
        for (int i = 0; i < countStudent; i++) {
            studentList[i].showProfile();
        }
    }

}
