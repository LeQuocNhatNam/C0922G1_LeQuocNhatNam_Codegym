use furama_management;
-- 16.  Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2019 đến năm 2021.
delete from 
  nhan_vien nv 
where 
  nv.ma_nhan_vien not in (
    select 
      hd.ma_nhan_vien 
    from 
      hop_dong hd 
    where 
      year(hd.ngay_lam_hop_dong) in (2019, 2020, 2021)
  );
set 
  sql_safe_updates = 0;
-- 17.  Cập nhật thông tin những khách hàng có ten_loai_khach từ Platinum lên Diamond,
-- chỉ cập nhật những khách hàng đã từng đặt phòng với Tổng Tiền thanh toán trong năm 2021 là lớn hơn 10.000.000 VNĐ.
create view khach_hang_tong_chi_phi_dich_vu_di_kem as 
select 
  kh.ma_khach_hang, 
  sum(hdct.so_luong * dvdk.gia) as tong_chi_phi_di_kem, 
  dv.chi_phi_thue 
from 
  khach_hang kh 
  left join hop_dong hd on kh.ma_khach_hang = hd.ma_khach_hang 
  left join hop_dong_chi_tiet hdct on hdct.ma_hop_dong = hd.ma_hop_dong 
  left join dich_vu_di_kem dvdk on dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem 
  left join loai_khach lk on lk.ma_loai_khach = kh.ma_loai_khach 
  left join dich_vu dv on dv.ma_dich_vu = hd.ma_dich_vu 
where 
  lk.ten_loai_khach = 'Platinium' 
  and year(hd.ngay_lam_hop_dong) = 2021 
group by 
  hd.ma_hop_dong;
create view khach_hang_tong_tien_thanh_toan as 
select 
  ma_khach_hang, 
  sum(
    tong_chi_phi_di_kem + chi_phi_thue
  ) as tong_chi_phi 
from 
  khach_hang_tong_chi_phi_dich_vu_di_kem khcpdk 
group by 
  ma_khach_hang 
having 
  tong_chi_phi > 10000000;
update 
  khach_hang kh 
set 
  ma_loai_khach = 1 
where 
  kh.ma_khach_hang in (
    select 
      ma_khach_hang 
    from 
      khach_hang_tong_tien_thanh_toan
  );
-- 18.  Xóa những khách hàng có hợp đồng trước năm 2021 (chú ý ràng buộc giữa các bảng).
delete from 
  khach_hang 
where 
  khach_hang.ma_khach_hang in (
    select 
      hd.ma_khach_hang 
    from 
      hop_dong hd 
    where 
      year(hd.ngay_lam_hop_dong) < 2021
  );
-- 19.  Cập nhật giá cho các dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2020 lên gấp đôi.
update 
  dich_vu_di_kem 
set 
  dich_vu_di_kem.gia = 2 * dich_vu_di_kem.gia 
where 
  dich_vu_di_kem.ma_dich_vu_di_kem in (
    select 
      hdct.ma_dich_vu_di_kem 
    from 
      hop_dong hd 
      join hop_dong_chi_tiet hdct on hd.ma_hop_dong = hdct.ma_hop_dong 
    where 
      hdct.so_luong > 10 
      and year(hd.ngay_lam_hop_dong) = 2020
  );
-- 20.  Hiển thị thông tin của tất cả các nhân viên và khách hàng có trong hệ thống, thông tin hiển thị bao gồm id 
-- (ma_nhan_vien, ma_khach_hang), ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi.
select 
  ma_nhan_vien as ma_nhan_vien_khach_hang, 
  ho_ten, 
  email, 
  so_dien_thoai, 
  ngay_sinh, 
  dia_chi 
from 
  nhan_vien 
union 
select 
  ma_khach_hang as ma_nhan_vien_khach_hang, 
  ho_ten, 
  email, 
  so_dien_thoai, 
  ngay_sinh, 
  dia_chi 
from 
  khach_hang;
