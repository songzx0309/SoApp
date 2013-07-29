create table user (
	id varchar(10) not null,
    name varchar(25) not null,
    password varchar(25)  not null,
    constraint pk_user primary key (id)
);