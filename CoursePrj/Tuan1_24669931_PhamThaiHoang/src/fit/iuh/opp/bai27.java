package fit.iuh.opp;

import java.util.Scanner;

public class bai27 {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập số nguyên n: ");
	        int n = scanner.nextInt();

	        if (n <= 0) {
	            System.out.println("Vui lòng nhập số nguyên dương lớn hơn 0.");
	            return;
	        }

	        System.out.println("Chuỗi Fibonacci gồm " + n + " số đầu tiên:");

	        int a = 1, b = 1;
	        for (int i = 1; i <= n; i++) {
	            System.out.print(a + " ");
	            int next = a + b;
	            a = b;
	            b = next;
	        }
	    }
}
