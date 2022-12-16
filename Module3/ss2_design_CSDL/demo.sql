create database if not exists c0922g1;
use c0922g1;
create table james(
username varchar(50) primary key,
password varchar(50)
);
insert into james values ('nam','123');
select * from james;

create table class(
id int auto_increment,
primary key(id),
name varchar(50)
);

insert into class (name) values ('nam');

select * from class;

create table room(
id int auto_increment primary key,
name varchar(50),
class_id int,
foreign key(class_id) references class(id)
);

create table student(
id int auto_increment primary key,
name varchar(50),
gender boolean,
dateOfBirth varchar(50),
email varchar(50),
point int check(point > 0 and point <= 10),
username varchar(50) unique,
class_id int,
foreign key (username) references james(username) on delete set null,
foreign key (class_id) references class(id) on delete set null
);
create table instructor(
id int auto_increment primary key,
name varchar(50),
dateOfBirth varchar(50),
salary int
);
create table instructor_class(
instructor_id int,
class_id int,
start_time date,
end_time date,
primary key (instructor_id, class_id),
foreign key (instructor_id) references instructor (id),
foreign key (class_id) references class (id)
);
select * from student;

insert into c0922g1.student (name, gender, email, point, username, class_id) values ('nam',true, 'namle@gmail.com', 
7, 'nam', 1);
select * from student;
 
-- Error Code: 1452. Cannot add or update a child row: a foreign key constraint fails (`c0922g1`.`student`, CONSTRAINT `student_ibfk_1` FOREIGN KEY (`username`) REFERENCES `james` (`username`) ON DELETE SET NULL)


