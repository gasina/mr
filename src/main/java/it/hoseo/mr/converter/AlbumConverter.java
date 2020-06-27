package it.hoseo.mr.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import it.hoseo.mr.Album;
import it.hoseo.mr.AlbumRepositoryJPA;

@Component
public class AlbumConverter implements Converter<Integer, Album>{

	@Autowired
	private AlbumRepositoryJPA repo;
	
	@Override
	public Album convert(Integer source) {
		return repo.findById(source).get();
	}
	
	
}
