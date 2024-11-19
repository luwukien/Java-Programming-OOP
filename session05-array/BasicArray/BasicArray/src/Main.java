import data.Student;

public class Main {
    public static void main(String[] args) {
//        playWithPrimitiveArrayV3();
//        playWithStudentObject();
        playWithStudentArray();
    }

    public static void playWithStudentArray() {
        //lưu hồ sợ 10 bạn SV
        //10 biến/tên tắt + 10 new() tức là value á
        //lưu 10 số tự nhiên
        //10 biến/tên tắt + 10 value đơn
        //int a1, a2, a3,...
//        int arr[] = new int[10]; //arr[0] ~ int x; arr[1] ~ int y
                                //~value đơn từ từ

//        Student s1, s2, s3, ......// Lẻ -> khốn nạn
        Student s1;

        Student list[] = new Student[3]; //đừng nhầm lần khi new, 2 loại new
                                            //() gọi constructor 1 object
                                            //[] tao cần ? biến đối tượng
        //[] dành cho nhiều biến, nhiều biến tên gọi tắt
        list[0] = new Student("SE204365", "NGUYEN VAN A", 2024, 5.6);
        list[1] = new Student("SE204366", "NGUYEN VAN B", 2025, 5.7);
        list[2] = new Student("SE204367", "NGUYEN VAN C", 2026, 5.8);
        //mấy con trỏ còn lại mang giá trị gì
        //list[3] .... list[9] ??????? 0 LÀ DEFAULT
        //                              TRỎ VÀO TỌA ĐỘ 0 CỦA RAM, ĐỊA CHỈ 0 LÀ RAM
        //                              BYTE DẦU TIÊN TRONG THANH RAM TOÀN LÀ SỐ OFFOFFOFFOFF
        //tức là bye đầu tiền(thứ 0) tọa độ thứ 0 của ram chứa toàn số 0
        //byte NULL BYTE không có gì cả, toàn bộ 0
        //in mảng cái coi
        System.out.println("The list of students");
//        for (int i = 0; i < list.length; i++) {
//                list[i].showProfile();
//           //tao chỉ là 1 biến Student thôi mà
//        }
        s1 = null; //tao trỏ đáy ram heng, null heng, làm biếng new
                    //có value rồi, số 0, tọa độ 0 ở đáy ram, đi vào  00000000
        s1.showProfile(); //có mẹ gì mà show, NullPointerException
        // NGUYÊN TẮC KHI CHƠI VỚI MẢNG PHẢI LÀ: BIẾN COUNT ĐỂ CHO BIẾT
        //MẢNG ĐÃ GÁN VALUE ĐẾN ĐÂU, FOR ĐẾN ĐÓ, KHÔNG FOR ĐẾN .LENGTH
        //BỊ DEFAULT VỚI PRIMITIVE, BỊ NULL VỚI OBJECT

    }

//    public static void playWithStudentArray() {
        //lưu hồ sợ 10 bạn SV
        //10 biến/tên tắt + 10 value phức tạp - 10 nhát new() cáis   đã
        //lưu 10 số tự nhiên
        //10 biến/tên tắt + 10 value đơn
 //arr[0] ~ int x; arr[1] ~ int y
        //~ value đơn từ từ
//        Student a[] = new Student[];
//    }
    public static void playWithStudentObject() {

        Student x = new Student("SE123456", "AN NGUYỄN", 2006, 5.6);
        x.showProfile();
    }
        public static void playWithPrimitiveArrayV3() {
        int arr1[] = {5, 10, 15, 20}; //new ngầm, không nói rõ việc new, thực ra là có
        int arr2[] = new int[5];
        int arr3[] = new int[]{5, 10, 15, 20};

        int arr[];

        arr = new int[5];
        //có nhiều biến trùng tên rồi, sau đó xài từng biến theo nhu cầu
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 15;

        //arr là cái gì - mày là 1 biến đb. mày là biến object luôn , vì trỏ 1 vùng new bự
        //có quyền chấm, chấm cái gì??? tệ nhất là .toString()
        //arr là biến phức tập vì nó có nhiều info bên trong, info này là
        //phần tử của mảng
        //arr[0] ~~~~~ arr.get(thằng thứ 0) -> được 5/ arr[0] được 5
        //arr.length - biến lưu đặc điểm của cái mảng, có bao nhiêu phần tử
        //  -->> static / non => non-static
        //arr.length; //hằng số đặc biệt ăn theo từng mảng, mỗi mảng sẽ khác nhau size

        System.out.println("Array has: " + arr);
                                                //gọi thầm tên em, convert data của các biến thành mã hexa

        for (int i = 0; i < 10; i++)
            System.out.println(arr[i] + " ");


    }
//        float v[] = {0, 0, 5, 10, 20, 25}; //mảng có 7 phần tử, có sẵn luôn value
////        //7 biến float v[0] = 0; v[1] = 0, ...
////        //biến float nằm trên HEAP đấy, có new ngầm đấy, có malloc() đấy;
////        System.out.println("The array has values of (printed by individual)");
////
////        v[0] = 6868;
////        System.out.println(v[0] + ";" + v[1] + ";" + v[2]);
////        for(int i = 0; i < 10; i++) {
////            System.out.println(v[i] + " ");
////        }
////
////        //ta có thể xem nagr như là 1 tâp hợp các value trong dấu {} giống Toán
////        //ta có thể xài khái niệm với mọi, với mỗi để duyệt qua toàn bộ mảng
////        System.out.println("\nThe array v has value of (using )");
////        for (float x : v) {
////            System.out.println(x +  " ");
////        }
////
//        double arr[] = new double[100]; //default gần hết = 0
//                                        //new () là phễu để đúc object!!!!!!!
//        //em muốn có 365 biến double, nó là biến lẻ nè
//
//        arr[0] = 39;
//        arr[1] = 79;
//        arr[2] = 6868;
//        arr[3] = 2205;
//        System.out.println("The array has value of (for i): ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//        //arr[0] éo xổ gì vì nó là biến primitive
//        //arr.length
//        //dù là mảng primitibve hay mảng mẹ gì chưa biết
//        //tên mảng là biến objectm biến con trỏ, ref
//        //tao sẽ trỏ vùng ram chà bá lửa new đó, không đúc truyền thống
//        //                                                  mà đúc nhiều biến
//        //mà mì sẽ quảng lý bao nhiêu cháu dưới quyền, dđ của má mì
//        //má mì chấm ra được số lính
//        //arr.
//
////        N = {0, 1, 2, 3, 4, 5, 6, 7, ,8, ...};
////        V x e N, x là mấy, x là bất kì trong N
////                x = 0, x = 1, x = 2, x = 3
//                //với mọi là kĩ thuật quét qua mảng
//        //dùng đèn pin quét từ đầu tới cuối mảng
//        //duyệt qua tất cả phần tử của tập hợp//        float v[] = {0, 0, 5, 10, 20, 25}; //mảng có 7 phần tử, có sẵn luôn value
//////        //7 biến float v[0] = 0; v[1] = 0, ...
//////        //biến float nằm trên HEAP đấy, có new ngầm đấy, có malloc() đấy;
//////        System.out.println("The array has values of (printed by individual)");
//////
//////        v[0] = 6868;
//////        System.out.println(v[0] + ";" + v[1] + ";" + v[2]);
//////        for(int i = 0; i < 10; i++) {
//////            System.out.println(v[i] + " ");
//////        }
//////
//////        //ta có thể xem nagr như là 1 tâp hợp các value trong dấu {} giống Toán
//////        //ta có thể xài khái niệm với mọi, với mỗi để duyệt qua toàn bộ mảng
//////        System.out.println("\nThe array v has value of (using )");
//////        for (float x : v) {
//////            System.out.println(x +  " ");
//////        }
//////
////        double arr[] = new double[100]; //default gần hết = 0
////                                        //new () là phễu để đúc object!!!!!!!
////        //em muốn có 365 biến double, nó là biến lẻ nè
////
////        arr[0] = 39;
////        arr[1] = 79;
////        arr[2] = 6868;
////        arr[3] = 2205;
////        System.out.println("The array has value of (for i): ");
////        for (int i = 0; i < arr.length; i++) {
////            System.out.print(arr[i] + " ");
////        }
////
////        //arr[0] éo xổ gì vì nó là biến primitive
////        //arr.length
////        //dù là mảng primitibve hay mảng mẹ gì chưa biết
////        //tên mảng là biến objectm biến con trỏ, ref
////        //tao sẽ trỏ vùng ram chà bá lửa new đó, không đúc truyền thống
////        //                                                  mà đúc nhiều biến
////        //mà mì sẽ quảng lý bao nhiêu cháu dưới quyền, dđ của má mì
////        //má mì chấm ra được số lính
////        //arr.
////
//////        N = {0, 1, 2, 3, 4, 5, 6, 7, ,8, ...};
//////        V x e N, x là mấy, x là bất kì trong N
//////                x = 0, x = 1, x = 2, x = 3
////                //với mọi là kĩ thuật quét qua mảng
////        //dùng đèn pin quét từ đầu tới cuối mảng
////        //duyệt qua tất cả phần tử của tập hợp
}