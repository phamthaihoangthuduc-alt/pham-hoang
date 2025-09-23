package fit.iuh.opp;

import java.util.Scanner;

public class bai17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        
        if(n==0) {
        	System.out.println("so vua nhap la zero(0)");
        }else if(n%2==0) {
        	System.out.println("so vua nhap la so chan");
        }else {
        	System.out.println("so vua nhap la so le");
        }
	}
}
