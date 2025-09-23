package fit.iuh.opp;

public class bai21 {
		public static void main(String[] args) {
	        String s = "Bai Tap Mon Lap Trinh Java";
	        splitAndPrint(s);
	    }

	    public static void splitAndPrint(String s) {
	        String[] words = s.split(" ");

	        for (String word : words) {
	            System.out.println(word); 
	        }
	    }
	}


