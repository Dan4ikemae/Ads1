public class  Main9 {
    public static void main(String[] args) {
        int n = 7;
        int k = 3;
        long start = System.nanoTime();
        int result = binomialCoeff(n, k);
        long end = System.nanoTime();
        double timeTaken = (end - start) / 1e6;
        System.out.println(result);
        System.out.println(timeTaken);
    }
    public static int binomialCoeff(int n, int k) {
        if (k == 0 || k == n) return 1;
        return binomialCoeff(n - 1, k - 1) + binomialCoeff(n - 1, k);
    }
}
