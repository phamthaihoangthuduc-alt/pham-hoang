package fit.iuh.opp;

import java.util.Scanner;

public class bai23 {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	    
	        System.out.print("Nhập số nguyên thứ nhất: ");
	        int a = scanner.nextInt();

	        System.out.print("Nhập số nguyên thứ hai: ");
	        int b = scanner.nextInt();

	        int uscln = findGCD(a, b);

	        System.out.println("USCLN của " + a + " và " + b + " là: " + uscln);
	    }
	    public static int findGCD(int a, int b) {
	        a = Math.abs(a);
	        b = Math.abs(b);

	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }

	        return a;

	}
}
