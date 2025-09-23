package fit.iuh.opp;

import java.util.Scanner;

public class bai15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	       System.out.println("nhap vao so luong phan tu :");
	       int n = sc.nextInt();
	       
	       if (n <= 0) {
	            System.out.println("Số lượng phải lớn hơn 0.");
	            return;
	        }  
	    int max ,min;
	    System.out.print("nhao so thu 1: ");
	    int first = sc.nextInt();
        max = min = first;

        for (int i = 2; i <= n; i++) {
            System.out.print("Nhập số thứ " + i + ": ");
            int value = sc.nextInt();

            if (value > max) max = value;
            if (value < min) min = value;
        }

        System.out.println("Giá trị lớn nhất là: " + max);
        System.out.println("Giá trị nhỏ nhất là: " + min);
	}
}
