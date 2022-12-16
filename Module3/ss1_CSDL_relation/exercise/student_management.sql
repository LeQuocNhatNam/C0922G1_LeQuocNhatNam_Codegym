CREATE DATABASE student_management;
USE student_management;
create table class (
id int primary key,
`name` varchar(50)
);
drop table teacher;
create table teacher(
id int primary key,
`name` varchar(50),
age varchar(50),
country varchar(50)
);
insert into class (name,id) values("C0922G1",1); 
insert into class (name,id) values("C1022G1",2); 
select * from class;
