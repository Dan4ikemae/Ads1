public class Main2 {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 4, 1};

        long startTime = System.nanoTime(); // Засекаем время

        double average = findAverage(numbers);

        long endTime = System.nanoTime(); // Конец измерения
        double timeTaken = (endTime - startTime) / 1e6; // Время в миллисекундах

        System.out.println("Average value is: " + average);
        System.out.println("Time taken: " + timeTaken + " milliseconds");
    }

    public static double findAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }
}
