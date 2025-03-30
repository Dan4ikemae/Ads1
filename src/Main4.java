public class Main4 {
    public static void main(String[] args) {
        int n = 5;
        long start = System.nanoTime();
        long end = System.nanoTime();
        double timeTaken = (end - start) / 1e6;
        System.out.println(n);
        System.out.println(timeTaken);
    }
    public static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
}
