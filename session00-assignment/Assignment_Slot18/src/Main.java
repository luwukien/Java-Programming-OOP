import data.RightTriangle;
import data.Triangle;

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
        System.out.println("Welcome to my new app.");
        //triangle
        Triangle[] triangles = new Triangle[6];
        triangles[0] = new Triangle(5.6, 3.4, 3.6);
        triangles[1] = new Triangle(3.4, 5.2, 4.6);
        triangles[2] = new Triangle(3.4, 5.2, 4.6);


        //right triangle
        triangles[3] = new RightTriangle(4.5, 4.5);
        triangles[4] = new RightTriangle(2.3, 7.8);
        triangles[5] = new RightTriangle(4.5, 6.5);
        System.out.println("Before sort");
        for (int i = 0; i < 6; i++) {
            triangles[i].printParameter();
        }
        System.out.printf("\n");
        System.out.println("After sort");
        sortTriangleArea(triangles);
        for (int i = 0; i < 6; i++) {
            triangles[i].printParameter();
        }
    }

    public static void sortTriangleArea(Triangle[] triangles) {
        for (int i = 0; i < triangles.length - 1; i++) {
            for (int j = 0; j < triangles.length - i - 1; j++) {
                if (triangles[j].getArea() > triangles[j + 1].getArea()) {
                    Triangle temp = triangles[j];
                    triangles[j] = triangles[j + 1];
                    triangles[j + 1] = temp;
                }
            }
        }
    }

}