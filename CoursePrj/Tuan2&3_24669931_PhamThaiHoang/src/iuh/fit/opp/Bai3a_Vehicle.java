package iuh.fit.opp;

public class Bai3a_Vehicle {
	private String tenChuXe;
	private String loaiXe;
	private int dungTich;
	private double giaTriXe;
	
	public Bai3a_Vehicle(String tenChuXe, String loaiXe, int dungTich, double giaTriXe) {
		this.tenChuXe = tenChuXe;
		this.loaiXe = loaiXe;
		this.dungTich = dungTich;
		this.giaTriXe = giaTriXe;
	}
	public double mucThue() {
		if(dungTich < 100) {
			return giaTriXe * 0.01;
		}else if(dungTich <= 200) {
			return giaTriXe*0.03;
		}else {
			return giaTriXe*0.05;
		}
	}
	public String toString() {
		return String.format("|%20s|%20s|%10d|%40.2f|%40.2f|", tenChuXe,loaiXe,dungTich,giaTriXe,mucThue());
	}
	public static void main(String[] args) {
		Bai3a_Vehicle xe1 = new Bai3a_Vehicle("Nguyen Thu Loan", "Future Neo", 100, 35000000);
		Bai3a_Vehicle xe2 = new Bai3a_Vehicle("Le Minh Tinh", "Ford Ranger", 3000, 250000000);
		Bai3a_Vehicle xe3 = new Bai3a_Vehicle("Nguyen Minh Triet", "Landscape", 1500, 1000000000);
		
		
		
		String header = String.format("|%20s|%20s|%10s|%40s|%40s|",
	            						"Ten Chu Xe", "Loai Xe", "Dung Tich", "Tri Gia", "Thue Phai Tra");
	    System.out.println(header);
	    System.out.println("-".repeat(header.length()));
		
		System.out.println(xe1);
		System.out.println(xe2);
		System.out.println(xe3);
	}
	
}
