package it.hoseo.mr.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import it.hoseo.mr.Artist;
import it.hoseo.mr.ArtistRepositoryJPA;

@Component
public class ArtistConverter implements Converter<String, Artist>{

	@Autowired
	private ArtistRepositoryJPA repo;
	
	@Override
	public Artist convert(String source) {
		return repo.findByName(source);
	}
	
	
}
