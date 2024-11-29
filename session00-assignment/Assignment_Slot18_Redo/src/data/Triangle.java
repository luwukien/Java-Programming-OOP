package data;
public class Triangle {
    protected double edge1;
    protected double edge2;
    protected double edge3;

    //constructor

    public Triangle(double edge1, double edge2, double edge3) {
        if (edge1 + edge2 > edge3 && edge2 + edge3 > edge1 && edge1 + edge3 > edge2) {
            this.edge1 = edge1;
            this.edge2 = edge2;
            this.edge3 = edge3;
        }
        else
            throw new IllegalArgumentException("The invalid value");
    }

    //method get area
    public double getArea() {
        double average = (edge1 + edge2 + edge3) / 2;
        return Math.sqrt(average * (average - edge1) * (average - edge2) * (average - edge3));
    }

    //method print
    public void printParameters() {
        System.out.printf("Triangle      |%.3f|%.3f|%.3f|Area: %.3f|\n", edge1, edge2, edge3, getArea());

    }

}