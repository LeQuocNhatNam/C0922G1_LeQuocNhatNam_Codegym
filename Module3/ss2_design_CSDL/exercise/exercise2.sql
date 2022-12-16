create database selling_management;
use selling_management;
create table customer (
customer_id int primary key auto_increment,
customer_name varchar(50),
customer_age int default 0
);

create table product(
product_id int primary key auto_increment,
product_name varchar(50),
product_price double default 0
);

create table order_1(
order_id int primary key auto_increment,
customer_id int,
order_date datetime,
order_total_price double default 0,
foreign key (customer_id) references customer (customer_id)
);



create table order_details (
order_id int,
product_id int,
order_quantity int check (order_quantity >1 ),
primary key (order_id, product_id),
foreign key (order_id) references order_1(order_id),
foreign key (product_id) references product(product_id)
);
drop table order_details;
