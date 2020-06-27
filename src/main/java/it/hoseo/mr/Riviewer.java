package it.hoseo.mr;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Riviewer",uniqueConstraints = {
		@UniqueConstraint(name="uc_Riviewer_music",columnNames = {"music"})
})
//음악, 음악앨범,장르,리뷰작성자이름, 리뷰작성일
public class Riviewer {
	
	
	@Id
	@GeneratedValue(generator="seq_Riviewer",strategy = GenerationType.AUTO)
	@Column(length=13)
	private Integer albumid;
	
	private String music;
	
	@OneToOne
	private Artist artist;
	
	private String genre;
	
	private String reviewername;
	
	private Date reviewDate;
}
