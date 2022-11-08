package functionalProgramming;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {

        List<Integer> integers = List.of(12, 9, 21, 3, 43, 54);
//        printAllNumbersInAListFunctional(integers);
//        printAllEvenNumbersInAListFunctional(integers);
        printAllEvenNumbersInAListFunctional2(integers);

    }

    private static void print(int number){
        System.out.println(number);
    }
    private static void printAllNumbersInAListFunctional(List<Integer> integers) {
//        for (int number: integers){
//            System.out.println(number);
//        }
        //convert to a stream of numbers
        integers.stream().forEach(FP01Functional::print);//we need to pass a method reference
        //static method - system.out
        integers.stream().forEach(System.out::println);//we need to pass a method reference


    }

    private static boolean isEven(int num){
        return num % 2 == 0;
    }

    private static void printAllEvenNumbersInAListFunctional(List<Integer> integers) {

        integers.stream()
                .filter(FP01Functional::isEven)//using method ref
                .forEach(System.out::println);//we need to pass a method reference
    }

    private static void printAllEvenNumbersInAListFunctional2(List<Integer> integers) {

        integers.stream()
                .filter(number -> number % 2 ==0)//using Lambda
                .forEach(System.out::println);//we need to pass a method reference
    }
}
