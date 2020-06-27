package it.hoseo.mr;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;

@SpringBootTest
public class ArtistRepositoryTest {

	@Autowired
	private ArtistRepositoryJPA repo;

	@BeforeEach()
	public void init() {
//		repo.save(new Artist(null,"아로하","ost",new Date()));
//		repo.save(new Artist(null,"은하수","ballade",new Date()));
//		repo.save(new Artist(null,"밤이 깊었네","rock",new Date()));
//		repo.save(new Artist(null,"오르막길","ballade",new Date()));
//		
//		
//		
	}
	

	@Test
	public void testPaging() {
		assertEquals(3,repo.findAll(PageRequest.of(0, 3)).size());
		
	}
	
}