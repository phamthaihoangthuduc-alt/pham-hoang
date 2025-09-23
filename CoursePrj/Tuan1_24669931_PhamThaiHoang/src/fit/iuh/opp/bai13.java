package fit.iuh.opp;

import java.util.Scanner;

public class bai13 {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("nhap vao n: ");
		 int n = sc.nextInt();
		 
		 int sum = 0; 
		 for(int i = 0 ; i <= n ; i++) {
			 sum+=i;
		 }
		 System.out.println("Tổng từ 1 đến " + n + " là: " + sum);
	}
}