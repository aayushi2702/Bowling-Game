package com.bowling.game.service;

import org.springframework.stereotype.Service;

@Service
public class BowlingGameService {
	
	static final int ZERO = 0;
	
	public int getGameScore(int[] rolls) {
		int score = 0;
		for (int roll : rolls) {
			score += roll;
		}
		return score;
	}
}