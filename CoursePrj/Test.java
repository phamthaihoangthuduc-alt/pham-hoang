package cosovatchat;

public class Test {
	public class Main {

	    // Enum chất liệu
	    enum ChatLieu {
	        GO, NHUA, KIMLOAI
	    }

	    // Enum kích cỡ
	    enum KichCo {
	        NHO, VUA, LON
	    }

	    // Lớp trừu tượng Cơ Sở Vật Chất
	    abstract static class CoSoVatChat {
	        protected String ma;
	        protected ChatLieu chatLieu;
	        protected KichCo kichCo;
	        protected String ten;
	        protected int donGia;

	        public CoSoVatChat(String ma, ChatLieu chatLieu, KichCo kichCo, String ten, int donGia) {
	            if (ma == null || ma.isEmpty()) {
	                throw new IllegalArgumentException("Mã không được để trống");
	            }
	            if (kichCo == null) {
	                throw new IllegalArgumentException("Kích cỡ không hợp lệ");
	            }
	            this.ma = ma;
	            this.chatLieu = chatLieu;
	            this.kichCo = kichCo;
	            this.ten = ten;
	            this.donGia = donGia;
	        }

	        public abstract double canNang();
	    }

	    // Lớp Bàn kế thừa từ CoSoVatChat
	    static class Ban extends CoSoVatChat {
	        private double doDai;
	        private double doRong;
	        private double doCao;
	        private int soChan;

	        public Ban(String ma, ChatLieu chatLieu, KichCo kichCo, String ten, int donGia,
	                   double doDai, double doRong, double doCao, int soChan) {
	            super(ma, chatLieu, kichCo, ten, donGia);
	            this.doDai = doDai;
	            this.doRong = doRong;
	            this.doCao = doCao;
	            this.soChan = soChan;
	        }

	        @Override
	        public double canNang() {
	            return soChan * 10 + doRong + doDai * 10;
	        }
	    }

	    // Lớp Ghế kế thừa từ CoSoVatChat
	    static class Ghe extends CoSoVatChat {
	        private boolean coTuaGhe;
	        private int soChan;

	        public Ghe(String ma, ChatLieu chatLieu, KichCo kichCo, String ten, int donGia,
	                   boolean coTuaGhe, int soChan) {
	            super(ma, chatLieu, kichCo, ten, donGia);
	            this.coTuaGhe = coTuaGhe;
	            this.soChan = soChan;
	        }

	        @Override
	        public double canNang() {
	            double nangQuaTuaGhe = coTuaGhe ? 2 : 0;
	            return soChan * 10 + nangQuaTuaGhe;
	        }
	    }

	    // Hàm main để chạy thử
	    public static void main(String[] args) {
	        Ban ban = new Ban("B001", ChatLieu.GO, KichCo.LON, "Bàn học", 500000,
	                          1.5, 0.8, 0.75, 4);
	        Ghe ghe = new Ghe("G001", ChatLieu.NHUA, KichCo.VUA, "Ghế nhựa", 300000,
	                          true, 4);

	        System.out.println("Cân nặng bàn: " + ban.canNang());
	        System.out.println("Cân nặng ghế: " + ghe.canNang());
	    }
	}

}
