package iuh.fit.opp;
import java.util.Scanner;
public class testhcn {
			public static Hinhchunhat nhap() throws Exception{
				System.out.println("Nhap tu ban phim canh Hcn");
				Scanner sc = new Scanner(System.in);
				System.out.println("nhap chieu dai =");
				double d=sc.nextDouble();
				System.out.println("nhap chieu rong =");
				double r=sc.nextDouble();
				Hinhchunhat h= new Hinhchunhat(d,r);
				return h;
	}
		public static void main(String[] args) throws Exception{
			Hinhchunhat h1= new Hinhchunhat();
			h1.setChieuDai(10);
			h1.setChieuRong(3);
			h1.inTieuDe();
			System.out.println(h1);
			Hinhchunhat h2= new Hinhchunhat(120,30);
			System.out.println(h2);
			System.out.println(h2);
			System.out.println(nhap());
		}
	}


