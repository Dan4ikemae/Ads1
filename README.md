public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 1, 32, 3, 45}; // создаем массив
        long start = System.nanoTime(); // начинаем время
        int min = fmin(numbers); //  находим минимум значение
        long end = System.nanoTime(); // конец времени
        double timeTaken = (end - start) / 1e6; //  находим в мс
        System.out.println(min); // принт мин значение
        System.out.println(timeTaken); // принт время 
    }

    public static int fmin(int[] arr) {
        int min = arr[0]; // первый элемент минимальный
        for (int num : arr) { // проходим по массиву
            if (num < min) { // если есть еще минимум значение 
                min = num; //  меняем минимум
            }
        }
        return min; // возвращаем минимальное значение
    }
}


public class Main2 {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 4, 1}; // создаем массив
        long start = System.nanoTime(); // начинаем время
        double avg = favg(numbers); // находим сред значение
        long end = System.nanoTime(); // конец времени
        double timeTaken = (end - start) / 1e6; // находим в мс
        System.out.println("Среднее значение: " + avg); // принт среднее значение
        System.out.println("Время выполнения: " + timeTaken + " миллисекунд"); // принт время выполнения
    }

    public static double favg(int[] arr) {
        int sum = 0; // сумма элементов
        for (int num : arr) { // проходим по массиву
            sum += num; // сумма всех 
        }
        return (double) sum / arr.length; // среднее значение и возвращаем
    }
}


public class Main3 {
    public static void main(String[] args) {
        int n = 7; // задаем число
        long start = System.nanoTime(); // начинаем время
        boolean isPrime = checkPrime(n); // проверяем простое ли число
        long end = System.nanoTime(); // конец времени
        double timeTaken = (end - start) / 1e6; // находим в мс
        System.out.println(n); // принт число
        System.out.println(timeTaken); // принт время выполнения
    }

    public static boolean checkPrime(int n) {
        if (n < 2) return false; // если меньше 2 то не простое
        for (int i = 2; i * i <= n; i++) { // проверяем делители от 2 до n
            if (n % i == 0) return false; // если делится без остатка то не простое
        }
        return true; // если не нашли делителей то простое
    }
}


public class Main4 {
    public static void main(String[] args) {
        int n = 5; // задаем число
        long start = System.nanoTime(); // начинаем время
        long fact = factorial(n); // находим факториал
        long end = System.nanoTime(); // конец времени
        double timeTaken = (end - start) / 1e6; // находим в мс
        System.out.println(fact); // принт факториал
        System.out.println(timeTaken); // принт время выполнения
    }

    public static long factorial(int n) {
        if (n == 0 || n == 1) return 1; // если 0 или 1 то факториал 1
        return n * factorial(n - 1); // рекурсивный вызов
    }
}

public class Main5 {
    public static void main(String[] args) {
        int n = 5; // задаем число
        long start = System.nanoTime(); // начинаем время
        long result = fibonacci(n); // находим число Фибоначчи
        long end = System.nanoTime(); // конец времени
        double timeTaken = (end - start) / 1e6; // находим в мс
        System.out.println(result); // принт результат
        System.out.println(timeTaken); // принт время выполнения
    }

    public static long fibonacci(int n) {
        if (n == 0) return 0; // если 0 то возвращаем 0
        if (n == 1) return 1; // если 1 то возвращаем 1
        return fibonacci(n - 1) + fibonacci(n - 2); // рекурсивный вызов
    }
}


public class Main6 {
    public static void main(String[] args) {
        int a = 2, n = 10; // задаем числа
        long start = System.nanoTime(); // начинаем время
        long result = power(a, n); // вычисляем a^n
        long end = System.nanoTime(); // конец времени
        double timeTaken = (end - start) / 1e6; // находим в мс
        System.out.println(result); // принт результат
        System.out.println(timeTaken); // принт время выполнения
    }

    public static long power(int a, int n) {
        if (n == 0) return 1; // любое число в степени 0 = 1
        long half = power(a, n / 2); // рекурсивно вычисляем половину степени
        if (n % 2 == 0) return half * half; // если n четное
        else return half * half * a; // если n нечетное
    }
}


import java.util.Arrays;

public class Main7 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 2}; // создаем массив
        int n = arr.length; // находим длину массива
        long start = System.nanoTime(); // начинаем время
        reverseArray(arr, 0, n - 1); // реверсируем массив
        long end = System.nanoTime(); // конец времени
        double timeTaken = (end - start) / 1e6; // находим время в мс
        System.out.println(Arrays.toString(arr)); // принт перевернутый массив
        System.out.println(timeTaken); // принт время выполнения
    }

    public static void reverseArray(int[] arr, int left, int right) {
        if (left >= right) return; // если левый индекс больше или равен правому останавливаем рекурсию
        int temp = arr[left]; // сохраняем элемент на левой позиции
        arr[left] = arr[right]; // меняем местами элементы
        arr[right] = temp; // присваиваем правому элементу левый
        reverseArray(arr, left + 1, right - 1); // рекурсивно вызываем для следующих элементов
    }
}


public class Main8 {
    public static void main(String[] args) {
        String s = "123456"; // задаем строку
        long start = System.nanoTime(); // начинаем время
        boolean result = isAllDigits(s, 0); // проверяем, состоит ли строка только из цифр
        long end = System.nanoTime(); // конец времени
        double timeTaken = (end - start) / 1e6; // находим время в мс
        System.out.println(s + " " + result ); // принт строку и результат
        System.out.println(timeTaken ); // принт время выполнения
    }

    public static boolean isAllDigits(String s, int index) {
        if (index == s.length()) return true; // если дошли до конца строки возвращаем true
        if (!Character.isDigit(s.charAt(index))) return false; // если текущий символ не цифра возвращаем false
        return isAllDigits(s, index + 1); // рекурсивный вызов для следующего символа
    }
}


public class Main9 {
    public static void main(String[] args) {
        int n = 7; // задаем n
        int k = 3; // задаем k
        long start = System.nanoTime(); // начинаем время
        int result = binomialCoeff(n, k); // находим биномиальный коэффициент
        long end = System.nanoTime(); // конец времени
        double timeTaken = (end - start) / 1e6; // находим время в мс
        System.out.println(result); // принт результат
        System.out.println(timeTaken); // принт время выполнения
    }

    public static int binomialCoeff(int n, int k) {
        if (k == 0 || k == n) return 1; // если k = 0 или k = n, то возвращаем 1
        return binomialCoeff(n - 1, k - 1) + binomialCoeff(n - 1, k); // рекурсивный вызов для C(n-1, k-1) + C(n-1, k)
    }
}



public class Main10 {
    public static void main(String[] args) {
        int a = 32; // задаем первое число
        int b = 48; // задаем второе число
        long startTime = System.nanoTime(); // начинаем время
        int result = gcd(a, b); // находим НОД
        long endTime = System.nanoTime(); // конец времени
        double timeTaken = (endTime - startTime) / 1e6; // находим время в мс
        System.out.println(result); // принт НОД
        System.out.println(timeTaken); // принт время выполнения
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a; // если b 0, то НОД  a
        return gcd(b, a % b); // рекурсивный вызов для нахождения НОД
    }
}
