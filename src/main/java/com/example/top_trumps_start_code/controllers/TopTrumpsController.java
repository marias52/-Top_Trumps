package com.example.top_trumps_start_code.controllers;

import com.example.top_trumps_start_code.models.Card;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
@RequestMapping (value = "/toptrumps")
public class TopTrumpsController {



    @PostMapping
    public ResponseEntity<ArrayList<Card>> game(@RequestBody ArrayList<Card> cards) {
//   we want to take 2 card objects from request body

        ArrayList<Card> result = new ArrayList<>();
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }


//    .processGuess(card);

//    if card1.rank > card2.rank then return card1
}
