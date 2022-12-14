create database my_database;
create table student (
id int primary key,
 `name` varchar(50),
 grade varchar(50)
);
-- insert student

insert into student values (1, "nam1", 5);
insert into student values (2, "nam", 5);
insert into student values (3, "nam", 5);
-- display table
select * from student;
-- delete student by primary key
delete from student where id=1;
-- delete student not by primary key
SET SQL_SAFE_UPDATES = 0;
SET SQL_SAFE_UPDATES = 1;
delete from student where name = 'nam';
-- add a column
alter table student add column(email varchar(50));
-- update student's attributes by primary key and normal key
update student set email = "namle2@gmail.com" where id = 4;
update student set grade = 4 where name = "nam";
-- delete a column
alter table student drop column email;
select * from student;