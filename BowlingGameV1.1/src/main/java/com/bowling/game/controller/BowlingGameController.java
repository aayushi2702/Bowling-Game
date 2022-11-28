package com.bowling.game.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bowling.game.service.BowlingGameService;

@RestController
public class BowlingGameController {

    private BowlingGameService bowlingGameService;

    public BowlingGameController(BowlingGameService bowlingGameService) {
        this.bowlingGameService = bowlingGameService;
    }

	
    @GetMapping(path = "/getScore")
    public int gameHandler(@RequestParam int[] game) {
        return bowlingGameService.getGameScore();
    }
}