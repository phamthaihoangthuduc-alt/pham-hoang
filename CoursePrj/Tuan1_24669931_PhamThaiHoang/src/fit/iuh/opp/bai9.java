package fit.iuh.opp;
import java.util.Random;
public class bai9 {
	public static void main(String[] args) {
		int score = 76;
		char grade;

		if (score >= 90)
		    grade = 'A';
		else if (score >= 80)
		    grade = 'B';
		else if (score >= 70)
		    grade = 'C';
		else if (score >= 60)
		    grade = 'D';
		else
		    grade = 'F';

		System.out.println("Grade = " + grade); // Grade = C
		//Kiểm tra hỗn hợp điều kiện,So sánh giá trị, logic biểu thức
		
		
		int month = 8;
		String monthString;

		switch (month) {
		    case 1:  monthString = "January"; break;
		    case 2:  monthString = "February"; break;	
		    case 8:  monthString = "August"; break;
		    default: monthString = "Invalid month"; break;
		}

		System.out.println(monthString); // August
		//Gọn gàng với nhiều công cụ giá tri,So sánh giá trị nguyên, chuỗi
		
		for(int i = 1; i < 11; i++) {
		    System.out.println("Count is: " + i);
		}
//		Lặp từi = 1(tức là từ 1 đến 10). đến i < 11 (tức là từ 1 đến 10).
//		Mỗi lần lặp , in ra value of .i
//		Vòng lặp for thường được sử dụng khi biết số lần lặp trước .
		
		int count = 1;
		while (count < 11) {
		    System.out.println("Count is: " + count);
		    count++;
		}
//		p.Kiểm tra điều kiện count < 11 trước mỗi vòng .
//		Nếu đúng thì thực thi lệnh và tăng khối .count
//		Sử dụng khi chưa biết trước số lần lặp , nhưng có điều kiện rõ ràng.
		
		do {
		    System.out.println("Count is: " + count);
		    count++;
		} while (count < 11);
		
//		Luôn thực hiện ít nhất một lần , rồi mới kiểm tra điều kiện.
//		Sử dụng khi cần chạy lệnh khối ít nhất một lần , ngoại trừ lệnh cấm đầu tiên.
		
		Random num = new Random();
		int number = num.nextInt();
		System.out.println("Number: " + number);
		int min = 50;
		int max = 80;
		int n = (int)(Math.random() * (max - min + 1) + min);
		
//		Math.random() sinh thực tế từ .​0.0 <1.0
//		Nhân để mở rộng phạm (max - min + 1) vi .
//		Cộng để chuyển đổi min về khoảng mong muốn .
//		Ép kiểu để int lấy số nguyên .
//		Ví dụ: Nếu min = 50, max = 80, thì n sẽ nằm trong khoảng từ 50 đến 80.
	}
}
