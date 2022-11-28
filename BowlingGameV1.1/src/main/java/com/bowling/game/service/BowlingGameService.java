package com.bowling.game.service;

import org.springframework.stereotype.Service;

@Service
public class BowlingGameService {
	
	static final int ZERO = 0;
	
	public int getGameScore(int[] rolls) {
		int score = 0;
			int roll = 0;
	        for(int cursor = 0; cursor < 20; cursor++) {
	            if(rolls[roll] + rolls[roll+1] == 10) {
	                score = 10 + rolls[roll+2];
	                roll+=2;
	                cursor++;
	            } else {
	                score += rolls[roll];
	            }
		}
		return score;
	}
}