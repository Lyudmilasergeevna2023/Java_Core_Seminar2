package tasks;

public class DifferenceBetweenElements {

    /** Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами
     * переданного не пустого массива.
     *
     * @param numbers Принимает массив
     * @return разница между максимальным и минимальным элементами
     */

    public int differenceBetweenElements (int[] numbers) {
        if (numbers.length <= 1) {
            System.out.println("В массиве недостаточно элементов!");
            return 0;
        }

        int max = numbers[0];
        int min = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        return max - min;
    }
}
