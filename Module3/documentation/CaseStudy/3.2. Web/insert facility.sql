select c.*, ct.name_type from customer c join customer_type ct on c.customer_type_id = ct.id where c.id = 1;
select * from customer_type;
insert into customer(customer_type_id,name,date_of_birth,gender,id_card,phone_number,
email,address) values (1,"Nam","2008-12-15",true,"123","123","123","123");
select*from customer;
delete from customer where id = 12;
update customer set customer_type_id = 3, name = "Nguyễn Thị Hào",
date_of_birth = "1989-11-07", gender = false,id_card = "643431213", phone_number = "945423362", email = "thihao07@gmail.com", address = "23 Nguyễn Hoàng, Đà Nẵng"
where id = 1;
delete from customer where id = 15;
select * from facility;
INSERT INTO facility (id, name, area, cost, max_people, rent_type_id, facility_type_id, standard_room, description_other_covenience, poll_area, number_of_floors, facility_free)
 VALUES ('1', 'Villa Beach Front', '25000', '1000000', '10', '3', '1', 'vip', 'Có hồ bơi', '500', '4', 'null');
 INSERT INTO facility (id, name, area, cost, max_people, rent_type_id, facility_type_id, standard_room, description_other_covenience, poll_area, number_of_floors, facility_free) VALUES
 ('2', 'House Princess 01', '14000', '5000000', '7', '2', '2', 'vip', 'Có thêm bếp nướng', null, '3', 'null');
INSERT INTO facility (id, name, area, cost, max_people, rent_type_id, facility_type_id, standard_room, description_other_covenience, poll_area, number_of_floors, facility_free) VALUES
 ('3', 'Room Twin 01', '5000', '1000000', '2', '4', '3', 'normal', 'Có tivi', null, null, '1 Xe máy, 1 xe đạp');
INSERT INTO facility (id, name, area, cost, max_people, rent_type_id, facility_type_id, standard_room, description_other_covenience, poll_area, number_of_floors, facility_free) VALUES 
('4', 'Villa No Beach Front', '22000', '9000000', '8', '3', '1', 'normal', 'Có hồ bơi', 300, '3', 'null');
INSERT INTO facility (id, name, area, cost, max_people, rent_type_id, facility_type_id, standard_room, description_other_covenience, poll_area, number_of_floors, facility_free) VALUES
 ('5', 'House Princess 02', '10000', '4000000', '5', '3', '2', 'normal', 'Có thêm bếp nướng', null, '2', 'null');
INSERT INTO facility (id, name, area, cost, max_people, rent_type_id, facility_type_id, standard_room, description_other_covenience, poll_area, number_of_floors, facility_free) VALUES
 ('6', 'Room Twin 02', '3000', '900000', '2', '4', '3', 'normal', 'Có tivi', null, null, '1 Xe máy');
 select * from facility_type;
 insert into facility_type values (1,"Villa");
 insert into facility_type values (2,"House");
 insert into facility_type values (3,"Room");
 select * from rent_type;
 insert into rent_type values (1,"year");
 insert into rent_type values (2,"month");
 insert into rent_type values (3,"day");
 insert into rent_type values (4,"hour");
