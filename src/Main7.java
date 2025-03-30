import java.util.Arrays;
public class Main7 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 2};
        int n = arr.length;
        long start = System.nanoTime();
        reverseArray(arr, 0, n - 1);
        long end = System.nanoTime();
        double timeTaken = (end - start) / 1e6;
        System.out.println(Arrays.toString(arr));
        System.out.println(timeTaken);
    }
    public static void reverseArray(int[] arr, int left, int right) {
        if (left >= right) return;
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        reverseArray(arr, left + 1, right - 1);
    }
}
