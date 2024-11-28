import java.util.Scanner;

import data.RightTriangle;
import data.Triangle;
import data.Utilization;
/**
 * @author Chi Kien-Luu | github/luwukien
 * Initialize Date: 27/11/2024
 */

//Triangle có 3 cạnh a, b, c ( tổng 2 cạnh bk phải lớn hơn cạnh thứ 3)
//Right Triangle bàn 2 cạnh góc vuông a, b
//Viết app lưu 3 triangle, 3 right triangle, sort tăng dần theo S
//HINT: tôn trọng con

public class Main {
    public static void main(String[] args) {
        inputElements();

    }

    public static void inputElements() {
        System.out.println("Welcome to my new app.");
        //triangle
        Triangle triangle1 =  new Triangle(5.6, 5.4, 4.5);
        Triangle triangle2 = new Triangle(2.5, 6.7, 4.5);
        Triangle triangle3 = new Triangle(3.5, 7.5, 4.5);

        //right triangle
        RightTriangle rightTriangle1 = new RightTriangle(4.5, 5.6);
        RightTriangle rightTriangle2 = new RightTriangle(2.3, 4.5);
        RightTriangle rightTriangle3 = new RightTriangle(2.3, 5.6);

    }
    public static void sortArea() {

    }

}