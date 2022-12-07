package vn.banhang.model;

public class ChiTietDonHangModel {
	private String MaDon;
	private String MaSP;
	private double SoLuong;
	public ChiTietDonHangModel() {
		super();
	}
	
	public ChiTietDonHangModel(String maDon, String maSP, double soLuong) {
		super();
		MaDon = maDon;
		MaSP = maSP;
		SoLuong = soLuong;
	}

	public String getMaDon() {
		return MaDon;
	}

	public void setMaDon(String maDon) {
		MaDon = maDon;
	}

	public String getMaSP() {
		return MaSP;
	}

	public void setMaSP(String maSP) {
		MaSP = maSP;
	}

	public double getSoLuong() {
		return SoLuong;
	}

	public void setSoLuong(double soLuong) {
		SoLuong = soLuong;
	}
	
	@Override
	public String toString() {
		return "ChiTietDonHangModel [MaDon=" + MaDon + ", MaSP=" + MaSP + ", SoLuong=" + SoLuong + "]";
	}
}
