package it.hoseo.mr;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ManyToAny;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//앨범
@Data
@Entity
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Album {
	// 앨범아이디, 앨범이름,장르 ,아티스트, 발행일,트랙
	@Id
	@GeneratedValue(generator = "seq_album", strategy = GenerationType.AUTO)
	private Integer id;

	private String name;
	@OneToOne
	private Artist artist;
	private String genre;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date releaseDate;

	@OneToMany(mappedBy = "album", fetch = FetchType.EAGER)
	private List<Music> tracks;
}
