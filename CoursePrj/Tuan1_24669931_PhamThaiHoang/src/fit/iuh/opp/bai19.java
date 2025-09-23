package fit.iuh.opp;

import java.util.Scanner;

public class bai19 {
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Nhập một chuỗi bất kỳ: ");
	        String input = sc.nextLine();

	        int count = 0;

	        for (int i = 0; i < input.length(); i++) {
	            if (input.charAt(i) == 'a' || input.charAt(i) == 'A') {
	                count++;
	            }
	        }

	        System.out.println("Số lần ký tự 'a' xuất hiện trong chuỗi là: " + count);
	}
}
