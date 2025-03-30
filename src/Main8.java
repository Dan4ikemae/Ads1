public class Main8 {
    public static void main(String[] args) {
        String s = "123456";
        long start = System.nanoTime();
        boolean result = isAllDigits(s, 0);
        long end = System.nanoTime();
        double timeTaken = (end - start) / 1e6;
        System.out.println(s + " " + result );
        System.out.println(timeTaken );
    }

    public static boolean isAllDigits(String s, int index) {
        if (index == s.length()) return true;
        if (!Character.isDigit(s.charAt(index))) return false;
        return isAllDigits(s, index + 1);
    }
}
