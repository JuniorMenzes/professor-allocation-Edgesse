package com.project.professorallocation.service;

import java.text.ParseException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(locations = "classpath:application.properties")
public class CourseServiceTests {

	
	@Autowired
	CourseService service;
	
	
	@Test
	public void create() throws ParseException {
		
	}
	
	
}
