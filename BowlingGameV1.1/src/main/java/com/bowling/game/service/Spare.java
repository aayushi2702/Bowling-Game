package com.bowling.game.service;

public class Spare {

	private static int[] rolls;

	static boolean isSpare(int roll) {
		return rolls[roll] + rolls[roll + 1] == 10;
	}
}
