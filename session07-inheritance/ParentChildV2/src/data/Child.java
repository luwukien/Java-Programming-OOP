package data;

/**
 * @author Chi Kien-Luu | github/luwukien
 * Initialize Date: 30/11/2024
 */
//1. Khi ta phát hiện ra IS-A giữa các Khuôn , đọc 1 chiều thôi
//2. Tạo đặc điểm
//      2.1 Nếu con trùng đặc điểm hết với Cha, Con dùng lại hết
//      Không cần khai báo dđ cho Con
//          Rect: c, o, w, l
//          Square: c, o, e, e, smile (nụ cười)
//      2.2. Con có quyền có đặc điểm riêng khác Cha, biến dị
//      cứ khai báo như mọi class bình thường, mình đang làm Khuôn
//      có những cái mình làm biếng, xài lại cho rồi
//      có những thứ không dùng lại được, muốn thì thỏa hiệp với cha
//      3. Phễu, nhớ Con giữ bản sắc, nếu cần thì thỏa hiệp với cha

public class Child extends Parent {
    //con học cách của Cha 2 tài sản, và con làm riêng được 1 món
    private String assestThree;
    //phễu phải đổ cho 3 món, 2 món cho Cha + 1 món riêng


    public Child(String assetOne, String assetTwo, String assestThree) {
        super(assetOne, assetTwo);
        this.assestThree = assestThree;
        //super(assetOne, assetTwo);
        //super luôn phải là câu lệnh đầu tiên trong phễu con
        //lý do: new Cha rồi mới có chỗ mở rông thêm cho con
        //có cha rồi mới có con
    }

    public String getAssestThree() {
        return assestThree;
    }

    public void setAssestThree(String assestThree) {
        this.assestThree = assestThree;
    }

    public void showProfile() {
        System.out.println("CHILD > " + "asset1: " + assetOne + " asset2: " + assetTwo + "; asset3:" + assestThree);
    }

    //dị biệt
    public void sayHi() {
        System.out.println("Hey, I am a rich kid");
        System.out.println("By the way, my 3rd asset is: " + assestThree);
    }
}
