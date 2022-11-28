package com.bowling.game.service;

import org.springframework.stereotype.Service;

@Service
public class BowlingGameService {

	static final int ZERO = 0;
	private int[] rolls;

	public int getGameScore(int[] newGame) {
		rolls = newGame;
		int score = 0;
		int roll = 0;
		for (int frame = 0; frame < 10; frame++) {
			if(isStrike(rolls[roll])) {
                score += 10 + rolls[roll+1] + rolls[roll+2];
                roll++;
            } else if(isSpare(roll)) {
                score += 10 + rolls[roll+2];
                roll += 2;
            } else {
                score += rolls[roll] + rolls[roll+1];
                roll += 2;
            }
		}
		return score;
	}

	private boolean isSpare(int roll) {
		return rolls[roll] + rolls[roll + 1] == 10;
	}
	
	private boolean isStrike(int roll) {
        return roll == 10;
    }

}