package com.example.stack;

import java.util.Stack;

public class SimpleCardGame {
    //  колода
    private Stack<Card> deck;

    //  сброс
    private Stack<Card> graveyard;

    public SimpleCardGame() {

    }

    public Card getCardFromDeck() {
        return deck.pop();
    }

    public void discard(Card card) {
        graveyard.push(card);
    }

    public Card lookTopCard() {

        return deck.peek();
    }

    public Stack<Card> getDeck() {
        return deck;
    }

    public void setDeck(Stack<Card> deck) {
        this.deck = deck;
    }

    public Stack<Card> getGraveyard() {
        return graveyard;
    }

    public void setGraveyard(Stack<Card> graveyard) {
        this.graveyard = graveyard;
    }


    //  ..геттеры, сеттеры и т.д.
}

