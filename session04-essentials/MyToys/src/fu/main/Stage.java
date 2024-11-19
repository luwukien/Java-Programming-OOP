package fu.main;

import fu.util.MyToys;

public class Stage {
    public static void main(String[] args) {
        //MyToys.PI;
        System.out.println("PI: " + MyToys.PI);
//        MyToys.PI = 4.0;
        System.out.println("PI: " + MyToys.PI);
//        int n = MyToys.getAnInteger();
//        System.out.println("n: " + n);

        int choice;

        int n = MyToys.getAnInteger("Mời nhập lựa chọn của bạn (1...7): ");
        System.out.println("Lựa chọn của bạn là (your choice): " + n);
        MyToys.
    }
}
