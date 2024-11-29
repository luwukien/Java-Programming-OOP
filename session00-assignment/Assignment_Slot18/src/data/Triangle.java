package data;

import static java.lang.Math.sqrt;

/**
 * @author Chi Kien-Luu | github/luwukien
 * Initialize Date: 27/11/2024
 */

public class Triangle {
    protected double edgeTriangle1;
    protected double edgeTriangle2;
    protected double edgeTriangle3;

    //constructor

    public Triangle(double edgeTriangle1, double edgeTriangle2, double edgeTriangle3) {
        if (edgeTriangle1 + edgeTriangle2 > edgeTriangle3 && edgeTriangle2 + edgeTriangle3 > edgeTriangle1 && edgeTriangle3 + edgeTriangle1 > edgeTriangle2) {
            this.edgeTriangle1 = edgeTriangle1;
            this.edgeTriangle2 = edgeTriangle2;
            this.edgeTriangle3 = edgeTriangle3;
        } else {
            throw new IllegalArgumentException("Invalid Triangle");
        }

    }

    //getter
    public double getEdgeTriangle1() {
        return edgeTriangle1;
    }

    public double getEdgeTriangle2() {
        return edgeTriangle2;
    }

    public double getEdgeTriangle3() {
        return edgeTriangle3;
    }

    //setter
   public void setEdgeTriangle1(double edgeTriangle1) {
        this.edgeTriangle1 = edgeTriangle1;
    }

    public void setEdgeTriangle2(double edgeTriangle2) {
        this.edgeTriangle2 = edgeTriangle2;
    }

    public void setEdgeTriangle3(double edgeTriangle3) {
        this.edgeTriangle3 = edgeTriangle3;
    }


   public double getArea() {
        double average = (edgeTriangle1 + edgeTriangle2 + edgeTriangle3) / 2;
        //Heron formula
        return  sqrt(average * (average - edgeTriangle1) * (average - edgeTriangle2) * (average - edgeTriangle3));
   }


   public void printParameter() {
       System.out.printf("|TRIANGLE      |%.3f|%.3f|%.3f|%.3f|\n", edgeTriangle1, edgeTriangle2, edgeTriangle3, getArea());
   }



}
