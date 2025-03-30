public class Main6 {
    public static void main(String[] args) {
        int a = 2, n = 10;
        long start = System.nanoTime();
        long result = power(a, n);
        long end = System.nanoTime();
        double timeTaken = (end - start) / 1e6;
        System.out.println(result);
        System.out.println( timeTaken );
    }
    public static long power(int a, int n) {
        if (n == 0) return 1;
        long half = power(a, n / 2);
        if (n % 2 == 0) return half * half;
        else return half * half * a;
    }
}
