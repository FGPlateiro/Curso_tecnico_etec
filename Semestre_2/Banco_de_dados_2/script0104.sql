create database teste;
use teste;
create table cadastro(
idfunc int not null primary key,
nome varchar(50) not null,
depto char(2) not null,
funcao char(20),
filhos int,
salario decimal(10,2)
);
desc cadastro;

insert into cadastro values (15, 'Marcos', '2', 'analista', 2, 2184.22 );
insert into cadastro values (16, 'andre', '2', null, 3, 2184.22);
insert into cadastro values (108, 'Roberto carlos', '2',"analista", 0, 2000.00);
insert into cadastro values (109, 'Carlos amaral', '1', 'dba', 1, 15000.00);
insert into cadastro values (110, 'Carlos Gardel', '1', 'programador', 2, 1000.00 );
insert into cadastro values (111, 'Amauri Lopes', '2', 'dba', 2, 2000.00);
insert into cadastro values (112, 'Marcio Garcia', '1', 'dba', 0, 2500.00);

select * from cadastro;