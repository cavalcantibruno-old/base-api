create table user (
	id bigint not null auto_increment,
	email varchar(255) not null,
	password varchar(60) not null,
	profile varchar(20) not null,

	primary key (id)
);