package vn.banhang.model;

public class DonHangModel {
	private String MaDon;
	private String NgayXuatDon;
	private String SDTKhachHang;
	public DonHangModel() {
		super();
	}
	
	public DonHangModel(String maDon, String ngayXuatDon, String sdtKhachHang) {
		super();
		MaDon = maDon;
		NgayXuatDon = ngayXuatDon;
		SDTKhachHang = sdtKhachHang;
	}

	public String getMaDon() {
		return MaDon;
	}

	public void setMaDon(String maDon) {
		MaDon = maDon;
	}

	public String getNgayXuatDon() {
		return NgayXuatDon;
	}

	public void setNgayXuatDon(String ngayXuatDon) {
		NgayXuatDon = ngayXuatDon;
	}

	public String getSDTKhachHang() {
		return SDTKhachHang;
	}

	public void setSDTKhachHang(String sDTKhachHang) {
		SDTKhachHang = sDTKhachHang;
	}
	
	@Override
	public String toString() {
		return "DonHangModel [MaDon=" + MaDon + ", NgayXuatDon=" + NgayXuatDon + ", SDTKhachHang=" + SDTKhachHang + "]";
	}
}
