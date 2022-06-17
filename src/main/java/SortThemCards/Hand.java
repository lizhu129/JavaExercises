package SortThemCards;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {

    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void print() {
        for (Card card : this.cards) {
            System.out.println(card);
        }
    }

    public void sort() {
        Collections.sort(cards);
    }

    @Override
    public int compareTo(@NotNull Hand hand) {
        int sumThis = 0;
        for (Card card: this.cards) {
            sumThis = sumThis + card.getValue();
        }

        int sumCompared = 0;
        for (Card card: hand.cards) {
            sumCompared = sumCompared + card.getValue();
        }

        return sumThis - sumCompared;
    }

    public void sortBySuit() {
        Collections.sort(this.cards, new BySuitInValueOrder());
    }

}
