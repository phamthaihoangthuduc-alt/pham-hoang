package fit.iuh.opp;

import java.util.Scanner;

public class bai24 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng N: ");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Nhập số thứ " + i + ": ");
            int value = scanner.nextInt();
            sum += value;
        }

        System.out.println("Tổng của " + n + " số nguyên là: " + sum);
    }
}
