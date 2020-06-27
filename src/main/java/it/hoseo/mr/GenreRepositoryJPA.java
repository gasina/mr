package it.hoseo.mr;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface GenreRepositoryJPA extends CrudRepository<Genre, Integer> {
	//페이징
	List<Music> findAll(Pageable page);
	
	//Like 검색
	
}
