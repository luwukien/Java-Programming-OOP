package main;

import data.Student;

public class Stage {

        public static void main(String[] args) {
//                checkObjectV4();
//                checkObjectV5();
//                checkObjectV6();
                Student ahihi = checkObjectV8(); //ahihi lưu tọa độ của An trong hàm thảy ra ngoài
                ahihi.showProfile();

        }
        //Hàm trả về 1 object hả thầy, không
        //đọc chuẩn: hàm trả về 1 tọa độ của object nào đó, vì trả được tọa độ nghĩa là
        //sờ được Object, có tọa đội chấm là tới Object
        //            Student x;
        public static Student checkObjectV8() { //~~~ Student x = sẽ là 1 vùng new

                Student x;
                x = new Student("SE204365", "AN NGUYỄN", 1999);
                return x; //Việt sub: x lưu tọa độ cùng clone AN, hướng 6M
                        //thảy tọa độ đó cho tên hàm, tên hàm là 6M, hướng 6M
        }

        public static void checkObjectV7() {

                Student x; //khai báo biến, khai báo con trỏ, nhưng chưa trỏ ai;
                //tao với mày nói về thằng x kia đi, ai dợ, từ từ sẽ nói
                int a;
                a = 10;

                x = new Student("SE204365", "AN NGUYỄN", 1999);
                // là nó đây nè
                //x = new();
        }

        public static void checkObjectV6() {

                //câu chuyện của sinh ra rồi chết non
                //câu chuyện vô danh tên gọi
                //object không thèm, không có tên gọi, vẫn hành xử được

                Student s1 = new Student("SE204365", "AN NGUYỄN", 1999);
                //              đã tương đương với tọa độ rồi, thảy tọa độ đó đi đâu rồi
                //               thầy cho biến object nào đó giữ giùm tọa độ
                //biến đó mà chấm nghĩa là tọa độ chấm
                //vì biến có tọa độ từ new, CHỐT HẠ: NEW NẮM TỌA ĐỘ
                //chấm là vào trong tọa độ xem có cái gì, trong object có gì

                new Student("SE666789", "AN NGUYỄN", 2002).showProfile();
                //không thèm đặt tên cho object để giao tiếp, để object tự giao tiếp
                //objcet vô danh, anonymous object, object was created without a name, a reference
                //Muốn reuse lại vùng new, tối thiểu ít nhất một tên gọi, 1 biến object
                //để còn chấm tiếp


        }


        public static void checkObjectV5() {
                Student s1 = new Student("SE204365", "AN NGUYỄN", 1999);
                Student x = s1; //mày là biến lưu tọa dộ vùng new, cho tao tọa độ đi
                //mày là biến lưu tọa độ vung new, cho tao tọa độ đi

                s1.showProfile();
                x.showProfile();
                //chứng minh 2 chàng trỏ đúng 1 nàng
                //chàng 1 tát, chàng 2 thấy
                s1.setNameStudent("MÌNH CHƠI Ú TÌM NHEN");
                //Trong vùng clone new AN đã bị thay đổi name thành MÌNH CHƠI....
                System.out.println("After TÁT: ");
                //KHÔNG THÈM HỎI S1, HỎI LUÔN X XEM SAO
                x.showProfile();

                //nhiều tên cùng tham chiếu 1 object;
                //tí, tèo -> (Mình...)
                //hoàng, gì, xàm, đa cấp, cp -> (Tui)

                //Cùng 1 tên mà ám chỉ nhiều object khcas
                //sếp = ST;
                //sếp = gã trả lương
                //THAY ĐỔI VALUE CỦA BIẾN

                //MỘT OBJECT CÓ NHIỀU NGƯỜI NGƯỚC NHÌN, THAM CHIẾU



        }

        public static void checkObjectV4() {
                Student s1 = new Student("SE204365", "AN NGUYỄN", 1999);
                Student x = s1; //mày là biến lưu tọa dộ vùng new, cho tao tọa độ đi
                //nếu tao tự new như mày, không lẽ, sai, ra vùng clone mới

                s1 = new Student("SE204888", "LỘC NGUYỄN", 1999);

                //trước khi s1 trỏ tọa độ mới, backup tọa độ cũ là xong
                //giữ lại được AN
                s1.showProfile(); //LP
                //int a = 10; a = 100;
                System.gc();
                x.showProfile(); //AN đã trở lại, backup tọa độ vào một biến con trỏ khác
        }

