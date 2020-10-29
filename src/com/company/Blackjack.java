package com.company;

import java.util.Scanner;
import java.util.Random;

public class Blackjack {

    public static void main(String[] args) {
        int card, total;
        char playAgain, anotherCard;
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        do {
            total = 0;
            card = random.nextInt(10) + 1;
            total += card;
            System.out.print("First cards: " + card + ", ");
            card = random.nextInt(10) + 1;
            total += card;
            System.out.println(card);
            System.out.println("Total: " + total);
            anotherCard = 'y';

            while ((total < 21) && (anotherCard != 'n')) {
                do {
                    System.out.print("Do you want another card? (y/n): ");
                    anotherCard = input.next().charAt(0);

                    if (!(anotherCard == 'y' || anotherCard == 'n')) {
                        System.out.println("Error: invalid input.");
                    }

                } while (!(anotherCard == 'y' || anotherCard == 'n'));

                if (anotherCard == 'y') {
                    card = random.nextInt(10) + 1;
                    total += card;
                    System.out.println("Card: " + card);
                    System.out.println("Total: " + total);
                }

                if (total > 21) {
                    System.out.println("Bust!");
                } else if (total == 21) {
                    System.out.println("Blackjack!");
                }
            }

            do {
                System.out.print("Do you want to play again? (y/n): ");
                playAgain = input.next().charAt(0);

                if (!(playAgain == 'y' || playAgain == 'n')) {
                    System.out.println("Error: invalid input.");
                }
            } while (!(playAgain == 'y' || playAgain == 'n'));

        } while (playAgain == 'y');
    }
}
