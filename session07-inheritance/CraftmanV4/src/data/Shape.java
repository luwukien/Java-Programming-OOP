package data;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Chi Kien-Luu | github/luwukien
 * Initialize Date: 04/12/2024
 */
//hình học là ông tổ, class CHA mà từ đay có 1 đàn con V, TR, CN, HBH, TG....
//đều thỏa cái cầu IS A MỘT CHIỀU
//Tư Duy Phiên Bản, 1 bản gốc có N phiên bản
@Getter
@Setter
@ToString
public abstract class Shape {
    //đặc điểm, hành vi và phễu như truyền thống
    protected String owner;
    protected String color;
    protected String borderColor; //màu đường bo cạnh
    //protected double a, b, c, d, e, f, radius;
    //để ở đau các kích thước: cha, con, cả 2
    //KO ĐƯỢC ĐỂ Ở CHA
    //VÌ đám con sẽ thừa kế hết, Cha có gì con có nấy
    //Disk nó ngoài cái việc có bk, nó còn có thêm cạnh, vài Disk
    //HCN ngoài 2 cạnh, cố nhiều cạnh, còn nhiều cạnh
    //TÚM LẠI, CẠNH LÀ CỦA TỪNG ĐỨA MỚI HỢP LÍ, DỊ BIỆT: tg là 3 cạnh, tr là bk
    //CN: 2 cạnh
    //KHI CHA CÓ NHIỀU CON, NHIỀU DỊ BIỆT XUẤT HIỆN, DỊ BIỆT Ở CON, GOM LÊN CHA CẢ ĐÁM
    //DỊ BIỆT
    //CHA: NHÂN TỬ CHUNG CỦA ĐÁM CON, ab + ac + ad + af -> a(b + c + d + f)
    //NGOÀI ĐỜIL BA/MÁ LÀ NHÂN TỬ CHUNG CỦA ĐÁM CON, TRAI GÁI KHÁC BIỆT KỆ
    //MẤY ANH EM TRONG NHÀ, GIỐN GEN BA MÁ, DI TRUYỀN TỪ BA MÁ, KẾ THỪA CHUNG TÀI
    //MỖI ANH EM LẠI CÓ SỰ DỊ BIỆT, CAO, THẤP, TRAI, GÁI, ĐEN, NGĂM NGĂM
    //                                  VÀO SG ĐỨA CHĂM CHỈ THÊM TIỀN
    //                                              ĐỪA LƯỜI BIẾNG


    //PHỄU và S, P
    //diện tích và chu vi??
    //Mày không nên là 1 đặc điểm, không nên là derived field/ biến được tính từ thằng
    //NÓ NÊN ĐƯỢC TÍNH TOÁN TỪ CÁC KÍCH THƯỚC, DO ĐÓ HỢP LÍ NHẤT NÓ PHẢI LÀ HMAF
    //hàm tính S, P đặt ở đâu: cha, con hay là cả 2
    //OOP: Đặc tính và hành vi --> mô tả 1 object
    //      tính hợp lí của hành động, hành động thuộc về object mà nó nhiều info nhất
    //                                          ENCAPSULATION


    //tính S, p ở con là hợp lí, vì ở đó mới có kích thuốc
    //ở cha có được hay không????
    //BẮT BUỘC PHẢI Ở CHA
    //Tính tự nhiên của 1 object: HH thì phải có S và chu vi, thứ đi kèm với hình học từ
    //thời sơ khia, chiếm bề mặt gọi là S, có nét cạnh, border có P, éo quan tâm
    //Bàn về tính hợp lí của định nghĩa hình học
//    public double getArea() {
        //phải return nào đó??
        //đéo biết return mấy, vì có cạnh đéo đâu mà tính
        //đưa cạnh lên thì KHÔNG ĐƯỢC, VÌ CẠNH LÀ DỊ BIỆT PHẢI Ở CON
//        return 0; //return địa 1 con số, không hợp lí
                //VÌ NẾU TAO NEW SHAPE(...) getArea() ra 0,
                //éo có hình S == 0
                //default 50 100 tùy, vô lí luôn, default không hợp
                //hình chưa biết loại gì, thì tính gì cũng vô nghĩa
        //

//    }

//    public double getPerimeter() {
//
//    }

    //S VÀ P CHỈ LÀ Ý TƯỞNG, KHÁI NIỆM THÔI MÀ, ĐỊNH NGHĨA RA 1 THỨ MÀ
    //OBJ CẦN PHẢI CÓ, NHƯNG CHƯA NÓI CỤ THỂ
    //TỒN TẠI MÀ LẠI VÔ HÌNH, DT,CV LÀ 1 KHÁI NIỆM ĐỂ NÓ VỀ ĐỌ RỘNG, ĐỒ DÀI
    //TỒN TỊA ĐỂ NÓI VỀ KHÁI NIỆM, HỮ MÀ LẠI VÔ, GỌI LÀ TRỪU TƯỢNG, ABSTRACT
    //CHỈ NÓI VẬY THÔI HENG, TỪ TỪ TÍNH, Ý TƯỞNG THÔI, Ý NIỆM NIỆM THOY
    //ĐĨNH NGHĨA THÔI, MÔ TẢ THOY, TỪ TỪ TÍNH
    //KHIẾN HCO OBJECT VẪN RÕ RÀNG Ý NGHÃI MÔ RẢ, NHƯNG NÓ LẠI ĐỦ CHUNG CHUNG
    //NHƯNG CHƯA CẦM NẮM RÕ ĐƯỢC
    //MANG T/X MÔ TẢ LÀ CHỦ YẾ
    //MẸ KIẾP, HÌNH HỌC BẢN THÂN ĐÃ LÀ CHUNG CHUNG, VỀ TAO CÁI HÌNH, HỎI LẠI
    //NGAY, HÌNH GÌ????

    //khi ta chỉ mô tả ý tưởng ta chỉ mô tả khái niệm cái về trừu tượng
    //chỉ nêu ra mà không nói chi tiết
    //ABSTRACT, HÀM CHỈ MANG TÍNH CHẤT BIỂU TRƯNG Đ/N ĐỂ TRỌN VẸN VIỆC
    //MÔ TẢ CÁI GÌ ĐÓ, HÀM ABSTRACT, HÀM KHÔNG CÓ CODE
    //KHUÔN TƯƠNG ỨNG/CHỨA HÀ ABTRACT NÓ ĐỊA DIỆN CHO 1 Đ/N Ý TƯỞNG
    //KHUÔN.ABSTRACT
    //NÓ CHÍNH LÀ HÌNH THƯỚC GOM NHÓM, GOM CLASS, PHÂN LOẠI MỨC CAO
    //GẶP RẤT NHIỀU TRONG CUỘC SỐNG DẠNG GOM KIỂU NAY

    //CLASS LÀ GOM OBJECT
    //THÌ ABSTRACT LÀ DẠNG GOM CLASS, NHỮNG CLASS CÓ ĐIỂM TƯƠNG ĐỒNG
    //CÀNG GOM CÀNG HCUNG CHUNG Ý TƯỞNG
    public abstract double getArea(); //éo cầm viết code, ý tưởng thôi mà
    public abstract double getPerimeter();
}
