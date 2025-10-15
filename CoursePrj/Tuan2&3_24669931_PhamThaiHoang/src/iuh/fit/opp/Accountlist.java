package iuh.fit.opp;

public class Accountlist {
    private Bai4_Bank[] acclist;
    private int count = 0;
    
    public Accountlist() {
        this(10);
    }
    

    public Accountlist(int capacity) {
        if(capacity <= 0) {
            capacity = 10;
        }
        this.acclist = new Bai4_Bank[capacity];
    }
    
    public Bai4_Bank add(Bai4_Bank account) {
        if(account == null) {
            return null;
        }

        for(int i = 0 ; i < count ; i++) {
            if(acclist[i].getNumberAccount() == account.getNumberAccount()) {
                System.out.println("Số tài khoản đã tồn tại.");
                return null;
            }
        }

        if(count < acclist.length) {
            acclist[count++] = account;
            return account;
        } else {
            System.out.println("Danh sách tài khoản đã đầy.");
            return null;
        }
    }

    public Bai4_Bank findByNumber(int number) {
        Bai4_Bank account = null;
        for(int i = 0 ; i < count ; i++) {
            if(acclist[i].getNumberAccount() == number) {
                account = acclist[i];
                break;
            }
        }
        return account;
    }

    public boolean deleteByNumber(int number) {
        for(int i = 0; i < count; i++) {
            if(acclist[i].getNumberAccount() == number) {
                for(int j = i; j < count - 1; j++) {
                    acclist[j] = acclist[j + 1];
                }
                acclist[--count] = null;
                System.out.println("Tài khoản đã được xóa.");
                return true;
            }
        }
        System.out.println("Không tìm thấy tài khoản để xóa.");
        return false;
    }

    public void printAllAccounts() {
        if(count == 0) {
            System.out.println("Danh sách tài khoản rỗng.");
            return;
        }
        for(int i = 0; i < count; i++) {
            System.out.println(acclist[i].toString());
        }
    }
    

    public int getAccountCount() {
        return count;
    }
}
