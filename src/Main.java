
public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 1, 32, 3, 45};
        long start = System.nanoTime(); 
        int min = fmin(numbers);
        long end = System.nanoTime(); 
        double timeTaken = (end - start) / 1e6; 
        System.out.println("Minimum value is: " + min);
        System.out.println("Time taken: " + timeTaken + " milliseconds");
    }
    public static int fmin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
