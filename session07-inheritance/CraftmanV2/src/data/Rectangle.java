package data;


/**
 * @author Chi Kien-Luu | github/luwukien
 * Initialize Date: 23/11/2024
 */

public class Rectangle {
    protected String owner;
    protected String color;
    protected double width;
    protected double length;
    protected double area; //thuộc tích/dđ dẫn xuất, derived field
                        //được tính từ thằng khác, w * l
                        //do diện tích một đằng, 2 cạnh một nẻo
    //bất khả kháng chứ né con mẹ thằng này ra, ngoan cố new đúng, 5, 20, 100
    //setWidth[10] -> chết nếu không cập nhật lại S
    //sl * dg = tt
    //dẫn xuất có thể tính được từ thằng data khác, vậy nó nên được biến thành
    //hành vi của object khác
    //tui/bạn đều có năm sinh -> cắc cớ đi hỏi tuổi, getAge() là hàm hay hơn
    //                          , age dẫn xuất, cá mỗi nay hàm age++ đúng thời điểm
    //HÀM SẼ THUỘC VỀ THẰNG NÀO CÓ NHIỀU DATA, TÍNH DIỆN TÍCH SẼ LÀ 1 HÀM CỦA HÌNH CN
    public Rectangle(String owner, String color, double width, double length) {
        this.owner = owner;
        this.color = color;
        this.width = width;
        this.length = length;
    }

    //getter

    public String getOwner() {
        return owner;
    }

    public String getColor() {
        return color;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    //setter

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "owner='" + owner + '\'' +
                ", color='" + color + '\'' +
                ", width=" + width +
                ", length=" + length +
                '}';
    }

    public double getArea() {
        return  width * length; //tao éo in, return để re-use hơi khác
    }

    //90.0 x 90.9 = 8100.0

    public void paint() {
        System.out.printf("|RECTANGLE|%15s|%-10s|%4.1f|%4.1f|%7.2f|\n", owner, color, width, length, getArea());
    }
}

