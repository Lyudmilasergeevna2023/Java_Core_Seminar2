package tasks;

public class NumberOfEvenElements {

    /** Написать метод, возвращающий количество чётных элементов массива.
     * countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
     *
     * @param numbers исходный массив чисел
     * @return количество чётных элементов массива
     */

    public int numberOfEvenElements (int[] numbers) {
        int count = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
