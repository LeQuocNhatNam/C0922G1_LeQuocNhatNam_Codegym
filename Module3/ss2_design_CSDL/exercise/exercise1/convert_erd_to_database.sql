create database practice_erd;
use practice_erd;
create table phieu_xuat(
so_phieu_xuat int primary key auto_increment,
ngay_xuat datetime
);

create table phieu_nhap (
so_phieu_nhap int primary key auto_increment,
ngay_nhap datetime
);

create table vat_tu (
ma_vat_tu int primary key auto_increment,
ten_vat_tu varchar(50)
);

create table nha_cung_cap (
ma_cung_cap int primary key auto_increment,
ten_ncc varchar (50),
dia_chi varchar (50),
sdt varchar (10)
);

create table don_dat_hang (
so_dat_hang int primary key auto_increment,
ngay_dat_hang datetime,
ma_cung_cap int,
foreign key (ma_cung_cap) references nha_cung_cap (ma_cung_cap)
);

create table chi_tiet_phieu_xuat (
so_phieu_xuat int,
ma_vat_tu int,
don_gia_xuat double default 0,
so_luong_xuat int default 0,
primary key (so_phieu_xuat, ma_vat_tu),
foreign key (so_phieu_xuat) references phieu_xuat (so_phieu_xuat),
foreign key (ma_vat_tu) references vat_tu (ma_vat_tu)
);

create table chi_tiet_phieu_nhap (
so_phieu_nhap int,
ma_vat_tu int,
don_gia_nhap double default 0,
so_luong_nhap int default 0,
primary key (so_phieu_nhap, ma_vat_tu),
foreign key (so_phieu_nhap) references phieu_nhap (so_phieu_nhap),
foreign key (ma_vat_tu) references vat_tu (ma_vat_tu)
);

create table chi_tiet_don_hang (
ma_vat_tu int,
so_dat_hang int,
ngay_dat_hang datetime,
primary key (ma_vat_tu, so_dat_hang),
foreign key (ma_vat_tu) references vat_tu(ma_vat_tu),
foreign key (so_dat_hang) references don_dat_hang(so_dat_hang)
);








