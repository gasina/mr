package it.hoseo.mr;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;

import lombok.Builder;

@SpringBootTest
public class AlbumRepositoryTest {

	@Autowired
	private AlbumRepositoryJPA albumRepo;

	
	@Autowired
	private ArtistRepositoryJPA arJpaRepo;

	@Autowired
	private MusicRepositoryJPA musicRepo;

	@Test
	void contextLoad() {
		Artist iu = Artist.builder().name("아이유").build();
		Album iu1st = Album.builder().artist(iu).name("아이유첫앨범").build();

		Music goodDay = Music.builder().artist(iu).album(iu1st).name("좋은날").build();
		arJpaRepo.save(iu);
		albumRepo.save(iu1st);
		musicRepo.save(goodDay);
		
		Artist haha = Artist.builder().name("하하").build();
		Album haha1st = Album.builder().artist(iu).name("하하첫앨범").build();

		Music busan = Music.builder().artist(iu).album(iu1st).name("부산바캉스").build();
		arJpaRepo.save(haha);
		albumRepo.save(haha1st);
		musicRepo.save(busan);
		
		
		
	}
	
	
}

/*
 * @BeforeEach() public void init() { repo.save(new
 * Album(null,"아로하","조정석","ost",new Date())); repo.save(new
 * Album(null,"은하수","길구봉구","ballade",new Date())); repo.save(new
 * Album(null,"happy","태연","rnb",new Date())); repo.save(new
 * Album(null,"오르막길","정인","ballade",new Date()));
 * 
 * }
 * 
 * 
 * @Test public void testPaging() {
 * assertEquals(3,repo.findAll(PageRequest.of(0, 3)).size());
 * 
 * }
 * 
 * }
 */