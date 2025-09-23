package fit.iuh.opp;

public class bai6 {
	public static void main (String[] args) {
        int result = 1 + 2;       // result = 3
        result = result - 1;      // result = 2
        result = result * 2;      // result = 4
        result = result / 2;      // result = 2
        result = result + 8;      // result = 10
        result = result % 7;      // result = 3
        System.out.println("Final result = " + result); // result = 3
        
        String firstString = "This is";
        String secondString = " a concatenated string."; 
        String thirdString = firstString + secondString; //thirdString = firstString + secondString →"This is a concatenated string."
        System.out.println(thirdString); // result : This is a concatenated string.
        
        System.out.println(result); //  1

        result--;
        System.out.println(result); //  0

        result++;
        System.out.println(result); //  1

        result = -result;
        System.out.println(result); //  -1

        boolean success = false;
        System.out.println(success); //  false

        success = !success;
        System.out.println(success); //  true

        int i = 3;
        i++;
        System.out.println(i); //  4

        System.out.println(i++); //  4 (in trước, rồi tăng)

        System.out.println(i); //  5

        System.out.println(++i); //  6 (tăng trước, rồi in)
    }
}
