package functionalProgramming;

import java.util.List;

public class FP01Exercise {
    public static void main(String[] args) {

        List<Integer> integers = List.of(12, 9, 21, 3, 43, 54);
        // // printAllNumbersInAListFunctional(integers);
        // // printAllEvenNumbersInAListFunctional(integers);
        // printAllOddNumbersInAListFunctional2(integers);

        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
                "Kubernetes");

        // courses.stream().forEach(System.out::println);

        // courses.stream()
        // .filter(course -> course.contains("Spring"))
        // .forEach(System.out::println);

        // courses.stream()
        // .filter(course -> course.length() >= 4)
        // .forEach(System.out::println);

        // printSquaresOfEvenNumbers(integers);

        // printCubesOfOddNumbers(integers);

        printNumberOfChars(courses);

    }

    private static void printNumberOfChars(List<String> courses) {
        courses.stream()
                .map(course -> course.length())
                .forEach(System.out::println);
    }

    private static void printCubesOfOddNumbers(List<Integer> integers) {

        integers.stream()
                .filter(number -> number % 2 == 1)
                .map(number -> number * number * number)
                .forEach(System.out::println);
    }

    private static void print(int number) {
        System.out.println(number);
    }

    private static void printAllOddNumbersInAListFunctional2(List<Integer> integers) {

        integers.stream()
                .filter(number -> number % 2 == 1)// using Lambda
                .forEach(System.out::println);// we need to pass a method reference
    }

    private static void printSquaresOfEvenNumbers(List<Integer> integers) {

        integers.stream()
                .filter(number -> number % 2 == 0)// using Lambda
                .map(number -> number * number)
                .forEach(System.out::println);// we need to pass a method reference
    }
}
