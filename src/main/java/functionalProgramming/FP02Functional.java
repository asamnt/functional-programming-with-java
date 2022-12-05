package functionalProgramming;

import java.util.List;

public class FP02Functional {
    public static void main(String[] args) {

        List<Integer> integers = List.of(12, 9, 21, 3, 43, 54);
        int sum = addListFunctional(integers);

        int sumOfSquares = doSumOfSquares(integers);
        System.out.println(sumOfSquares);

        int sumOfCubes = doSumOfCubes(integers);
        System.out.println(sumOfCubes);

    }

    private static int doSumOfSquares(List<Integer> integers) {
        return integers.stream()
                .map(number -> number * number)
                .reduce(0, (x, y) -> x + y);
    }

    private static int doSumOfCubes(List<Integer> integers) {
        return integers.stream()
                .map(number -> number * number * number)
                .reduce(0, (x, y) -> x + y);
    }

    private static int addListFunctional(List<Integer> integers) {
        return integers.stream()
                .reduce(0, (a, b) -> a + b);
        // return 0;
    }

}
