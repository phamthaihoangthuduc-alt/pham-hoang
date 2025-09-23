package fit.iuh.opp;

import java.util.Scanner;

public class bai25 {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập số nguyên N: ");
	        int n = scanner.nextInt();

	        int sum = 0;
	        for (int i = 2; i < n; i++) {
	            if (isPrime(i)) {
	                sum += i;
	            }
	        }

	        System.out.println("Tổng các số nguyên tố nhỏ hơn " + n + " là: " + sum);
	    }

	    public static boolean isPrime(int number) {
	        if (number < 2) return false;

	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) return false;
	        }

	        return true;
	    }
}
