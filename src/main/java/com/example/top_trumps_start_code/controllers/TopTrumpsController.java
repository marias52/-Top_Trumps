package com.example.top_trumps_start_code.controllers;

import com.example.top_trumps_start_code.models.Card;
import com.example.top_trumps_start_code.services.TopTrumpsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@RequestMapping (value = "/toptrumps")

public class TopTrumpsController {

@Autowired
TopTrumpsServices topTrumpsServices;

    @PostMapping // Starts a new game.
    public ResponseEntity<Card> newGame() {
        Card card = TopTrumpsServices.startNewGame();
        return new ResponseEntity<>(card, HttpStatus.CREATED); // 200 -ok, 201 - create
    }

    @PostMapping
    public ResponseEntity<String> game(@RequestBody ArrayList<Card> cards) {
        String winner = topTrumpsServices.checkWinner(cards);
        return new ResponseEntity<>(winner, HttpStatus.OK);
    }


}
