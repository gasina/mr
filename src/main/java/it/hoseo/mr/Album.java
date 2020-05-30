package it.hoseo.mr;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//앨범
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Album {
	// 앨범아이디, 앨범이름,장르 ,아티스트, 발행일,트랙
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	
	private String name;
	private String artist;
	private String genre;
	private Date releaseDate;
//	private List<Music> tracks;
}
