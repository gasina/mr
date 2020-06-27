package it.hoseo.mr;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;

@SpringBootTest
public class GenreRepositoryTest {

	@Autowired
	private GenreRepositoryJPA repo;

	@BeforeEach()
	public void init() {
		repo.save(new Genre(null, "goyo", "ballade","ost","pop","Trot","dance","rnb","rock","lab","indy"));
		repo.save(new Genre(null, "goyo", "ballade","ost","pop","Trot","dance","rnb","rock","lab","indy"));
		repo.save(new Genre(null, "goyo", "ballade","ost","pop","Trot","dance","rnb","rock","lab","indy"));
		repo.save(new Genre(null, "goyo", "ballade","ost","pop","Trot","dance","rnb","rock","lab","indy"));
		
	}
	

	@Test
	public void testPaging() {
		assertEquals(3,repo.findAll(PageRequest.of(0, 3)).size());
		
	}
	
}