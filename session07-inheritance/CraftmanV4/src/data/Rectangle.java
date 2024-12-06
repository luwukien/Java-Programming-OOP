package data;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Chi Kien-Luu | github/luwukien
 * Initialize Date: 04/12/2024
 */
//1. IS A extends

//2. Đặc điểm: nếu con hoàn toàn nhờ cha, khỏi làm gì, nếu có dị biệt thì cứ làm

//3. Phễu: giữ bản sắc, thỏa hiệp với con, độ lại thứ tự biến oke, độ lại thứ tự lệnh coi

//4. Nếu con có cha là abstract, thì, CON CHỈ ĐƯỢC LỰA CHỌN 1 TRONG 2 THỨ SAU
//      {Con có cha đầy đủ code thì con sài lại hết được, thích thì làm thêm - biến dị
//      và override}
//4.1 Con phải là abstract luôn, nếu làm biếng hoàn tất lời nói của cha
//      Cha: tao chỉ nói vậy (hàm abstract) mày Con làm đi
//                                                  Con lười đéo làm, mày chứa hàm
//      abs thừa kế từ Cha, vậy Class chứa hàm chưa hoàn hảo, mày sẽ cũng chưa hoàn hảo
// MÀY PHẢI ABSTRACT
//                  Rectangle giả bộ abstract thì hàm getS() chưa code, vậy không
//                  thể new Rect() sp không hoàn hảo, không đủ code thì lấy gì mà chạy
//                  cả Cha, con không hoàn hảo, bản concept, chưa thể dùng được DÒNG HỌ VÔ SINH

//4.2 Con phải viết tiếp giấc mơ của Cha, Cha nói Con làm, con triển khai thôi
//bài này mình làm được, vì con có 2 cạnh làm sao không làm được
//Con viết hết code cho Cha luôn, {không viết hết thì m vô sinh luôn, không new object}
//viết hết code hàm Cha, @Override
//Con thực thi theo lời Ba dặn, IMPLEMENT ABSTRACT METHODS, VIẾT CODE CHO
//HÀM Ý TƯỞNG, IMPLEMENT THE BODY OF PARENT'S ABSTRACT METHODS
public class Rectangle extends Shape {
    private double a, b;

    public Rectangle(String owner, String color, String borderColor, double a, double b) {
        super(owner, color, borderColor); //1st statement
        this.a = a;                     //BA sẽ là cánh chim, đưa con vùng extends
        this.b = b;   //extends

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    @Override
    public double getArea() {
        return a * b;
    }
    @Override
    public double getPerimeter() {
        return (a + b) * 2;
    }
    @Override
    public void paint() {
        System.out.printf("|RECTANGLE   |%-25s|%-10s|%-10s|%-4.2f|%-4.2f|%-4.2f|%-4.2f|\n", owner, color, borderColor, a, b, getArea(), getPerimeter());
    }
}
