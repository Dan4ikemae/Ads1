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
