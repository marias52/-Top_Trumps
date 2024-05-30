package com.example.top_trumps_start_code.services;

import com.example.top_trumps_start_code.models.Card;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.swing.text.html.CSS;
import java.util.ArrayList;

@Service
public class TopTrumpsServices {

    private ArrayList<Card> cards;

    public TopTrumpsServices() {

    }

    public String checkWinner(ArrayList<Card> cards) {
        Card card1 = cards.get(0);
        Card card2 = cards.get(1);
        if (card1.getCardValue() > card2.getCardValue()) {
            return String.format("%s of %s wins!", card1.getRank(), card1.getSuit());
        } else if (card1.getCardValue() < card2.getCardValue()) {
            return String.format("%s of %s wins!", card2.getRank(), card2.getSuit());
        }
        else {
            return "It's a tie";
        }
    }


    // Create a TopTrumpsService class that has a method called checkWinner().
    // This method should take in the 2 card objects.

    //After determining which is the higher value card,
    // send back a response with the appropriate message (e.g. "Queen of Hearts wins!")
}