        public static void checkObjectV3() {
                Student s1 = new Student("SE204365", "AN NGUYỄN", 1999);
                s1 = new Student("SE204888", "lỘC PHÁT", 2005);
                //con diều AN đứt dây
                //vì sợi dây nối với diều mới LP

                //s1 li dị vùng clone AN, chuyển sang kết nối với LP

                // s1 đang nắm/lưu tọa độ vùng ram object trong HEAP
                //new làm được kì nhiều việc
                //1. clone Khuôn(object và static)
                //2. gọi phễu đổ data vào trong vùng clone
                //

                //                int a = 10; a = 100;
                //s1 là biến object
                //tui cần lắm luôn 1 tọa độ vùng clone, vùng clone Student

                s1.showProfile();
                //mất tọa độ vùng clone AN
                //vùng ram không có ai trỏ tới, tjif định kì chạy app, JVM
                //sẽ kiểm soát app của bạn giết/clear vùng clone không có con trỏ
                //CTY JVM có đoạn code, module giám sát HEAP, xem đứa nào mồ côi, không có con trỏ
                //giết ngay và luôn (độ trẻ if nay) --free(con trỏ trong C)
                //anh giám sát này gọi là Garbage value

                //ngoài đời có gán lại biến con trỏ, tên tắt cho thứ phức tạp
                //sếp = CS ST(...);
                //chết cha sếp kìa, sếp = (ông, gã chấm lương cho mình, qđ mình tăng lương hay)
                //tí = mày, tao ở nhà ba má gọi
                //tí  = Ngô Văn Thanh & câu truyện Trạng Tí

        }

        public static void checkObjectV2() {
                Student s1 = new Student("SE204365", "AN NGUYỄN", 1999);
                Student s2 = new Student("SE204365", "AN NGUYỄN", 1999);

                s1.setNameStudent("AI RỒI CŨNG KHÁC");
                s1.showProfile();
                s2.showProfile();

        }

        public static void checkObject(String[] args) {
        Student s1 = new Student("HE204365", "LUU CHI KIEN", 2006);
        //reference var             object, vùng ram bự trong HEAP
        //object var                instance, thể hiện, hiện thân, bức tượng


        s1.showProfile();
        //s1 đang nắm/lưu tọa độ vùng ram object trong HEAP
        //new đang làm cực kì nhiều việc
        //              1.clone Khuôn(object và static)
        //              2. gọi phễu đổ data và vùng clone
        //              3. chốt lại tọa độ vùng new vừa rồi, đem tọa độ đó đi gán biến con trỏ

        //s1 là biến, vậy nó có thể thay đổi value!!!!
        //sếp với bạn trẻ đang trỏ đến CaSi Sơn Tùng
        //sếp với người đi làm, trỏ đến ông/bà quyết định lương cho mình

        Student x = s1; //2 con trỏ trỏ cùng vùng new, 2 chàng trỏ 1 nàng

        s1 = new Student("SE20000", "BÌNH LÊ", 1998);
        s1.showProfile();

        System.out.println("Kiên after s1 từ chối chơi cùng");
        //AN cũ à nhen
        x.showProfile();
        //nếu 2 con trỏ cùng trỏ một vùng new, sẽ xảy ra hiện tượng 2 con trỏ trỏ 1 vùng ram điều đấy
        //sẽ xảy ra hiện tượng khi mà một biến sửa đổi giá trị của object mà biến khác cùng đang tham chiếu đến
        //tức là 2 obj1, obj2 cùng tham chiếu đến một class khi mà tao đổi value của obj1  thì obj 2 cũng sẽ thay đổi theo




        //AN NGUYỄN không còn ai trỏ, không còn cách nào lấy lại được vùng RAM này

        //biến object là tay cầm con diều, new chính là con diều
        //khi tay cầm nối dây với con diều mới thì con diều cũ, đứt sợi dây, mất con diều cũ
        //1 vùng RAM new OBJECT mà không còn ai trỏ tới, thì JVM có chương trình ngầm gọi là
        //GARBAGE COLLECTOR, ĐI GOM NHỮNG VÙNG NEW NÓ KHÔNG CÒN TRỎ, DỌN FREE RAM FREE HEAP
        //trả lại ram không xài cho new sau này

        //1 biến có quyền trỏ vùng new, giữ lại AN được không, mà vẫn có BÌNH

        //VI DIỆU, VỀ SUY NGHĨ VỀ ĐIỂU GÌ ĐANG DIỄN RA
        new Student("SE20444", "Đại Gia", 2002).showProfile();
        //đây nó chỉ làm dùng được tạm thời không thể tái sử dụng một lần nữa.
        //bởi vì nó không được gán với một ref var hay obj var
        //đây cũng chỉ là tạo một obj mới vùng new có chỗ nhớ riêng

    }
}
