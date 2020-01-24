package com.haile.songr;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@AutoConfigureMockMvc
@SpringBootTest
class SongrApplicationTests {

	@Autowired
	private SongrController controller;


	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}


//	@Test
//	public void shouldReturnDefaultMessage() throws Exception {
//		this.mockMvc.perform(get("/"))
//				.andDo(print());
//	}
}
