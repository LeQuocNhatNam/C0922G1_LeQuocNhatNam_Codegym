create database quan_ly_sinh_vien;
create table class (
class_id int primary key not null auto_increment,
class_name varchar (60) not null,
start_date datetime not null,
`status` bit
);

create table student (
student_id int not null primary key auto_increment,
student_name varchar (30) not null,
address varchar (50),
phone varchar (20),
`status` bit,
class_id int not null,
foreign key (class_id) references class(class_id)
);
drop table student;

create table subject (
sub_id int not null primary key auto_increment,
sub_name varchar (30) not null,
credit tinyint not null default 1 check (credit >=1),
`status` bit default 1
);

create table Mark (
mark_id int not null primary key auto_increment,
sub_id int not null unique,
student_id int not null unique,
mark float default 0 check ( mark BETWEEN 0 AND 100),
examtimes tinyint default 1,
foreign key(student_id) references student(student_id),
foreign key (sub_id) references subject (sub_id)
);
drop table Mark;
