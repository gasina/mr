package it.hoseo.mr;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "Artist")
public class Artist {

	// 앨범아이디,음악, 장르, 아티스트 데뷔일
	@Id
	@GeneratedValue(generator = "seq_Artist", strategy = GenerationType.AUTO)
	@Column(length = 13)
	private Integer id;

	@Column(nullable = false)
	private String name;

}
