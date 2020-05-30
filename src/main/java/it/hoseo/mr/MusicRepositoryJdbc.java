package it.hoseo.mr;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class MusicRepositoryJdbc {
	@Autowired
	private JdbcTemplate template;
	
	//음악 추가 
	public boolean save(Music music) {

		try {
			template.update("insert into music values(?,?,?,?,?)"
					,music.getName(),music.getGenre(),music.getArtist(),music.getReleaseDate(),music.getAlbumId() );
		} catch (DataAccessException dae) {
			log.error("음악 추가 실패", dae);
			return false;
		}

		return true;
	}
	//앨범을 검색했을 때 앨범아이디는 그리고 음악 리스트에서 음악아이디를 찾아라?
	public Album getAlbum(Integer id) {
		Album album = template.queryForObject("select * from album where id = ?",new Object[] {id},new BeanPropertyRowMapper<>(Album.class));
		List<Music> tracks = template.query("select * from music where albumId = ?", new Object[] {album.getId()},new BeanPropertyRowMapper<>(Music.class));
//		album.setTracks(tracks);
		return album;
	}
	
	public boolean delete(Music music) {
		return template.update("delete from music where id=?", music.getAlbumId()) == 1 ? true : false;
}
	}