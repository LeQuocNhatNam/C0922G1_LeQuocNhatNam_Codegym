create database QuanLyDiemThi;
use QuanLyDiemThi;
create table HocSinh(
ma_hs varchar (20) primary key,
ten_hs varchar(50),
ngay_sinh datetime,
lop varchar (20),
gt varchar(20)
);

create table mon_hoc(
ma_mh varchar(20) primary key,
ten_mh varchar(20),
ma_gv varchar(20),
foreign key (ma_gv) references giao_vien (ma_gv)
);

create table bangdiem(
ma_hs varchar(20),
ma_mh varchar(20),
diem_thi int,
ngay_kt datetime,
primary key (ma_hs, ma_mh),
foreign key (ma_hs) references HocSinh(ma_hs),
foreign key (ma_mh) references mon_hoc (ma_mh)
);

create table giao_vien (
ma_gv varchar(20) primary key,
ten_gv varchar(20),
sdt varchar(10)
);bo_phan



