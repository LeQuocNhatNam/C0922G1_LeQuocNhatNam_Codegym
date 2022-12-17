use selling_management;
-- Thêm dữ liệu vào trong 4 bảng như dưới đây:
insert into customer(customer_id, customer_name, customer_age)
values (1, 'Minh Quan', 10),
	   (2, 'Ngoc Oanh', 20),
       (3, 'Hong Ha', 50);
       
insert into `order` (order_id, customer_id, order_date)
values (1, 1, '2006-03-21'),
	   (2, 2, '2006-03-23'),
       (3, 1, '2006-03-16');
       
insert into product values (1, 'may giat', 3),
						   (2, 'tu lanh', 5),
                           (3, 'dieu hoa', 7),
                           (4, 'quat', 1),
                           (5, 'bep dien', 2);
                           
insert into order_details values (1,1,3);
insert into order_details values (1,3,7);
insert into order_details values (1,4,2);
insert into order_details values (2,1,2);
insert into order_details values (3,1,8);
insert into order_details values (2,5,4);
insert into order_details values (2,3,3);
-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
select * from order_details;
-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
select c.customer_name, p.product_name
from customer c join `order` o on c.customer_id = o.customer_id join order_details od
on o.order_id = od.order_id join product p on od.product_id = p.product_id group by c.customer_name, p.product_name;

-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
select c.customer_name as buying_nothing_customers
from customer c join `order` o on c.customer_id <> o.customer_id group by c.customer_name;
-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn 
-- (giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn.
-- Giá bán của từng loại được tính = odQTY*pPrice)
select * from `order`;

select o.order_id, o.order_date, order_quantity * p.product_price as order_total_price
from `order` o join order_details od on o.order_id = od.order_id join product p on od.product_id = p.product_id
order by order_total_price;


