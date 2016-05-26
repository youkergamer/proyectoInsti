create database bd_mascota;

use bd_mascota;

create table mascota(
	id int auto_increment,
	nombre varchar(100),
	vida int,
	hambre int,
	sueño int,
	entretenimiento int,
	primary key (id)
);

insert into mascota values(null, 'PikachuVirtual','100','0','0','100');

create table comida(
	id int auto_increment,
	nombre varchar(50),
	cantidad_comida int,
	primary key(id)
);

create table golpe(
	id int auto_increment,
	tipo_de_golpe varchar(50),
	daño int,
	primary key (id)
);

create table diversion(
	id int auto_increment,
	tipo_de_entretenmiento varchar(50),
	entretencion int,
	primary key (id)
);


select * from mascota;
show databases;
