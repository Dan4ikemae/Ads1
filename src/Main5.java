public class Main5 {
    public static void main(String[] args) {
        int n = 5;
        long start = System.nanoTime();
        long result = fibonacci(n);
        long end = System.nanoTime();
        double timeTaken = (end - start) / 1e6;
        System.out.println(n);
        System.out.println(timeTaken);
    }
    public static long fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
