package it.hoseo.mr;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Music",uniqueConstraints = {
		@UniqueConstraint(name="uc_music_name",columnNames = {"name"})
})


public class Music {

	//앨범아이디, 음악이름, 장르, 아티스트,발행일,
	@Id
	@GeneratedValue(generator="seq_Music",strategy = GenerationType.AUTO)
	@Column(length=13)
	private Integer id;
	
	   //널을 사용하지 않음
	private String name;
	
	private String genre;
	
	@OneToOne
	private Artist artist;
	
	@Temporal(TemporalType.TIMESTAMP)
	
	private Date releaseDate;
	
	@ManyToOne
	@JoinColumn(name = "album_id")
	private Album album;
	
}
