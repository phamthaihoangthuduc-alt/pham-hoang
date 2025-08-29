package iuh.fit.opp;

public class Hinhchunhat {
    private double chieuDai;
    private double chieuRong;

    public Hinhchunhat() {}

    public Hinhchunhat(double d, double r) throws Exception {
        if (d < 0 || r < 0) {
            throw new Exception("Length and width must be greater than 0");
        }
        this.chieuDai = d;
        this.chieuRong = r;
    }

    public void setChieuDai(double d) throws Exception {
        if (d < 0) {
            throw new Exception("Length must be greater than 0");
        }
        this.chieuDai = d;
    }

    public void setChieuRong(double r) throws Exception {
        if (r < 0) {
            throw new Exception("Width must be greater than 0");
        }
        this.chieuRong = r;
    }

    public double getChieuDai() {
        return this.chieuDai;
    }

    public double getChieuRong() {
        return this.chieuRong;
    }

    public double getChuVi() {
        return 2 * (chieuDai + chieuRong);
    }

    public double getDienTich() {
        return chieuDai * chieuRong;
    }

    public static void inTieuDe() {
        System.out.println("Bảng diện tích và chu vi hình chữ nhật");
        System.out.println("---------------------------------------------");
        System.out.printf("|%10s|%10s|%10s|%10s|\n", "Chiều dài", "Chiều rộng", "Chu vi", "Diện tích");
        System.out.println("---------------------------------------------");
    }

    @Override
    public String toString() {
        return String.format("|%10.2f|%10.2f|%10.2f|%10.2f|", chieuDai, chieuRong, getChuVi(), getDienTich());
    }

    public static void main(String[] args) {
        inTieuDe();
        try {
            Hinhchunhat hcn = new Hinhchunhat(5, 3);
            System.out.println(hcn.toString());
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
