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

//음악, 음악앨범,장르,리뷰작성자이름, 리뷰작성일
public class Riviewer {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer albumid;
	
	private String music;
	
	private String genre;
	
	private String reviewername;
	
	private Date reviewDate;
}
