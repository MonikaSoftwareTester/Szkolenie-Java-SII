package zadania1;

import java.util.Scanner;

public class ReversedArray2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Jak dużą tablicę chcesz stworzyć?");

        int length = scanner.nextInt();

        int[] numbers = new int[length];


        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Podaj element tablicy");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Elementy tablicy 'numbers' to: ");

        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        int[] reversed = new int[numbers.length];


        for (int i = 0; i < numbers.length; i++) {
            reversed[i] = numbers[numbers.length - 1 - i];
        }

        System.out.println("Elementy odwróconej tablicy 'reversed' to: ");

        for (int i = 0; i < reversed.length; i++){
            System.out.println(reversed[i]);
        }

    }
}
