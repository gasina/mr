package it.hoseo.mr;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface RiviewerRepositoryJPA extends CrudRepository<Riviewer, Integer> {
	//페이징
	List<Music> findAll(Pageable page);

	public static void main(String[] args) {
	
	}
	
	//Like 검색
	
}
