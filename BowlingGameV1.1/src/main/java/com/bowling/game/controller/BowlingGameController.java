package com.bowling.game.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BowlingGameController {

    @GetMapping(path = "/getScore")
    public int gameHandler(@RequestParam int[] game) {
        return 0;
    }
}