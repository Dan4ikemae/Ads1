public class  Main10 {
    public static void main(String[] args) {
        int a = 32;
        int b = 48;
        long startTime = System.nanoTime();
        int result = gcd(a, b);
        long endTime = System.nanoTime();
        double timeTaken = (endTime - startTime) / 1e6;
        System.out.println(result);
        System.out.println(timeTaken);
    }
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
