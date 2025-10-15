package iuh.fit.opp;

import java.util.Date;
import java.util.Locale;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Bai3b_HangThucPham {
	private String maHang;
	private String tenHang;
	private double donGia;
	private LocalDate ngaySanXuat;
	private LocalDate ngayHetHan;
	
	public Bai3b_HangThucPham(String maHang, String tenHang, double donGia, LocalDate ngaySanXuat,
			LocalDate ngayHetHan) {
	setMaHang(maHang);
	setTenHang(tenHang);
	setDonGia(donGia);
	setNgaySanXuat(ngaySanXuat);
	setNgayHetHan(ngayHetHan);
	}

	public Bai3b_HangThucPham(String maHang) {
		this(maHang , "null",1.0,LocalDate.now(),LocalDate.now());
	}

	public String getMaHang() {
		return maHang;
	}

	public void setMaHang(String maHang) {
		if(maHang == null || maHang.isEmpty()) {
			maHang = "000000";
		}
		this.maHang = maHang;
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		if(tenHang == null || tenHang.isEmpty()) {
			tenHang = "khong co ten";
		}
		this.tenHang = tenHang;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		if(donGia <= 0) {
			donGia = 1.0;
		}
		this.donGia = donGia;
	}

	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		if(ngaySanXuat == null || ngaySanXuat.isAfter(LocalDate.now())) {
			ngaySanXuat = LocalDate.now();
		}
		this.ngaySanXuat = ngaySanXuat;
	}

	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}

	public void setNgayHetHan(LocalDate ngayHetHan) {
		if(ngayHetHan == null || ngaySanXuat.compareTo(ngayHetHan) >= 0) {
			ngayHetHan = ngaySanXuat;
		}
		this.ngayHetHan = ngayHetHan;
	}

	public boolean hetHan() {
		return ngayHetHan.isBefore(LocalDate.now());
	}

	@Override
	public String toString() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("vi","VN"));
		DecimalFormat df = new DecimalFormat("#,##0");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("|%-6s|%-20s||%-20s||%-12s||%-12s|%-12s|", 
				maHang,
				tenHang,
				donGia,
				dtf.format(ngaySanXuat),
				dtf.format(ngayHetHan),
				hetHan() ? "het han" : "con han"
				);

	}

	
	
}
