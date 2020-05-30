create table music(
	albumId integer primary key,
	name varchar(255),
	genre varchar(255),
	artist varchar(255),
	releasedate TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

create table album (
	id integer primary key,
	name varchar(255),
	artist varchar(255),
	genre varchar(255),
	releasedate TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
create table artist(
	albumId integer primary key,
	music varchar(255),
	genre varchar(255),
	artistdate TIMESTAMP DEFAULT CURRENT_TIMESTAMP	
);
create table genre(
	id integer primary key,
	goyo varchar(255),
	ballade varchar(255),
	ost varchar(255),
	pop varchar(255),
	trot varchar(255),
	dance varchar(255),
	rnb varchar(255),
	rock varchar(255),
	lab varchar(255),
	indy varchar(255)
);
create table riviewer(
	albumid integer primary key,
	music varchar(255),
	genre varchar(255),
	reviewername varchar(255),
	reviwedate TIMESTAMP DEFAULT CURRENT_TIMESTAMP
	
);
