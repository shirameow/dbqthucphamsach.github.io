package vn.banhang.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import vn.banhang.connection.DBConnect;
import vn.banhang.model.SanPhamModel;

public class SanPhamDAO {
	Connection conn=null;
//	Sử dụng các kêu Query
	PreparedStatement ps=null;
//	Xuất kết quả 
	ResultSet rs=null;
	
//	Hiển thị 3 sản phẩm mới nhất
//	@Override
	public List<SanPhamModel> getTop3SanPhamMoiNhat(){
//		Khai báo List lưu danh sách sản phẩm
		List<SanPhamModel> list= new ArrayList<SanPhamModel>();
//		Khi báo chuỗi truy vấn 
		String sql ="select top 3 * from SanPham order by MaSP desc";
		
		try {
//			Mở kết nối database
			conn= new DBConnect().getConnection();
//			Ném câu query vào SQL server
			ps = conn.prepareStatement(sql);
//			Chạy câu query và nhân lại kết quả
			rs=ps.executeQuery();
//			Lấy từ ResultSet đổ vào list
//			rs.next() chạy từng dòng
			while(rs.next()){
				list.add(new SanPhamModel(rs.getString(1),rs.getString(2),rs.getInt(3),
						rs.getDouble(4),rs.getString(5),rs.getString(6),rs.getDouble(7),
					rs.getInt(8),rs.getInt(9),rs.getString(10),rs.getString(11),rs.getString(12)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	public List<SanPhamModel> getTop3SanPhamMoiNhat2(){
//		Khai báo List lưu danh sách sản phẩm
		List<SanPhamModel> list= new ArrayList<SanPhamModel>();
//		Khi báo chuỗi truy vấn 
		String sql ="select top((select COUNT(*) from SanPham)-3) * from SanPham \r\n"
				+ "except \r\n"
				+ "select top((select COUNT(*) from SanPham)-6) * from SanPham ";
		
		try {
//			Mở kết nối database
			conn= new DBConnect().getConnection();
//			Ném câu query vào SQL server
			ps = conn.prepareStatement(sql);
//			Chạy câu query và nhân lại kết quả
			rs=ps.executeQuery();
//			Lấy từ ResultSet đổ vào list
//			rs.next() chạy từng dòng
			while(rs.next()){
				list.add(new SanPhamModel(rs.getString(1),rs.getString(2),rs.getInt(3),
						rs.getDouble(4),rs.getString(5),rs.getString(6),rs.getDouble(7),
					rs.getInt(8),rs.getInt(9),rs.getString(10),rs.getString(11),rs.getString(12)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	public List<SanPhamModel> getAllSanPhamDoTuoi(){
//		Khai báo List lưu danh sách sản phẩm
		List<SanPhamModel> list= new ArrayList<SanPhamModel>();
//		Khi báo chuỗi truy vấn 
		String sql ="select * from SanPham where SanPham.DoTuoiKho=N'Đồ tươi'";
		
		try {
//			Mở kết nối database
			conn= new DBConnect().getConnection();
//			Ném câu query vào SQL server
			ps = conn.prepareStatement(sql);
//			Chạy câu query và nhân lại kết quả
			rs=ps.executeQuery();
//			Lấy từ ResultSet đổ vào list
//			rs.next() chạy từng dòng
			while(rs.next()){
				list.add(new SanPhamModel(rs.getString(1),rs.getString(2),rs.getInt(3),
						rs.getDouble(4),rs.getString(5),rs.getString(6),rs.getDouble(7),
					rs.getInt(8),rs.getInt(9),rs.getString(10),rs.getString(11),rs.getString(12)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	public List<SanPhamModel> getAllSanPhamDoKho(){
//		Khai báo List lưu danh sách sản phẩm
		List<SanPhamModel> list= new ArrayList<SanPhamModel>();
//		Khi báo chuỗi truy vấn 
		String sql ="select * from SanPham where SanPham.DoTuoiKho=N'Đồ Khô'";
		
		try {
//			Mở kết nối database
			conn= new DBConnect().getConnection();
//			Ném câu query vào SQL server
			ps = conn.prepareStatement(sql);
//			Chạy câu query và nhân lại kết quả
			rs=ps.executeQuery();
//			Lấy từ ResultSet đổ vào list
//			rs.next() chạy từng dòng
			while(rs.next()){
				list.add(new SanPhamModel(rs.getString(1),rs.getString(2),rs.getInt(3),
						rs.getDouble(4),rs.getString(5),rs.getString(6),rs.getDouble(7),
					rs.getInt(8),rs.getInt(9),rs.getString(10),rs.getString(11),rs.getString(12)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	public List<SanPhamModel> getTop3SanPhamDanhGiaCao(){
//		Khai báo List lưu danh sách sản phẩm
		List<SanPhamModel> list= new ArrayList<SanPhamModel>();
//		Khi báo chuỗi truy vấn 
		String sql ="select top(3) * from SanPham where DanhGia >=4 order by DanhGia desc";
		
		try {
//			Mở kết nối database
			conn= new DBConnect().getConnection();
//			Ném câu query vào SQL server
			ps = conn.prepareStatement(sql);
//			Chạy câu query và nhân lại kết quả
			rs=ps.executeQuery();
//			Lấy từ ResultSet đổ vào list
//			rs.next() chạy từng dòng
			while(rs.next()){
				list.add(new SanPhamModel(rs.getString(1),rs.getString(2),rs.getInt(3),
						rs.getDouble(4),rs.getString(5),rs.getString(6),rs.getDouble(7),
					rs.getInt(8),rs.getInt(9),rs.getString(10),rs.getString(11),rs.getString(12)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	public List<SanPhamModel> getTopSanPhamBanChay(){
//		Khai báo List lưu danh sách sản phẩm
		List<SanPhamModel> list= new ArrayList<SanPhamModel>();
//		Khi báo chuỗi truy vấn 
		String sql ="select SanPham.MaSP, SanPham.TenSP, SanPham.GiaSP, SanPham.SoLuongTonKho, SanPham.PhanLoai, SanPham.DoTuoiKho, SanPham.DanhGia, SanPham.LuotDanhGia, SanPham.GiamGia, SanPham.MoTaSP, SanPham.NgayNhapHang,SanPham.HinhAnh, topsp.TongSoBanRa\r\n"
				+ "			from SanPham, (select top(9) SanPham.MaSP, Sum(SoLuong) as TongSoBanRa from SanPham inner join ChiTietDonHang on SanPham.MaSP = ChiTietDonHang.MaSP\r\n"
				+ "											group by SanPham.MaSP order by TongSoBanRa)topsp\r\n"
				+ "			where SanPham.MaSP = topsp.MaSP";
		
		try {
//			Mở kết nối database
			conn= new DBConnect().getConnection();
//			Ném câu query vào SQL server
			ps = conn.prepareStatement(sql);
//			Chạy câu query và nhân lại kết quả
			rs=ps.executeQuery();
//			Lấy từ ResultSet đổ vào list
//			rs.next() chạy từng dòng
			while(rs.next()){
				list.add(new SanPhamModel(rs.getString(1),rs.getString(2),rs.getInt(3),
						rs.getDouble(4),rs.getString(5),rs.getString(6),rs.getDouble(7),
					rs.getInt(8),rs.getInt(9),rs.getString(10),rs.getString(11),rs.getString(12)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	public List<SanPhamModel> getSanPhamTheoLoai(String phanLoai){
//		Khai báo List lưu danh sách sản phẩm
		List<SanPhamModel> list= new ArrayList<SanPhamModel>();
//		Khi báo chuỗi truy vấn 
		String sql ="select * from SanPham where PhanLoai= ?";
		
		try {
//			Mở kết nối database
			conn= new DBConnect().getConnection();
//			Ném câu query vào SQL server
			ps = conn.prepareStatement(sql);
//			Gán giá trị cho dấu hỏi
			ps.setString(1, phanLoai);
//			Chạy câu query và nhân lại kết quả
			rs=ps.executeQuery();
//			Lấy từ ResultSet đổ vào list
//			rs.next() chạy từng dòng
			while(rs.next()){
				list.add(new SanPhamModel(rs.getString(1),rs.getString(2),rs.getInt(3),
						rs.getDouble(4),rs.getString(5),rs.getString(6),rs.getDouble(7),
					rs.getInt(8),rs.getInt(9),rs.getString(10),rs.getString(11),rs.getString(12)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	public List<SanPhamModel> getAllSanPham(){
//		Khai báo List lưu danh sách sản phẩm
		List<SanPhamModel> list= new ArrayList<SanPhamModel>();
//		Khi báo chuỗi truy vấn 
		String sql ="select * from SanPham ";
		
		try {
//			Mở kết nối database
			conn= new DBConnect().getConnection();
//			Ném câu query vào SQL server
			ps = conn.prepareStatement(sql);
//			Chạy câu query và nhân lại kết quả
			rs=ps.executeQuery();
//			Lấy từ ResultSet đổ vào list
//			rs.next() chạy từng dòng
			while(rs.next()){
				list.add(new SanPhamModel(rs.getString(1),rs.getString(2),rs.getInt(3),
						rs.getDouble(4),rs.getString(5),rs.getString(6),rs.getDouble(7),
					rs.getInt(8),rs.getInt(9),rs.getString(10),rs.getString(11),rs.getString(12)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	public List<SanPhamModel> getAllSanPhamGiamGia(){
//		Khai báo List lưu danh sách sản phẩm
		List<SanPhamModel> list= new ArrayList<SanPhamModel>();
//		Khi báo chuỗi truy vấn 
		String sql ="select * from SanPham where GiamGia != 0";
		
		try {
//			Mở kết nối database
			conn= new DBConnect().getConnection();
//			Ném câu query vào SQL server
			ps = conn.prepareStatement(sql);
//			Chạy câu query và nhân lại kết quả
			rs=ps.executeQuery();
//			Lấy từ ResultSet đổ vào list
//			rs.next() chạy từng dòng
			while(rs.next()){
				list.add(new SanPhamModel(rs.getString(1),rs.getString(2),rs.getInt(3),
						rs.getDouble(4),rs.getString(5),rs.getString(6),rs.getDouble(7),
					rs.getInt(8),rs.getInt(9),rs.getString(10),rs.getString(11),rs.getString(12)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	public SanPhamModel getOneSanPham(String maSP){

//		Khi báo chuỗi truy vấn 
		String sql ="select * from SanPham where MaSP = ?";
		
		try {
//			Mở kết nối database
			conn= new DBConnect().getConnection();
//			Ném câu query vào SQL server
			ps = conn.prepareStatement(sql);
//			Chạy câu query và nhân lại kết quả
			ps.setString(1, maSP); 
			rs=ps.executeQuery();
//			Lấy từ ResultSet đổ vào list
//			rs.next() chạy từng dòng
			while(rs.next()){
				return new SanPhamModel(rs.getString(1),rs.getString(2),rs.getInt(3),
						rs.getDouble(4),rs.getString(5),rs.getString(6),rs.getDouble(7),
					rs.getInt(8),rs.getInt(9),rs.getString(10),rs.getString(11),rs.getString(12));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public List<SanPhamModel> get4SanPham(String maSP){
//		Khai báo List lưu danh sách sản phẩm
		List<SanPhamModel> list= new ArrayList<SanPhamModel>();
//		Khi báo chuỗi truy vấn 
		String sql ="select top 4 * from SanPham where MaSP != ?";
		
		try {
//			Mở kết nối database
			conn= new DBConnect().getConnection();
//			Ném câu query vào SQL server
			ps = conn.prepareStatement(sql);
//			Chạy câu query và nhân lại kết quả
			ps.setString(1, maSP);
			rs=ps.executeQuery();
//			Lấy từ ResultSet đổ vào list
//			rs.next() chạy từng dòng
			while(rs.next()){
				list.add(new SanPhamModel(rs.getString(1),rs.getString(2),rs.getInt(3),
						rs.getDouble(4),rs.getString(5),rs.getString(6),rs.getDouble(7),
					rs.getInt(8),rs.getInt(9),rs.getString(10),rs.getString(11),rs.getString(12)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	public List<SanPhamModel> getTimKiemSanPham(String thongTinSP){
//		Khai báo List lưu danh sách sản phẩm
		List<SanPhamModel> list= new ArrayList<SanPhamModel>();
//		Khi báo chuỗi truy vấn 
		String sql ="select * from SanPham where TenSP like ?";/*or MoTaSP like N'%?%'*/
		
		try {
//			Mở kết nối database
			conn= new DBConnect().getConnection();
//			Ném câu query vào SQL server
			ps = conn.prepareStatement(sql);
//			Chạy câu query và nhân lại kết quả
//			Quăng dữ liệu vào dấu hỏi số 1
			ps.setString(1,"%" + thongTinSP + "%");
//			ps.setString(2, thongTinSP);
			rs=ps.executeQuery();
//			Lấy từ ResultSet đổ vào list
//			rs.next() chạy từng dòng
			while(rs.next()){
				list.add(new SanPhamModel(rs.getString(1),rs.getString(2),rs.getInt(3),
						rs.getDouble(4),rs.getString(5),rs.getString(6),rs.getDouble(7),
					rs.getInt(8),rs.getInt(9),rs.getString(10),rs.getString(11),rs.getString(12)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
//	Test dữ liệu
//	public static void main(String[] args) {
//		SanPhamDAO pd=new SanPhamDAO();
//		List<SanPhamModel> list=pd.getTimKiemSanPham("C");
//		System.out.println(list);
//	}
}
