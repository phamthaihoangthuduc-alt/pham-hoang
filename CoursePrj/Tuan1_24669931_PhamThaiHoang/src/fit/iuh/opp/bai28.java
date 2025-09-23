package fit.iuh.opp;


public class bai28 {
    public static void main(String[] args) {
        int nTriangle = 10;   
        int nBox = 11;        
        int nStar = 11;      

        System.out.println("Hinh 1: Tam giac");
        drawTriangle(nTriangle);
        System.out.println();

        System.out.println("Hinh 2: Hinh vuong co X");
        drawBox(nBox);
        System.out.println();

        System.out.println("Hinh 3: Ngoi sao");
        drawStar(nStar);
    }

    static void drawTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == n - 1 || i == j) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    static void drawBox(int n) {
        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < n) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1 || j == i || j == (n - 1 - i))
                    System.out.print("* ");
                else System.out.print("  ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    static void drawStar(int n) {
    	int center = n / 2; 

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == center              
                        || j == center       
                        || i == j            
                        || i + j == n - 1)   
                {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}


