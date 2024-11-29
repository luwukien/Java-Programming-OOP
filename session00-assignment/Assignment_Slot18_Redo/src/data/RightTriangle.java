package data;
public class RightTriangle extends Triangle {
    public RightTriangle(double edge1, double edge2) {
        super(edge1, edge2, Math.sqrt((edge1 * edge1) + (edge2 * edge2)));
    }

    public void printParameters() {
        System.out.printf("Right Triangle|%.3f|%.3f|%.3f|Area: %.3f|\n", edge1, edge2,
                Math.sqrt((edge1 * edge1) + (edge2 * edge2)), getArea());

    }
}