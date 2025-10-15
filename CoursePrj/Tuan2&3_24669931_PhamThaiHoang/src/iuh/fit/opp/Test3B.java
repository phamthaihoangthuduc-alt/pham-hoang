package iuh.fit.opp;

import java.time.LocalDate;

public class Test3B {
	public static void main(String[] args) {
		 Bai3b_HangThucPham product1 = new Bai3b_HangThucPham("P00001");
	        Bai3b_HangThucPham product2 = new Bai3b_HangThucPham("AG0025", "Gạo ST25", 30000,
	                LocalDate.of(2025, 8, 10), LocalDate.of(2025, 10, 20));
	        Bai3b_HangThucPham product3 = new Bai3b_HangThucPham("AB0001", "Bông cải", 45000,
	                LocalDate.of(2025, 7, 15), LocalDate.of(2026, 8, 25) );
	        Bai3b_HangThucPham product4 = new Bai3b_HangThucPham("AB0033", "Sườn bò", 29000,
	                LocalDate.of(2025, 6, 10), LocalDate.of(2025, 4, 20) );
	        Bai3b_HangThucPham product4c = new Bai3b_HangThucPham("AB0033", "Sườn heo", 40000,
	                LocalDate.of(2025, 6, 10), LocalDate.of(2025, 4, 20) );
	        Bai3b_HangThucPham product5 = new Bai3b_HangThucPham("AC0020", "Cải ngọt", 36000,
	                LocalDate.of(2025, 10, 15), LocalDate.of(2026, 1, 28) );
	        Bai3b_HangThucPham product5c = new Bai3b_HangThucPham("AC0021", "Cải ngọt", 33000,
	                LocalDate.of(2025, 10, 15), LocalDate.of(2026, 1, 28) );
	        Bai3b_HangThucPham product6 = new Bai3b_HangThucPham("AG0030", "Cánh gà", 43000,
	                LocalDate.of(2025, 9, 10), LocalDate.of(2025, 7, 21) );

	        String HeaderLine = String.format("%-6s| %-20s|%-20s  |%-12s |%-12s|%-12s|",
	                "Ma", "Ten", "Don gia", "NSX", "NHH", "Ghi chu");
	        System.out.println(HeaderLine);
		    System.out.println("-".repeat(HeaderLine.length()));
	        System.out.println(product1);
	        System.out.println(product2);
	        System.out.println(product3);
	        System.out.println(product4);
	        System.out.println(product4c);
	        System.out.println(product5);
	        System.out.println(product5c);
	        System.out.println(product6);
	    }
}
