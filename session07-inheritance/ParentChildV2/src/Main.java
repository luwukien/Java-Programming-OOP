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


    }
}

//List<Student> list = new ArrayList();
//Cha                       Con