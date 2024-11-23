package main;
import util.data.Archive;
import util.data.Student;

import java.util.Scanner;

/**
 * @author Chi Kien-Luu | github/luwukien
 * Date: 11/19/2024
 */

//How do you write code assignment to archive many student profiles?

public class Main {
    public static void main(String[] args) {
        chooseFunction();

    }


    public static void chooseFunction() {
        Archive student = new Archive();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            printMenu();
            System.out.println("Please choose to a function which you need");
            choice = Integer.parseInt(sc.nextLine());

            //if (choice == 1) == 2 == 3 == 4
            switch (choice) {
                case 1:
                    student.inputInformation();
                    break;
                case 2:
                    student.printStudentList();
                    break;
                case 3:
                    //
                case 4:
                    student.sortGPAStudent();
                case 5:
                    //
                case 6:
                    System.out.println("See you again!");
            }
        } while (choice != 6);
        //updated

    }
    public static void printMenu() {
        System.out.printf("\n");
        System.out.println("============================================================");
        System.out.println("Welcome to FAP - FPT Academic Portal");
        System.out.println("Choose the following functions to play with");
        System.out.println("1> Add a student profile");
        System.out.println("2> Print student list");
        System.out.println("3> Search a student by id");
        System.out.println("4> Sort GPA student from low to high");
        System.out.println("5> Remove a student");
        System.out.println("6> Quit");
    }

}