//Triangle có 3 cạnh a, b, c ( tổng 2 cạnh bk phải lớn hơn cạnh thứ 3)
//Right Triangle bàn 2 cạnh góc vuông a, b
//Viết app lưu 3 triangle, 3 right triangle, sort tăng dần theo S
//HINT: tôn trọng con

import data.RightTriangle;
import data.Triangle;

public class Main {
    public static void main(String[] args) {
        Triangle[] triangles = new Triangle[6];
        //triangle
        triangles[0] = new Triangle(4.5, 3.4, 7.1);
        triangles[1] = new Triangle(7.6, 3.2, 8.7);
        triangles[2] = new Triangle(7.6, 6.2, 10.7);
        //right triangle
        triangles[3] = new RightTriangle(2.6, 3.2);
        triangles[4] = new RightTriangle(9.6, 4.5);
        triangles[5] = new RightTriangle(5.6, 3.7);

        System.out.println("Before sort");

        for (int i = 0; i < 6; i++)
            triangles[i].printParameters();

        sortArea(triangles);

        System.out.println("After sort");

        for (int i = 0; i < 6; i++)
            triangles[i].printParameters();
    }

    //sort method
    public static void sortArea(Triangle[] triangles) {
        Triangle temp;
        int length = triangles.length;
        for (int i = 0; i < length - 1; i++) {
            for(int j = 0; j < length - i - 1; j++)
                if (triangles[j].getArea() > triangles[j + 1].getArea()) {
                    temp = triangles[j];
                    triangles[j] = triangles[j + 1];
                    triangles[j + 1] = temp;
                }
        }
    }
}