import data.Disk;
import data.Rectangle;
import data.Square;

/**
 * @author Chi Kien-Luu | github/luwukien
 * Date: 11/23/2024
 */
// don't fix
public class craftsMan {
    public static void main(String[] args) {
//        cutShapes();
        sortShapes();
    }

    public static void sortShapes() {
        Rectangle r1 = new Rectangle("TIA", "PINK",1.0, 2.0);

        Rectangle rectArr[] = new Rectangle[3];
        //9 biến React, reactArr[0] .... [8]
        //~~ lớp có 30 ghế ngồi, nhưng chưa có bạn nào
        //rectArr[i] ~ cần lắm luôn 1 tọa độ vùng new/clone Student(...);
                                        //réo quan tâm new cũ hay mới
                                        //chỉ quan tâm tọa độ new Rectangle
        rectArr[0] = r1; //2 chàng một nàng
        //chứng minh
//        rectArr[0].paint(); //TIA
//        rectArr[0].setOwner("Tia Yeu");
//
//        r1.paint();

        rectArr[1] = new Rectangle("MA", "Pink", 5.3, 4.0);
        rectArr[2] = new Rectangle("Be Na", "Rainbow", 1.9, 5.2);
        rectArr[3] = new Square("GHỆ BÉ NA", "RAINBOW", 1.0);

        //HV làm sao ở chung mảng chữ nhật được, và ngược lại, và còn tròn
        //chúng ta không cùng hệ, cùng loại, làm sao chung mảng
        //mảng khai báo nhiều biến cùng kiểu, V, TR, CN khác kiểu không chung mảng
        //không chung mảng, không for tự động, không sort chung
        //sort riêng 3 mảng nói làm gì?
        //CẦN 1 MẢNG GÌ GÌ ĐÓ CHỨA VƯƠNG, CN, TR ..... - FOR, ĐẢO GÌ ĐÓ
        //SORT ĐƯỢC CẢ ĐÁM -> MẢNG GÌ ĐÓ NÓ LÀ CÁI GÌ????

        System.out.println("The rectangle list before sorting");
//        for (Rectangle x : rectArr) {
//            x.paint(); //x = arr[i] x và [i] cùng trò vùng new
//        } //cấm for hết mảng nếu mảng chưa full, chỉ FOR đến chỗ gán thật

        for (int i = 0; i < 3; i++) {
            rectArr[i].paint();
        }
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3 - i - 1; j++) {
//                if (rectArr[j].getArea() > rectArr[j + 1].getArea()) {
//                    Rectangle t = rectArr[j];
//                    rectArr[j] = rectArr[j + 1];
//                    rectArr[j + 1] = t;
//                }
//            }
//        } //bubble sort
        for (int i = 0; i < 3 - 1; i++) {
            for (int j = i + 1; j < 3 ; j++) {
                if (rectArr[i].getArea() > rectArr[j].getArea()) {
                    Rectangle t = rectArr[i];
                    rectArr[i] = rectArr[j];
                    rectArr[j] = t;
                }
            }
        }
        System.out.println("After sorting");
        for (int i = 0; i < 3; i++) {
            rectArr[i].paint();
        }
    }

    public static void cutShapes() {
        Rectangle r1 = new Rectangle("Mother", "PINK", 1.0, 2.0);
        r1.paint();

        Square s1 = new Square("Father", "Pink", 3.0);
        s1.paint();

        Disk d1 = new Disk("BE NA", "RAINBOW", "<3", 2.0);
        d1.paint();

    }
}


