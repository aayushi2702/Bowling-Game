package com.bowling.gametest.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import com.bowling.game.service.BowlingGameService;

@RunWith(MockitoJUnitRunner.class)
public class BowlingGameServiceTests {

	@Test
	public void getGameScore_ReturnsValueTest() {
		BowlingGameService bowlingGameService = new BowlingGameService();
		assertThat(bowlingGameService
				.getGameScore(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 })).isZero();
	}
}
