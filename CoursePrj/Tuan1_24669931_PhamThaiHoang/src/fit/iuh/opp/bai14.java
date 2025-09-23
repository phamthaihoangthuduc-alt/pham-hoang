package fit.iuh.opp;

import java.util.Scanner;

public class bai14 {
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("nhap vao n :");
       int n = sc.nextInt();
       
       int sum = 0 ;
       if(n%2 == 0) {
    	   for(int i = 1 ; i <=n;i+=2){
    		 sum+=i;
    	   }
    	   System.out.println("Tổng các số lẻ từ 1 đến " + n + " là: "+sum);
       }
       else {
    	   for(int i = 2 ; i <=n;i+=2){
      		 sum+=i;
      	   }
      	   System.out.println("Tổng các số chẵn từ 2 đến " + n + " là: "+sum); 
       }
    }
}
