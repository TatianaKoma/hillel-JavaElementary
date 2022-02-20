package ua.ithillel;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class SortByParity {

    public final static int SIZE = 10;
    public final static int RANDOM_NUMBER_ORIGIN = 50;
    public final static int RANDOM_NUMBER_BOUND = 100;

    public static void main(String[] args) {
        int[] randomArray = getRandomArray();
        System.out.println(Arrays.toString(randomArray));
        System.out.println(Arrays.toString(getArraySortedByParity(randomArray)));
    }

    private static int[] getRandomArray() {
        if (SIZE > 0 && RANDOM_NUMBER_BOUND > RANDOM_NUMBER_ORIGIN) {
            return new Random().ints(SIZE, RANDOM_NUMBER_ORIGIN, RANDOM_NUMBER_BOUND).toArray();
        }
        return new int[0];
    }

    private static int[] getArraySortedByParity(int[] array) {
        IntStream evenStream = Arrays.stream(array).filter(x -> x % 2 == 0);
        IntStream oddStream = Arrays.stream(array).filter(x -> x % 2 != 0);
        return IntStream.concat(evenStream, oddStream).toArray();
    }
}
