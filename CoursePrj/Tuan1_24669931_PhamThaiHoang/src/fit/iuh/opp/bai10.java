package fit.iuh.opp;

public class bai10 {
	public static void main(String[] args) {

	// dung vong lap for
	int sum = 0; 
	for(int i = 0 , count = 0 ; count < 11 ; i++) {
		if(i%2==0) {
			sum+=i;
			count++;
		}
	}
	System.out.println(" tong 10 so chan dau tien : " + sum);
	
	// dung do while
	int cong = 0;
	int count = 0;
	int i = 0;
	while (count < 11) {
		if(i%2==0) {
			cong+=i;
			count++;
		}
		i++;
	}
System.out.println(" tong 10 so chan dau tien : " + cong);
	
}
}