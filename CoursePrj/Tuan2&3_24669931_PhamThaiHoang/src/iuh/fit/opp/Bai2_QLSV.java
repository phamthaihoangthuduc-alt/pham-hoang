package iuh.fit.opp;

import java.util.Scanner;

public class Bai2_QLSV {
	private int maSV;
	private String hoTen;
	private float diemLt;
	private float diemTh;

// constructor mac dinh
	public Bai2_QLSV() {
		this.maSV = 0;
		this.hoTen = null;
		this.diemLt = 0;
		this.diemTh = 0;
	}

	// constructor day du
public Bai2_QLSV(int maSV, String hoTen, float diemLt, float diemTh) {
	super();
	this.maSV = maSV;
	this.hoTen = hoTen;
	this.diemLt = diemLt;
	this.diemTh = diemTh;
}

public int getMaSV() {
	return maSV;
}

public void setMaSV(int maSV) {
	this.maSV = maSV;
}

public String getHoTen() {
	return hoTen;
}

public void setHoTen(String hoTen) {
	this.hoTen = hoTen;
}

public float getDiemLt() {
	return diemLt;
}

public void setDiemLt(float diemLt) {
	this.diemLt = diemLt;
}

public float getDiemTh() {
	return diemTh;
}

public void setDiemTh(float diemTh) {
	this.diemTh = diemTh;
}
public float diemTrungBinh() {
	return (diemLt+diemTh)/2;
}

@Override
public String toString() {
	return String.format("%-6s %-30s %10.2f %10.2f %10.2f",maSV,hoTen,diemLt,diemTh,diemTrungBinh());
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Bai2_QLSV sv1 = new Bai2_QLSV(111222,"tran thien an",6.5f,8.5f);
		Bai2_QLSV sv2 = new Bai2_QLSV(112233,"trinh tran phuong tuan",4f,2.75f);
		Bai2_QLSV sv3 = new Bai2_QLSV();
				
		System.out.println("nhap ma so sinh vien : ");
		int maSV = sc.nextInt();
		sc.nextLine();
		System.out.println("nhap ho ten sinh vien : ");
		String hoTen = sc.nextLine();
		System.out.println("nhap diem ly thuyet : ");
		float diemLt = sc.nextFloat();
		System.out.println("nhap ma so sinh vien : ");
		float diemTh = sc.nextFloat();
		
		sv3.setMaSV(maSV);
		sv3.setHoTen(hoTen);
		sv3.setDiemLt(diemLt);
		sv3.setDiemTh(diemTh);
		
		System.out.println(String.format("%-6s %-30s %10s %10s %10s", "MSSV","Ho Ten","Diem Lt","Diem Th","Diem Trb"));
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
	}
}
