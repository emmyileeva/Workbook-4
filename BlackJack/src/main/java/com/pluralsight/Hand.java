package com.pluralsight;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    // Adds a card to the hand and flips it face-up
    public void deal(Card card) {
        card.flip();
        cards.add(card);
    }

    public int getSize() {
        return cards.size();
    }

    // The hand uses the getPointValue method of each card to calculate the total value
    public int getValue() {
        int value = 0;
        int aceCount = 0;

        for (Card card : cards) {
            int cardValue = card.getPointValue();
            value += cardValue;
            if (cardValue == 11) aceCount++;
        }

        // Change Ace value if hand is over 21
        while (value > 21 && aceCount > 0) {
            value -= 10;
            aceCount--;
        }

        return value;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }
}
