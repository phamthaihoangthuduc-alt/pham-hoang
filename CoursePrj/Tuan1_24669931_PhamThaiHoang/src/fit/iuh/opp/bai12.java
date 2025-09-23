package fit.iuh.opp;

public class bai12 {
	public static void main(String[] args) {
		int sum = 0; 
		for(int i = 7 ; i <= 100 ; i++) {
			if(i%7==0) {
				sum+=i;
			}
		}
		System.out.println("tong cac boi so cua 7 tu 7 den 100 :"+ sum);
	}
}
