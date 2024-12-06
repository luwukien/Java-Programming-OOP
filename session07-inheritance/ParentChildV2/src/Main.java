import data.Child;
import data.Parent;

public class Main {
    public static void main(String[] args) {
        playWithParentChild();
    }
    public static void playWithParentChild() {
        //Khai Cha = new Cha
        //khi chấm xổ ra tất cả nhuwgnx gì của KHuôn cha
        //KHAI BÁO THẾ NÀO, XỔ RA NHƯ THẾ
        //DANH XƯNG THẾ NÒA THÌ CƯ CỬ NHƯ THẾ, DANH XƯNG ĂN THEO KHUÔN MÀ

        Parent p = new Parent("BIỆT THỰ", "1000BTC");
        p.showProfile();

        //Khai con new con, chấm xổ ra tất cả của cha(Thừa kế) của riêng con
        //                  xổ ra con, C.thuc: gồm new cha + extend

        Child c1 = new Child("Nhà Phố", "1000ETH", "DU THUYỀN");
        c1.showProfile();// sẽ in là parent, nếu không chịu override
//        c1.sayHi();

        //Khai con new cha
        //Child p = new Parent(...);
        //Child p1 = new Parent( "BIỆT THỰ", "1000BTC", "1000VND");
        //Square s = new Rectangle();

        //KHAI CHA NEW CON, đọc theo kiểu is-a
        //CHẤM THÌ XỔ RA GÌ??
        //Khai cha new con giống như trỏ gây sự ngoài đường
        //Mày biết bố tao là ai, dùng danh nghĩa người lớn đi hù
        //như vậy thì cư xử như người lớn
        //Khai Cha new Con chỉ xổ của Cha, không care con có gì khác biệt
        //ngoại trử Overide

        Parent c2 = new Child("Căn hộ", "DOGECOIN", "MOTOR");
        c2.showProfile();
        // Gọi cha nhưng chạy cho, duy nhất vậy
        //sayHi() mãi mãi không thấy, vì nằm ngoài tầm con trỏ Cha
        //Con vào SG đi chơi ở CyberCore đi đua xe; Ba không biết
//        c2.sayHi(); //rõ ràng có hàm này, vì new Child() chạm không tới, vì nó vẫn có
        //VẪN CÓ
        //chơi trò kéo giãn sợi thun, để đo đáy new Child(), lấy tọa độ của
        //new Child(), lẽ ra tọa độ có rồi, nhưng do ta xài con trỏ lưng chừng
        //trỏ Cha không trỏ đáy, giờ dò đáy, kĩ thuật ép chó thành mèo, CAST
        //ÉP KIỂU, CUA GẮT
        //dùng con trỏ tạm, để lưu tọa độ
//        Child tmp = new Child(); // nào đổ, tọa độ vùng new child. KHAI GÌ TRỎ VÙNG ẤY
////        playWithParentChild();
////
//        tmp = (Child)c2;
        //kẽo giãn con trỏ xuống đáy, (đáy new của Child()), lấy tọa độ thẩy cho tmp
        //là con trỏ Child, 2 chàng 1 nàng again.
        //1 chàng lưng chừng,1 chàng đáy new
//        tmp.sayHi();
//        tmp.showProfile();


        //cách trên tốn 1 biến ocn trỏ, tà chỉ cần tọa độ, cất đi dùng lại
        //hay dùng 1 lần rồi thôi, đều oke, new Dog(.......).bark();
//        ((Child)c2).không có ra sayHi() dấu chấm cực mạnh về độ ưu tiên
                    //hàm ý: sờ vùng ram của biến con trỏ
                    //gắn với đúng data type của biến con trỏ
                    //c2. Cha chấm, vào vùng nhớ Cha, vì biến kiểu Cha, chấm vào new
        ((Child) c2).sayHi();

    }
}

//List<Student> list = new ArrayList();
//Cha                       Con