import data.RightTriangle;
import data.Triangle;

public class Main {
    public static void main(String[] args) {
        playWithTriangle();
    }
    public static void playWithTriangle() {
        //Cha new Cha (cụ thể - concrete class) //abstract class
        //gọi đúng chuẩn tên: TG là TG
        Triangle t1 = new Triangle("Tía", "Pink", 3, 4, 5);
        t1.paint();

        Triangle rt1 = new RightTriangle("Má", "PiINK", 4, 5);
        rt1.paint();

        //Khai cha new Con, con kiểu IS-A, dùng 2 danh nghĩa, Con, phiên bản Cha
        Triangle rt2 = new RightTriangle("BÉ NA", "RAINBOW", 6.8, 7.6);
        rt2.paint(); //của cha
                //LÚC CHẠY THÌ......HÀNH XỬ NHƯ CON, NẾU CÒN TÙNG TÊN HÀM CHA
        //CHA NGỒI IM ĐỂ CON LO, OVERRIDE QUA MẶT CHA
        //Khai báo gì thì hành xử như thế, vì mình sẽ đặt tên hco OBJECT KÈM
        //DATA TYPE, OBJECT SẼ THUỘC NHÓM GÌ/KHUÔN, THEO KHUÔN NHÌN HÀNH XỬ
        //LIÊN QUAN ĐẾN KẾ THỪA, CÓ 2 ĐIỀU
        //DI TRUYỀN: CHA CÓ GÌ CON XÀI NẤY, CHA THÊM, CON CÓ THÊM, CHA BỚT, CON CÓ BỊ BỚT
        //BIẾN DỊ: CON KHÁC CHA À NHEN, ĐIỀU GÌ XẢY RA - KÌ THUẬT DIFT, RÊ BÁNH
        ((RightTriangle) rt2).sayHi();
    }
}