package fit.iuh.opp;

import java.util.Scanner;

public class bai26 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập số nguyên N: ");
	        int n = scanner.nextInt();
	        int count = 0;   
	        int number = 2;  
	        int sum = 0;     
	        while (count < n) {
	            if (isPrime(number)) {
	                sum += number;
	                count++;
	            }
	            number++;
	        }

	        System.out.println("Tổng " + n + " số nguyên tố đầu tiên là: " + sum);
	    }
	    public static boolean isPrime(int num) {
	        if (num < 2) return false;

	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) return false;
	        }

	        return true;
	    }
}
