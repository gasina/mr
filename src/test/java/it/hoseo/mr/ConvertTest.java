package it.hoseo.mr;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.conversions.Conversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.convert.ConversionService;

@SpringBootTest
public class ConvertTest {

	@Autowired
	ArtistRepositoryJPA artistRepo;
	
	@Autowired
	ConversionService convService;
	
	@Test
	public void artistConvertTest() {
		artistRepo.save(Artist.builder().name("와이유").build());
		
		assertEquals("와이유",convService.convert("와이유", Artist.class).getName());
		
	}
}
