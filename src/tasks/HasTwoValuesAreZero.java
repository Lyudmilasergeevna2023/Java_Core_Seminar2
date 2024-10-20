package tasks;

public class HasTwoValuesAreZero {

    /** Написать функцию, возвращающую истину, если в переданном массиве
     * есть два соседних элемента, с нулевым значением.
     *
     * @param numbers исходный массив чисел
     * @return true или false
     */

    public boolean hasTwoValuesAreZero(int[] numbers) {
        if (numbers.length <= 1) {
            System.out.println("В массиве недостаточно элементов!");
            return false;
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == 0 && numbers[i + 1] == 0) {
                return true;
            }
        }

        return false;
    }
}
