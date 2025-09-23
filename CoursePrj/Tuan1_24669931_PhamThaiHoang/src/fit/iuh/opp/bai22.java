package fit.iuh.opp;

import java.util.Scanner;

public class bai22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap 1 so nguyen: ");
		int n = sc.nextInt();
		
		 if (isPrime(n)) {
	            System.out.println(n + " là số nguyên tố.");
	        } else {
	            System.out.println(n + " không phải là số nguyên tố.");
	        }
	    }
	public static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
	}

