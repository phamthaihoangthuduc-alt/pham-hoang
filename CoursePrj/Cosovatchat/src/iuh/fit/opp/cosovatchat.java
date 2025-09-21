package iuh.fit.opp;

public class cosovatchat {
	// Enum cho chất liệu
	enum ChatLieu {
	    GO, NHUA, KIMLOAI
	}

	// Enum cho kích cỡ
	enum KichCo {
	    NHO, VUA, LON
	}

	// Lớp trừu tượng Cơ sở vật chất
	abstract class CoSoVatChat {
	    private String ma;
	    private ChatLieu chatLieu;
	    private KichCo kichCo;
	    private int soChan;

	    public CoSoVatChat(String ma, ChatLieu chatLieu, KichCo kichCo, int soChan) {
	        setMa(ma);
	        setChatLieu(chatLieu);
	        setKichCo(kichCo);
	        setSoChan(soChan);
	    }

	    public String getMa() {
	        return ma;
	    }

	    public void setMa(String ma) {
	        if (ma == null || ma.trim().isEmpty()) {
	            throw new IllegalArgumentException("Mã không được rỗng.");
	        }
	        this.ma = ma;
	    }

	    public ChatLieu getChatLieu() {
	        return chatLieu;
	    }

	    public void setChatLieu(ChatLieu chatLieu) {
	        if (chatLieu == null) {
	            throw new IllegalArgumentException("Chất liệu không hợp lệ.");
	        }
	        this.chatLieu = chatLieu;
	    }

	    public KichCo getKichCo() {
	        return kichCo;
	    }

	    public void setKichCo(KichCo kichCo) {
	        if (kichCo == null) {
	            throw new IllegalArgumentException("Kích cỡ không hợp lệ.");
	        }
	        this.kichCo = kichCo;
	    }

	    public int getSoChan() {
	        return soChan;
	    }

	    public void setSoChan(int soChan) {
	        if (soChan <= 0) {
	            throw new IllegalArgumentException("Số chân phải là số nguyên dương.");
	        }
	        this.soChan = soChan;
	    }

	    public abstract double canNang();
	}

	// Lớp Bàn kế thừa Cơ sở vật chất
	class Ban extends CoSoVatChat {
	    private double doDai;
	    private double doRong;

	    public Ban(String ma, ChatLieu chatLieu, KichCo kichCo, int soChan, double doDai, double doRong) {
	        super(ma, chatLieu, kichCo, soChan);
	        setDoDai(doDai);
	        setDoRong(doRong);
	    }

	    public double getDoDai() {
	        return doDai;
	    }

	    public void setDoDai(double doDai) {
	        if (doDai <= 0) {
	            throw new IllegalArgumentException("Độ dài phải lớn hơn 0.");
	        }
	        this.doDai = doDai;
	    }

	    public double getDoRong() {
	        return doRong;
	    }

	    public void setDoRong(double doRong) {
	        if (doRong <= 0) {
	            throw new IllegalArgumentException("Độ rộng phải lớn hơn 0.");
	        }
	        this.doRong = doRong;
	    }

	    @Override
	    public double canNang() {
	        return doDai * doRong * 10 + getSoChan() * 10;
	    }
	}

	// Lớp Ghế kế thừa Cơ sở vật chất
	class Ghe extends CoSoVatChat {
	    private boolean coTuaGhe;

	    public Ghe(String ma, ChatLieu chatLieu, KichCo kichCo, int soChan, boolean coTuaGhe) {
	        super(ma, chatLieu, kichCo, soChan);
	        this.coTuaGhe = coTuaGhe;
	    }

	    public boolean isCoTuaGhe() {
	        return coTuaGhe;
	    }

	    public void setCoTuaGhe(boolean coTuaGhe) {
	        this.coTuaGhe = coTuaGhe;
	    }

	    @Override
	    public double canNang() {
	        return getSoChan() * 10 + (coTuaGhe ? 20 : 0);
	    }
	}
}
