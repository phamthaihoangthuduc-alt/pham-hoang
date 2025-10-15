package iuh.fit.opp;

import java.text.NumberFormat;
import java.util.Locale;


public class CD {
	private int maCD;
	private String tenCD;
	private int soBai;
	private float giaThanh;
	
	public CD() {
		this.maCD = 999999;
		this.tenCD = "chua xac dinh";
	}

	public CD(int maCD, String tenCD, int soBai, float giaThanh) {
		setMaCD(maCD);
		setTenCD(tenCD);
		setSoBai(soBai);
		setGiaThanh(giaThanh);
	}

	public int getMaCD() {
		return maCD;
	}

	public void setMaCD(int maCD) {
		if(maCD < 0) {
			this.maCD = 999999;
		}
		this.maCD = maCD;
	}

	public String getTenCD() {
		return tenCD;
	}

	public void setTenCD(String tenCD) {
		if(tenCD == null || tenCD.isEmpty()) {
			this.tenCD = "chua xac dinh";
		}
		this.tenCD = tenCD;
	}

	public int getSoBai() {
		return soBai;
	}

	public void setSoBai(int soBai) {
		if(soBai < 0) {
			this.soBai = 1;
		}
		this.soBai = soBai;
	}

	public float getGiaThanh() {
		return giaThanh;
	}

	public void setGiaThanh(float giaThanh) {
		if(giaThanh < 0) {
			giaThanh = 1;
		}
		this.giaThanh = giaThanh;
	}

	@Override
	public String toString() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("vi","VN"));
		return String.format("|%10s|%10s|%10s|%10s",
				maCD,
				tenCD,
				soBai,
				nf.format(giaThanh));
	}

}
