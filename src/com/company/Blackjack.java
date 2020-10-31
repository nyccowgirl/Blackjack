package com.company;

/*
 Trang Hoang
 CS111B: Assignment 1B
 */

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

            do {

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

            } while ((total < 21) && (anotherCard != 'n'));

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


/*
First cards: 3, 2
Total: 5
Do you want another card? (y/n): y
Card: 2
Total: 7
Do you want another card? (y/n): y
Card: 6
Total: 13
Do you want another card? (y/n): y
Card: 9
Total: 22
Bust!
Do you want to play again? (y/n): y
First cards: 8, 10
Total: 18
Do you want another card? (y/n): n
Do you want to play again? (y/n): y
First cards: 7, 9
Total: 16
Do you want another card? (y/n): y
Card: 7
Total: 23
Bust!
Do you want to play again? (y/n): y
First cards: 9, 4
Total: 13
Do you want another card? (y/n): y
Card: 7
Total: 20
Do you want another card? (y/n): c
Error: invalid input.
Do you want another card? (y/n): n
Do you want to play again? (y/n): n

Process finished with exit code 0
 */
