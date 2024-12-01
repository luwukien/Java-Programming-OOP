package data;

/**
 * @author Chi Kien-Luu | github/luwukien
 * Initialize Date: 29/11/2024
 */
//1. Phát hiện được IS A đọc 1 chiều, lập tức tiếp cận làm khuôn mới
// gõ extends Class cha, parent, super, base

//2. Khai báo đặc tính cho COn, nếu trùng lại với cha, tương đồng cha, để chh lo
// không cần khai báo lại đặc tính con nếu cha có tương đương

//2.1

//3. Làm phễu cho con, giữ bẳn sắc cho con, tôn trọng phễu đầu vào của con
//  sự khác biệt góc nhìn cha và con, cha cần 3 cạnh, con chỉ cần 2 cạnh vuông

public class RightTriangle extends Triangle {
    public RightTriangle(String owner, String color, double a, double b) {
        super(owner, color, a, b, Math.sqrt((a * a + b * b)));
        //new con chính là new cha, cắt TGV chính là cắt 1 TG
        //new con chính là new 1 phiên bản cha

    }
    public void paint() {
        System.out.printf("|R.TRIANGLE|%15s|%-10s|%4.1f|%4.1f| - |%7.2f|\n", owner, color, a, b, getArea());
    }

}
