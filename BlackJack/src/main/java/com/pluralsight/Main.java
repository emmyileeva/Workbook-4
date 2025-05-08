package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Player> players = new ArrayList<>();
        for (int i = 0; i < numPlayers; i++) {
            System.out.print("Enter the name of player " + (i + 1) + ": ");
            String name = scanner.nextLine();
            players.add(new Player(name));
        }

        // Create a new deck and shuffle it
        Deck deck = new Deck();
        deck.shuffle();

        // Deal 2 cards to each player
        for (int i = 0; i < 2; i++) {
            for (Player player : players) {
                Card card = deck.deal();
                if (card != null) {
                    player.getHand().deal(card);
                }
            }
        }

        // Display each player's hand and determine the winner
        Player winner = null;
        int highestValue = 0;

        for (Player player : players) {
            System.out.println(player.getName() + "'s hand:");
            for (Card card : player.getHand().getCards()) {
                System.out.println(card.getSuit() + " " + card.getValue());
            }
            int handValue = player.getHand().getValue();
            System.out.println("Total value: " + handValue);

            if (handValue > highestValue && handValue <= 21) {
                highestValue = handValue;
                winner = player;
            }
        }

        if (winner != null) {
            System.out.println("The winner is " + winner.getName() + " with a hand value of " + highestValue + "!");
        } else {
            System.out.println("No winner!");
        }

        scanner.close();
    }
}