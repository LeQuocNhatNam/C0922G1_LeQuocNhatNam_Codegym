create database my_database;
use my_database;
create table Student (
id int primary key,
`name` varchar(50),
`age` varchar(50)
);
-- insert student to table
insert into student (name, age, id) values ("nam", 28, 2);
insert into student (name, age, id) values ("nam1", 27, 3);
insert into student (name, age, id) values ("nam2", 26, 1);
-- display students
select * from student;
-- update students
set SQL_SAFE_UPDATES = 0;
set SQL_SAFE_UPDATES = 1;
update student set name = "namle" where id = 1;
update student set name = "namle" where name = "Dinh";
-- drop,add a column
alter table student add column (email varchar(50));
update student set email = "namle@gmail.com" where age = 28;
