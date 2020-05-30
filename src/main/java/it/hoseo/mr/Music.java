package it.hoseo.mr;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Music {

	//앨범아이디, 음악이름, 장르, 아티스트,발행일,
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer albumId;
	private String name;
	private String genre;
	private String artist;
	private Date releaseDate;
	
}
