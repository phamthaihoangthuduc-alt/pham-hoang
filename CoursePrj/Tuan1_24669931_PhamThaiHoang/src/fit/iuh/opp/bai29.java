package fit.iuh.opp;
import java.util.Scanner;
public class bai29 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Nhap M (so hang): ");
	        int M = sc.nextInt();
	        System.out.print("Nhap N (so cot): ");
	        int N = sc.nextInt();

	        System.out.println("\nHinh a:");
	        hinhA(M);

	        System.out.println("\nHinh b:");
	        hinhB(M);

	        System.out.println("\nHinh c:");
	        hinhC(M);

	        System.out.println("\nHinh d:");
	        hinhD(M);
	    }

	    static void hinhA(int n) {
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	    }

	    static void hinhB(int n) {
	        for (int i = n; i >= 1; i--) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	    }

	    static void hinhC(int n) {
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print("  ");
	            }
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	    }

	    static void hinhD(int n) {
	    	    for (int i = 1; i <= n; i++) {
	    	        for (int j = 1; j <= n - i; j++) {
	    	            System.out.print(" ");
	    	        }
	    	        // in dấu *
	    	        for (int j = 1; j <= 2 * i - 1; j++) {
	    	            if (j == 1 || j == 2 * i - 1 || i == n) {
	    	                System.out.print("*");
	    	            } else {
	    	                System.out.print(" ");
	    	            }
	    	        }
	    	        System.out.println();
	    	    }

	    }
}
