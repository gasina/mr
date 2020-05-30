package it.hoseo.mr;

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
//가요,발라드,ost,pop,Trot,dance,RnB,rock,lab,indy

public class Genre {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String goyo;
	private String ballade;
	private String ost;
	private String pop;
	private String Trot;
	private String dance;
	private String rnb;
	private String rock;
	private String lab;
	private String indy;
}
