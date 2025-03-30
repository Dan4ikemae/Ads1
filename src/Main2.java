public class Main2 {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 4, 1};
        long start = System.nanoTime();
        double avg = favg(numbers);
        long end = System.nanoTime();
        double timeTaken = (end - start) / 1e6;
        System.out.println("Avg value is: " + avg);
        System.out.println("Time taken: " + timeTaken + " milliseconds");
    }
    public static double favg(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }
}
