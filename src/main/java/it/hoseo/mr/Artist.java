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
public class Artist {
	
	//앨범아이디,음악, 장르, 아티스트 데뷔일
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer albumId;
	
	private String music;

	private String genre;
	
	private Date artistDate;
	
	
	
}
