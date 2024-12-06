package data;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Chi Kien-Luu | github/luwukien
 * Initialize Date: 04/12/2024
 */
@Getter
@Setter
@ToString
public class Disk extends Shape {
    public static final double PI = 3.14;
    private String smile; //biến dị thêm cho vui
    private double radius;

    public Disk(String owner, String color, String borderColor, String smile, double radius) {
        super(owner, color, borderColor);
        this.smile = smile;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Disk.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public void paint() {
        System.out.printf("|DISK      |%-25s|%-10s|%-10s|%-10s|%-4.2f|%-4.2f|\n", owner, color, borderColor, smile, getArea(), getPerimeter());
    }
}
