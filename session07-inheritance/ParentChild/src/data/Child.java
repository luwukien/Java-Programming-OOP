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
//          Square: c, o, e, e
//      2.2. Con có quyền có đặc điểm riêng khác Cha, biến dị
//      cứ khai báo như mọi class bình thường, mình đang làm Khuôn
//      có những cái mình làm biếng, xài lại cho rồi
//      có những thứ không dùng lại được, muốn thì thỏa hiệp với cha
public class Child extends Parent {
    public Child(String assetOne, String assetTwo) {
        super(assetOne, assetTwo);
    }
    @Override
    public void showProfile() {
        System.out.println("CHILD? " + "asset1: " + assetOne + " asset2: " + assetTwo);
    }

    //1 hàm mà Cha chưa có, dị biệt, lan đột biến
    //Nếu them vào cha, con có luôn không suy nghĩ do kế thừa

    public void sayHi() {
        System.out.println("Hey, I am a rich kid!!!");
    }
}
