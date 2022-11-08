package functionalProgramming;

import java.util.List;

public class FP01Structural {
    public static void main(String[] args) {

        List<Integer> integers = List.of(12, 9, 21, 3, 43, 54);
        printAllNumbersInAListStructured(integers);
        printAllEvenNumbersInAListStructured(integers);

    }

    private static void printAllNumbersInAListStructured(List<Integer> integers) {
        for (int number: integers){
            System.out.println(number);
        }

    }

    private static void printAllEvenNumbersInAListStructured(List<Integer> integers) {
        for (int number: integers){
            if(number%2 == 0){
                System.out.println(number);
            }

        }

    }
}
