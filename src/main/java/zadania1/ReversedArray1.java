package zadania1;

public class ReversedArray1 {

    public static void main(String[] args) {

        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] reversed = new int[numbers.length];


        for (int i = 0; i < numbers.length; i++) {
            reversed[i] = numbers[numbers.length - 1 - i];
        }

        System.out.println("Liczby w odwróconej tablicy to: ");

        for (int i = 0; i < reversed.length; i++){
            System.out.println(reversed[i]);
        }


    }
}