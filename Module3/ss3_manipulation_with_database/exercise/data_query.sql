use quan_ly_sinh_vien;
insert into class values (1,'A1','2008-12-20',1);
insert into class values (2,'A2','2008-12-22',1);
insert into class values (3,'A3', current_date(),0);
select * from class;
insert into student (student_name, address, phone, status, class_id) values ('Hung','Ha Noi', '0912113113', 1,1);
insert into student (student_name, address, status, class_id) values ('Hoa','Hai Phong', 1,1);
insert into student (student_name, address, phone, status, class_id) values ('Manh','HCM', '0123123123', 0,2);
select * from student;
insert into subject values (1,'CF', 5,1),
						   (2, 'C', 6,1),
                           (3, 'HDJ', 5,1),
                           (4, 'RDBS', 10, 1);
select * from subject;
insert into mark (sub_id, student_id, mark, examtimes) 
values (1,1,8,1),
	    (3,2,10,2),
        (2,3,12,1);

-- Hiển thị tất cả các sinh viên có tên bắt đầu bảng ký tự ‘h’
select * from student s where s.student_name like 'h%';
-- Hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12.
select * from class c where month(c.start_date) = 12;
-- Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5.
select * from subject sub where sub.credit between 3 and 5;
-- Thay đổi mã lớp (ClassID) của sinh viên có tên ‘Hung’ là 2.
set sql_safe_updates = 0;
update student set student.class_id = 2 where student.student_name = 'Hung';
-- Hiển thị các thông tin: StudentName, SubName, Mark. Dữ liệu sắp xếp theo điểm thi (mark) giảm dần. 
-- nếu trùng sắp theo tên tăng dần.
select s.student_name, sub.sub_name, m.mark
from student s join mark m on s.student_id = m.student_id join subject sub on m.sub_id = sub.sub_id 
order by m.mark desc, s.student_name;
