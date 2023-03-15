package pl.javastart.task;

import java.util.Scanner;

public class GuessGame {
    Scanner scanner = new Scanner(System.in);

    void guessNumber() {
        int number;

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
            }
        } while (number < 100 || number > 200 || number % 3 != 0);

    }
}
