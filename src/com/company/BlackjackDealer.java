package com.company;

/*
 Trang Hoang
 CS111B: Assignment 1B Bonus
 */

import java.util.Random;
import java.util.Scanner;

public class BlackjackDealer {
    public static void main(String[] args) {
        int card, total, dealer;
        char playAgain, anotherCard;
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        do {
            total = dealer = 0;
            card = random.nextInt(10) + 1;
            dealer += card;
            System.out.println("The dealer starts with a " + card);
            card = random.nextInt(10) + 1;
            total += card;
            System.out.print("Your first cards: " + card + ", ");
            card = random.nextInt(10) + 1;
            total += card;
            System.out.println(card);
            System.out.println("Total: " + total);

            do {

                do {
                    System.out.print("Hit? (y/n): ");
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

            if (total <= 21) {
                System.out.println("Dealer has a " + dealer + "...");
                input.nextLine();

                do {
                    System.out.print("(c to continue) ");
                    input.nextLine();
                    card = random.nextInt(10) + 1;
                    dealer += card;
                    System.out.println("Dealer gets a " + card);
                    System.out.println("Total: " + dealer);
                } while (dealer < 17);

                if (dealer > total && dealer <= 21) {
                    System.out.println("Dealer Wins!");
                } else if (dealer < total || dealer > 21) {
                    System.out.println("You Win!");
                } else {
                    System.out.println("Push!");
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


/*
The dealer starts with a 4
Your first cards: 5, 3
Total: 8
Hit? (y/n): y
Card: 4
Total: 12
Hit? (y/n): y
Card: 1
Total: 13
Hit? (y/n): y
Card: 7
Total: 20
Hit? (y/n): n
Dealer has a 4...
(c to continue) c
Dealer gets a 9
Total: 13
(c to continue) c
Dealer gets a 5
Total: 18
You Win!
Do you want to play again? (y/n): y
The dealer starts with a 5
Your first cards: 8, 9
Total: 17
Hit? (y/n): n
Dealer has a 5...
(c to continue) c
Dealer gets a 9
Total: 14
(c to continue) c
Dealer gets a 9
Total: 23
You Win!
Do you want to play again? (y/n): y
The dealer starts with a 4
Your first cards: 6, 4
Total: 10
Hit? (y/n): y
Card: 2
Total: 12
Hit? (y/n): y
Card: 10
Total: 22
Bust!
Do you want to play again? (y/n): y
The dealer starts with a 8
Your first cards: 3, 7
Total: 10
Hit? (y/n): y
Card: 5
Total: 15
Hit? (y/n): y
Card: 6
Total: 21
Blackjack!
Dealer has a 8...
(c to continue) c
Dealer gets a 4
Total: 12
(c to continue) c
Dealer gets a 2
Total: 14
(c to continue) c
Dealer gets a 5
Total: 19
You Win!
Do you want to play again? (y/n): n

Process finished with exit code 0
 */
