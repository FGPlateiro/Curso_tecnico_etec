create database biblioteca;
use biblioteca;

create table autor(
idautor int not null primary key,
nomeautor varchar(50) not null,
nomelivros varchar(40) not null
);
desc autor;

insert into autor
values
(1, 'Daniel', 'Barret'),
(2, 'Gerald', 'carter'),
(3, 'Mark', 'Sobell'),
(4, 'Richard', 'Stanek'),
(5, 'Jostein', 'blum'),
(6, 'Umberto', 'gaarder'),
(7, 'william','primo rico'),
(8, 'stephen', 'king'),
(9, 'pearl', 'jam'),
(10, 'mamacita', 'cabulosa');

select * from autor;