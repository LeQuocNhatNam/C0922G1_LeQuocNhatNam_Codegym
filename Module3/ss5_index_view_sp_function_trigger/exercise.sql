create database demo;
use demo;
-- Bước 1: Tạo cơ sở dữ liệu demo
-- Bước 2: Tạo bảng Products
create table products (
id int,
product_code varchar(50),
product_name varchar(45),
product_price double,
product_amount int,
product_description varchar(45),
product_status boolean
);

drop table products;

insert into products value 
(1, '1CG', 'iPhone6', 20, 2, 'new', 1),
(2, '1CH', 'iPhone7', 30, 5, 'second hand', 0),
(3, '1CI', 'iPhone8', 40, 8, 'brand-new', 0),
(4, '1CK', 'iPhone9', 50, 11, 'old', 1);

-- Bước 3
-- Tạo Unique Index trên bảng Products (sử dụng cột productCode để tạo chỉ mục)

create unique index i_product on products(product_code);

-- Tạo Composite Index trên bảng Products (sử dụng 2 cột productName và productPrice)

create unique index i_product_name_price on products (product_name, product_price);

-- Sử dụng câu lệnh EXPLAIN để biết được câu lệnh SQL của bạn thực thi như nào

explain select * from products;

-- Bước 4:

-- Tạo view lấy về các thông tin: productCode, productName, productPrice, productStatus từ bảng products.

create view v_product as 
select product_code, product_name, product_price, product_status 
from products;


-- Tiến hành sửa đổi view

update v_product
set product_name = 'iphone11'
where product_code = '1CG';

update v_product
set product_price = '15'
where product_name = 'iphone7';

select * from v_product;

-- Tiến hành xoá view

drop view v_product;

-- Bước 5:

-- Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product

delimiter //
create procedure get_all_products ()
begin 
select * from products;
end //


call get_all_products();

-- Tạo store procedure thêm một sản phẩm mới

delimiter //
create procedure add_a_new_product(in id int, product_code varchar(50), product_name varchar(50),
									product_price double, product_amount int, product_description varchar(50),
                                    product_status boolean)
begin
insert into products values (id,product_code, product_name, product_price, product_amount,
					  product_description, product_status);
end //

call add_a_new_product (5, '8CK', 'iPhone12', 60, 15, 'new', 0);

-- Tạo store procedure sửa thông tin sản phẩm theo id

delimiter // 
create procedure edit_product(
  p_id int, 
  new_code varchar(50), 
  new_name varchar(50), 
  new_price double, 
  new_amount int, 
  new_description varchar(50), 
  new_status boolean
) begin 
update 
  products 
set 
  product_name = new_name, 
  product_code = new_code, 
  product_price = new_price, 
  product_amount = new_amount, 
  product_description = new_description, 
  product_status = new_status 
where 
  id = p_id;
end // 

drop procedure edit_product_by_id;

set sql_safe_updates =0;

call edit_product (4, '9CNN', 'iPhone17', 80, 100, 'old', 1);

select * from products;

 -- Tạo store procedure xoá sản phẩm theo id
 
delimiter //
create procedure delete_product_by_id (in p_id int) 
begin
delete from products
where id = p_id;
end //

call delete_product_by_id (4);
