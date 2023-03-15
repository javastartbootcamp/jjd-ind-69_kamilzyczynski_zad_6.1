package pl.javastart.task;

import java.util.Scanner;

public class GuessGame {

    void guessNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;

        boolean incorrectNumber = true;
        do {
            System.out.println("Podaj liczbę");
            number = scanner.nextInt();

            if (number < 100) {
                System.out.println("Podana liczba jest za mała");
            } else if (number > 200) {
                System.out.println("Podana liczba jest za duża");
            } else if (number % 3 != 0) {
                System.out.println("Liczba nie jest podzielna przez 3");
            } else {
                System.out.println("Twoja liczba jest ok");
                incorrectNumber = false;
            }
        } while (incorrectNumber);

    }
}
