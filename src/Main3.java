public class Main3 {
    public static void main(String[] args) {
        int n = 7;
        long start = System.nanoTime();
        boolean isPrime = checkPrime(n);
        long end = System.nanoTime();
        double timeTaken = (end - start) / 1e6;
        System.out.println(n );
        System.out.println(timeTaken);
    }
    public static boolean checkPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
