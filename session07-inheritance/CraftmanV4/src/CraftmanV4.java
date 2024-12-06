import data.Disk;
import data.Rectangle;
import data.Shape;

/**
 * @author Chi Kien-Luu | github/luwukien
 * Initialize Date: 03/12/2024
 */

public class CraftmanV4 {
    public static void main(String[] args) {
        playwithShapes();
    }
    public static void playwithShapes() {
        Rectangle r1 = new Rectangle("Tía", "PINK", "Magenta", 5.0, 6.0);
        Shape r2 = new Rectangle("Tía", "PINK", "Magenta", 6.0, 5.0);

        Disk d1 = new Disk("MÁ", "PINK", "MEGENTA", "<3", 6.0);
        Shape d2 = new Disk("MÁ", "PINK", "MEGENTA", "<3", 7.0);

        r1.paint();  //gọi ai? GỌI CON, CHẠY CON, RECT
        r2.paint();  //gọi ai? GỌI CHA, CHẠY CON, RECT, QUA MẶT CHA
        d1.paint(); //gọi ai? GỌI CON, CHẠY CON, DISK
        d2.paint();  //gọi ai? GỌI CHA, CHẠY CON, DISK, QUA MẶT CHA
                    //chấp Cha không có code, con qua mặt giùm
                    //Ba cứ nói Con làm cho
        //Paint() chính là hiện tượng đa hình xuất hiện
        //POLYMORPHISM, BIẾN THỂ CỦA CÙNG MỘT HÀM PAINT()


        //Nếu cố tình new Cha thì sao thưa thầy????
        //Vụ này thứ 4 tính, vì nó dính tới ANONYMOUS, DO CHA KHÔNG HOÀN HẢO, CONCEPT
        //KHÔNG NÊN NEW NHƯNG ..........


        //T4: ABSTRACTION/ENCAPSULATION/INHERITANCE/POLYMORPHISM

    }
}
