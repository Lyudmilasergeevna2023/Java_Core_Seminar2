package tasks;

public class Main {
    public static void main(String[] args) {

        int[] numbers1 = {4, 3, 2, 1, 4, 6, 9, 0};
        int[] numbers2 = {7, 6, 0, 0, 4, 5, 6, 0, 0, 1};
        int[] numbers3 = {1, 10, 20, 5, 33, 0, 55, 0, 7};

        NumberOfEvenElements numberEvens = new NumberOfEvenElements();
        DifferenceBetweenElements difference = new DifferenceBetweenElements();
        HasTwoValuesAreZero zero = new HasTwoValuesAreZero();


        System.out.println(numberEvens.numberOfEvenElements(numbers1));
        System.out.println(numberEvens.numberOfEvenElements(numbers2));
        System.out.println(numberEvens.numberOfEvenElements(numbers3));

        System.out.println(difference.differenceBetweenElements(numbers1));
        System.out.println(difference.differenceBetweenElements(numbers2));
        System.out.println(difference.differenceBetweenElements(numbers3));

        System.out.println(zero.hasTwoValuesAreZero(numbers1));
        System.out.println(zero.hasTwoValuesAreZero(numbers2));
        System.out.println(zero.hasTwoValuesAreZero(numbers3));
    }
}
