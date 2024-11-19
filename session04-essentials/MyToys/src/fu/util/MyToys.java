package fu.util;

import java.util.Scanner;

//đây là Class, khuôn, chứa có đặc điểm/hành động/chứa các món đồ dùng chung
//cho mọi nơi - vì nó không nhớ cái gì cho riêng tư của nó
//LIBRARY/FRAMEWORK - chứa các hàm/biến(data) dùng chung cho nhiều công việc khác nhau
//của các dự án khác nhau

import java.util.Scanner;

public class MyToys {
    //đặc điểm/hành vi là static, cho người ta sờ thì thêm public
    //không nhớ cái gì của riêng mình
    //Một class bth thì vẫn có thể vừa static vừa non-static, tùy nhu cầu, cách thức
    //Math: hầu hết static
    //String: vừa non-static, vừa có static
    //System: hầu hết static

    public static final double PI = 3.1415;
    public static final double VAT = 0.1;
    public static final int MAX_ELEMENT = 500;

    //đẩy Scanner ra ngoài xài chung cho các hàm static của chúng ta, tại sao không???
    private static Scanner sc  = new Scanner(System.in);
    //private cho nhu cầu dùng nội bộ bên trong
    //FAP, LMS
    public static int getAnInteger(String inputMsg) {
        int n;
        do {
            try {
                System.out.println(inputMsg);
                //n = sc.nextInt(); -> để lại rác
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println("Do you know how to input an integer");
            }
        } while (true);
    }


    //final ~ const bên C, biến không cho thay đổi balue, trừ lần đầu tiên khai báo
    //HẰNG SỐ

    //trong quá trình làm app, việc nhập số là gặp lại nhiều lần
    //nhập 2 của 1 HCN, 3 cạnh 1 TG; sự lựa chọn menu 1....5, điểm tb, điểm thi môn khác
    //mỗi cú nhập, biến nhập, kèm theo: trôi lệnh, cà chớn - try catch - do-while
    //tách việc nhập số nguyền thành 1 hàm, gói chửi bới, trôi lệnh, nhập lại vào 1 chỗ
    //ta hứng kết quả trả về từ hàm, lấy để dùng, MyToys nhớ con số này làm gì
    //Math.sqrt(4) -> mình dùng, Math không cần nhớ, không cần non-static
    //new mà trả về kết quả cho người ta dùng, không cần nhớ, dùng nhiều ram làm gì, static là thượng sách

    public static int getAnInteger() {
        int n;
        do {
            try {
                System.out.println("Input an integer: ");
                //n = sc.nextInt(); -> để lại rác
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println("Do you know how to input an integer");
            }
        } while (true);
    }







}
