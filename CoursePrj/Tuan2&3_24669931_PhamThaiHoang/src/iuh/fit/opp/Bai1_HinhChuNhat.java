package iuh.fit.opp;

public class Bai1_HinhChuNhat {
	private double chieuDai;
	private double chieuRong;
	
	public Bai1_HinhChuNhat(double cd , double cr) throws Exception {
		if(cd < 0 || cr < 0) {
			throw new Exception("chieu dai va rong phai lon hon 0");
		}
	this.chieuDai = cd;
	this.chieuRong = cr;
	}

	public double getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(double cd) throws Exception {
		if(cd < 0) {
			throw new Exception("chieu dai phai lon hon 0");
		}
		this.chieuDai = cd;
	}

	public double getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(double cr) throws Exception{
		if(cr < 0) {
			throw new Exception("chieu rong phai lon hon 0");
		}
		this.chieuRong = cr;
	}
	public double tinhChuVi() {
		return 2*(chieuDai + chieuRong);
	}
	public double tinhDienTich() {
		return chieuDai*chieuRong;
	}
	public static void tieude() {
		System.out.println("bang dien tich va chu vi hinh chu nhat");
		System.out.println("-".repeat(50));
		System.out.printf("|%10s|%10s|%10s|%10s|\n","Chieu Dai","Chieu Rong","Chu Vi","Dien Tich");
		System.out.println("-".repeat(50));
	}

	@Override
	public String toString() {
		return String.format("|%10.2f|%10.2f|%10.2f|%10.2f|",chieuDai,chieuRong,tinhChuVi(),tinhDienTich());
	}
	 public static void main(String[] args) {
	        tieude();
	        try {
	            Bai1_HinhChuNhat hcn = new Bai1_HinhChuNhat(5, 3);
	            System.out.println(hcn.toString());
	        } catch (Exception e) {
	            System.out.println("Lỗi: " + e.getMessage());
	        }
	    }

	
	
	
	
}
