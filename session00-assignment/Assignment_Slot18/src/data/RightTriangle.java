package data;

/**
 * @author Chi Kien-Luu | github/luwukien
 * Initialize Date: 27/11/2024
 */

public class RightTriangle extends Triangle {
  public RightTriangle(double edgeTriangle1, double edgeTriangle2) {
        super(edgeTriangle1, edgeTriangle2, Math.sqrt(edgeTriangle1 * edgeTriangle1 + edgeTriangle2 * edgeTriangle2));
  }
    @Override
    public void printParameter() {
        System.out.printf("|RIGHT TRIANGLE|%.3f|%.3f|%.3f|%.3f|\n", edgeTriangle1, edgeTriangle2, Math.sqrt(edgeTriangle1 * edgeTriangle1 + edgeTriangle2 * edgeTriangle2), getArea());
    }

}
