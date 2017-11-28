package com.mousquetaires.ws.web.controller;

import javax.annotation.Resource;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.mousquetaires.ws.config.ContextConfig;
import com.mousquetaires.ws.config.WebMvcConfig;
import com.mousquetaires.ws.repository.BookRepository;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={ContextConfig.class,WebMvcConfig.class})
@WebAppConfiguration
public class BookControllerTest {

	@Resource
	private WebApplicationContext wac;
	
	@Resource
	private BookRepository bookRepositoryMock;
	
	private MockMvc mockMvc; 
	
	@Before
	public void init() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}
	
	@Test
	public void CheckBooksByUrl() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/api/books")).andExpect(MockMvcResultMatchers.status().isOk());
	}
	
	@Test
	public void getBooks() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/api/books"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.hasSize(11)));
	}
	
	@Test
	public void CheckBookByIdUrl() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/api/book/1"))
		.andExpect(MockMvcResultMatchers.status().isOk());
	}
}
