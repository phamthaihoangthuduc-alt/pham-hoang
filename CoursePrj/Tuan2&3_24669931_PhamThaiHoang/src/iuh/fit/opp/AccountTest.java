package iuh.fit.opp;

public class AccountTest {
    public static void main(String[] args) {
        Accountlist accountList = new Accountlist();

        Bai4_Bank acc1 = new Bai4_Bank(120, "pham thai hoang", 100e3);
        Bai4_Bank acc2 = new Bai4_Bank(130, "ngo kien huy", 170e3);
        Bai4_Bank acc3 = new Bai4_Bank(140, "tran thi thanh thao", 300e3);
        Bai4_Bank acc4 = new Bai4_Bank(150, "trinh tran phuong tuan", 70e3);
        Bai4_Bank acc5 = new Bai4_Bank(160, "doraemon", 80e3);

        acc1.setStatus(AccountStatus.ACTIVE);
        acc2.setStatus(AccountStatus.ACTIVE);
        acc3.setStatus(AccountStatus.ACTIVE);
        acc4.setStatus(AccountStatus.ACTIVE);
        acc5.setStatus(AccountStatus.ACTIVE);

        accountList.add(acc1);
        accountList.add(acc2);
        accountList.add(acc3);
        accountList.add(acc4);
        accountList.add(acc5);

        String headerline = String.format("|%5s|%25s|%15s|%20s|%20s",
                "No", "name", "balance", "status", "note");
        System.out.println(headerline);
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);
        System.out.println(acc4);
        System.out.println(acc5);

        System.out.println("\nDanh sách tài khoản:");
        accountList.printAllAccounts();

        System.out.println("\nTìm tài khoản với số tài khoản :");
        Bai4_Bank foundAccount = accountList.findByNumber(120);
        if (foundAccount != null) {
            System.out.println(foundAccount.toString());
        } else {
            System.out.println("Không tìm thấy tài khoản.");
        }

        System.out.println("\nXóa tài khoản với số tài khoản :");
        accountList.deleteByNumber(160);

        System.out.println("\nDanh sách tài khoản sau khi xóa:");
        accountList.printAllAccounts();

        System.out.println("\nThêm tài khoản với số tài khoản :");
        Bai4_Bank duplicateAccount = new Bai4_Bank(107, "Nguyen D", 400000);
        Bai4_Bank result = accountList.add(duplicateAccount);
        if (result == null) {
            System.out.println("Không thể thêm tài khoản vì số tài khoản đã tồn tại.");
        } else {
            System.out.println("Thêm tài khoản thành công: " + result.toString());
        }

        
    }
    
}