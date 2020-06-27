package it.hoseo.mr;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;

@SpringBootTest
public class RiviewerRepositoryTest {

	@Autowired
	private RiviewerRepositoryJPA repo;

	@BeforeEach()
	public void init() {

		
	}
	

	@Test
	public void testPaging() {
		assertEquals(3,repo.findAll(PageRequest.of(0, 3)).size());
		
	}
	
}