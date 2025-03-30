
public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 1, 32, 3, 45};

        long startTime = System.nanoTime(); 

        int min = findMin(numbers);

        long endTime = System.nanoTime(); 
        double timeTaken = (endTime - startTime) / 1e6; 

        System.out.println("Minimum value is: " + min);
        System.out.println("Time taken: " + timeTaken + " milliseconds");
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

}
