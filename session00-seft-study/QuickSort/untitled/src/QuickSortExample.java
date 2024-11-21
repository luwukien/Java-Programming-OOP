
/**
 * @author Chi Kien-Luu | github/luwukien
 * Date: 11/21/2024
 */

public class QuickSortExample {

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2, 7, 1, 10};
        System.out.println("Mảng ban đầu:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);
    }

    // Phương thức chính của thuật toán Quick Sort
    public static void quickSort(int[] arr, int lowIndex, int highIndex) {
        // Điều kiện dừng: nếu mảng con có kích thước <= 1
        if (lowIndex >= highIndex) {
            return;
        }

        // Chọn pivot (ở đây chọn phần tử cuối cùng)
        int pivot = arr[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex - 1;

        // Phân hoạch (partition)
        while (leftPointer <= rightPointer) {
            // Di chuyển leftPointer đến phần tử >= pivot
            while (leftPointer <= rightPointer && arr[leftPointer] < pivot) {
                leftPointer++;
            }
            // Di chuyển rightPointer đến phần tử <= pivot
            while (leftPointer <= rightPointer && arr[rightPointer] > pivot) {
                rightPointer--;
            }
            // Hoán đổi nếu leftPointer và rightPointer chưa vượt qua nhau
            if (leftPointer <= rightPointer) {
                swap(arr, leftPointer, rightPointer);
                leftPointer++;
                rightPointer--;
            }
        }

        // Đưa pivot vào đúng vị trí
        swap(arr, leftPointer, highIndex);

        // Gọi đệ quy cho hai phần mảng
        quickSort(arr, lowIndex, leftPointer - 1); // Phần bên trái pivot
        quickSort(arr, leftPointer + 1, highIndex); // Phần bên phải pivot
    }

    // Phương thức hoán đổi hai phần tử trong mảng
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Phương thức in mảng
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
