package fit.iuh.opp;

import java.util.Scanner;

public class bai20 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi bất kỳ: ");
        String s = scanner.nextLine();

        int count = countDigits(s);
        System.out.println("Số lượng ký tự là số trong chuỗi: " + count);
    }

    public static int countDigits(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }
	}

