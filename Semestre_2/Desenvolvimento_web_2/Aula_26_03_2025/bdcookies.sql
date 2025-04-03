
use cookies;

create table usuarios
(
email varchar(50) not null,
senha varchar(50) not null,
cidade varchar(20) not null,
estado char(2) not null,
nome varchar(100) not null,
primary key(email)
);

insert into usuarios values ('felipe.palteiro@gmail.com','tobias123456','osasco','sp','geremias');


