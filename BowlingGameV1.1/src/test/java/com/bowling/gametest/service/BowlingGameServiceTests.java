package com.bowling.gametest.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import com.bowling.game.service.BowlingGameService;

@RunWith(MockitoJUnitRunner.class)
public class BowlingGameServiceTests {
	
    private BowlingGameService bowlingGameService;

    @Before
    public void setUp() {
        bowlingGameService = new BowlingGameService();
    }

	@Test
	public void getGameScore_ReturnsValueTest() {
		assertThat(bowlingGameService
				.getGameScore(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 })).isZero();
	}
	
    @Test
    public void getGameScore_WithEachRollPinsDownAreOneTest() {
        assertThat(bowlingGameService.getGameScore(new int[] {1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1}))
                .isEqualTo(20);
    }
    
    @Test
    public void getGameScore_WithSpareAtStartAndPinsDownForRestOFTheRollsAre1Test() {
        assertThat(bowlingGameService.getGameScore(new int[] {5,5, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1}))
                .isEqualTo(29);
    }
    
    @Test
    public void getGameScore_WithSpareAtEndFollowedByThreeAndPinsDownForRestOFTheRollsAreOneTest() {
        assertThat(bowlingGameService.getGameScore(new int[] {1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 5,5,3}))
                .isEqualTo(31);
    }
    
    @Test
    public void getGameScore_WithStrikeAtStartAndPinsDownForRestOFTheRollsAreOneTest() {
        assertThat(bowlingGameService.getGameScore(new int[] {10, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1}))
                .isEqualTo(30);
    }
    

    @Test
    public void getGameScore_WithAllFramesScoringStrikeTest() {
        assertThat(bowlingGameService.getGameScore(new int[] {10, 10, 10, 10, 10, 10, 10, 10, 10, 10,10,10}))
                .isEqualTo(300);
    }
}
