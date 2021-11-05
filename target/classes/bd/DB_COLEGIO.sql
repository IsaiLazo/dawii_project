create database db_colegio;
use  db_colegio;

create table distrito (
	cod_dis		int 	primary key 	auto_increment,
    dis			varchar(25)
);

create table usuario(
	cod_usu		int		primary key		auto_increment,
    login		varchar(50),
    pass		varchar(50),
    cod_rol		int			/*references rol*/
);

create table rol(
	cod_rol		int		primary key 	auto_increment,
    descr		varchar(50)
);

create table estudiante(
	cod_est		int 	primary key 	auto_increment,
    nom_est		varchar(25),
    ape_est		varchar(25),
    correo_est	varchar(50),
    fec_nac_est	date,
    nota_est	double,
    sex_est		varchar(25),
    dni_est		int,
    cel_est		int,
    cod_dis		int			/*references distrito*/
);

create table profesor(
	cod_prof		int 	primary key 	auto_increment,
    nom_prof		varchar(25),
    ape_prof		varchar(25),
    correo_prof	varchar(50),
    fec_nac_prof	date,
    sex_prof		varchar(25),
    dni_prof		int,
    cel_prof		int,
    cod_dis			int			/*references distrito*/
);

create table matricula(
	cod_matri		int 	primary key		auto_increment,
    estado_matri	varchar(25),
    cod_est			int		/*references estudiante*/
);

create table curso(
	cod_cur		int 		primary key		auto_increment,
    nom_cur		varchar(255),
    cod_est		int,		/*references estudiante*/
    cod_prof	int			/*references profesor*/
);