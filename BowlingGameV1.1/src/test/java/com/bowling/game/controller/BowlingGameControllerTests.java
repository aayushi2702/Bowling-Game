package com.bowling.game.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.bowling.game.service.BowlingGameService;

@RunWith(SpringRunner.class)
@WebMvcTest
public class BowlingGameControllerTests {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private BowlingGameService bowlingGameService;

	@Test
	public void gameAPITest() throws Exception {

		when(bowlingGameService.getGameScore()).thenReturn(0);
		mockMvc.perform(get("/getScore?game=0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0"))
				.andExpect(status().isOk());
	}
}