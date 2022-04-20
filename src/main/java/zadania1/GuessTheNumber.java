package zadania1;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        int numberToGuess = new Random().nextInt(100);

        System.out.println("Proszę zgadnij liczbę z zakresu 0-99");

        int numberFromUser;
        int numberOfAttempts = 0;
        int numberOfRemainingAttempts = 5;

        while (numberOfAttempts <5){
            numberOfAttempts++;
            numberOfRemainingAttempts--;
            numberFromUser = getNumberFromUser();

            if(numberFromUser < numberToGuess){
                System.out.println("Podałeś za małą liczbę");
                System.out.println("Pozostała ilość prób: " + numberOfRemainingAttempts);
            }else if(numberFromUser > numberToGuess){
                System.out.println("Podałeś za dużą liczbę");
                System.out.println("Pozostała ilość prób: " + numberOfRemainingAttempts);
            }else{
                System.out.println("Zgadłeś!");
            }
        }
        System.out.println("Niestety nie udało Ci się zgadnąć, poprawna odpowiedź to: " + numberToGuess);


    }

    public static int getNumberFromUser() {

        System.out.println("Podaj liczbę ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }
}
