public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 1, 32, 3, 45}; // Создаём массив чисел
        long start = System.nanoTime(); // Засекаем время начала
        int min = fmin(numbers); // Находим минимальное значение в массиве
        long end = System.nanoTime(); // Засекаем время окончания
        double timeTaken = (end - start) / 1e6; // Вычисляем время выполнения в миллисекундах
        System.out.println(min); // Выводим минимальное значение
        System.out.println(timeTaken); // Выводим время выполнения
    }

    public static int fmin(int[] arr) {
        int min = arr[0]; // Предполагаем, что первый элемент - минимальный
        for (int num : arr) { // Проходим по массиву
            if (num < min) { // Если найдём число меньше текущего минимума
                min = num; // Обновляем минимум
            }
        }
        return min; // Возвращаем найденное минимальное значение
    }
}
