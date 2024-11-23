package data;

/**
 * @author Chi Kien-Luu | github/luwukien
 * Date: 11/23/2024
 */

public class Square {
    private String owner;
    private String color;
    private double edge;

    public Square(String owner, String color, double edge) {
        this.color = color;
        this.edge = edge;
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public String toString() {
        return "Square{" +
                "owner='" + owner + '\'' +
                ", color='" + color + '\'' +
                ", edge=" + edge +
                '}';
    }
    public double getArea() {
//        return  edge * edge; //tao éo in, return để re-use hơi khác
        return Math.pow(edge, 2); //edge^2
    }


    public void paint() {
        System.out.printf("|SQUARE   |%15s|%-10s|%4.1f|  - |%7.2f|\n", owner, color, edge, getArea());
    }

}
