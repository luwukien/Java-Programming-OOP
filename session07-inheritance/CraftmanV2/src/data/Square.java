package data;

/**
 * @author Chi Kien-Luu | github/luwukien
 * Date: 11/23/2024
 */

// phát hiện 1 điều thú vị: HV IS A (KIND OF), A SPECIAL CASE, A VÉION
//                                             HCN
//nói ngắn gọn: HV là HCN, luôn đúng, đọc 1 chiều thôi nhen
//                          dư sức tham dự vào mảng HCN
//độ lại 1 Khuôn mới từ Khuôn cũ, mới có được câu HV là phiên bản mới,
//                                            từ HCN
//HV là HCN, khuôn HV rõ ràng là 1 dạng khuôn HCN
//V, CN CÙNG NHÀ, CHUNG MẢNG, FOR SẮP XẾP ĐƯỢC
//cách tiếp cận sự tương đồng giữa các khuôn, kế thừa dùng lại
//INHERIT/INHERITANCE
// viếp theo cách cũ: 2 khuôn độc lập, không chung mảng
//              kế thừa: 2 anh em chung nhà
//kế thừa chỉ dành cho gần giữ người nhà, series phiên bản
//HCN gọi tên là class CHA, parent, super, base, phiên bản gốc
//                      con, child, sup, derived(dẫn xuất)
//HV là HCN, cho nên HV sẽ có tất cả mọi thứ mà HCN có, không cần viết lại
//HV là HCN, nó phỉa hành xử như HCN, hàm xài luôn
//KẾ THỪA KHÔNG PHẢI LÀ COPY/PASTE NHƯ HỒI NÃY, ĐÀY LÀ CÁCH LƯỜI GÕ CODE
//KẾ THỪA LÀ SXAIF LẠI 100% KHÔNG CẦN GÕ LÀ CODE - ĐÚNG NGOÀI ĐỜI LUÔN

//khi chơi với kế thừa, phải tôn trọng phễu của con
//Vuoong trước khi chời với Rectangle, V vẫn là V, phễu có 3 tham số
//để dúc 1 V: owner, color, edge
//phễu V vần cần, Khuôn cần có phễu nhận vật liệu
//              phễu chảy thằng lên CN, vì V là CN
//              dũ liệu của V chính là dữ liệu CN
//
//2!!!!!! Nhân tử chung

//3!!!!!!!
public class Square extends Rectangle {
    public Square(String owner, String color, double edge) {
        super(owner, color, edge, edge);
        //dung hòa cha con, đọc hay lắm luôn
        //HV có cạnh edge chính là HCN có cạnh edge, edge

    } //super chính là ~~~ new Rectangel(o, c, w, l);
    //      đẩy/đổ vật liệu cho Cha giữ giùm, vì không cần làm lại
    //new Square() - > cắt HV, tọa HV
    //                  chính là cắt HCN
    //new Square() chính là new HCN(), cắt HV, chính là cắt HCN
    @Override
    public String toString() {
        return "Square{" +
                "owner='" + owner + '\'' +
                ", color='" + color + '\'' +
                ", edge=" + edge +
                '}';
    }
    public double getArea() {
//        return  edge * edge; //tao éo in, return để re-use hơi khác
        return Math.pow(edge, 2); //edge^2
    }


    public void paint() {
        System.out.printf("|SQUARE   |%15s|%-10s|%4.1f|  - |%7.2f|\n", owner, color, edge, getArea());
    }

}




