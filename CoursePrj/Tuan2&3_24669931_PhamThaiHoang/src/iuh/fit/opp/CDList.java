package iuh.fit.opp;

public class CDList {
    private CD[] list;
    private int count;

    public CDList(int capacity) {
        list = new CD[capacity];
        count = 0;
    }

    public boolean themCD(CD cd) {
        if (count >= list.length) {
            System.out.println("Danh sách đã đầy!");
            return false;
        }
        for (int i = 0; i < count; i++) {
            if (list[i].getMaCD() == cd.getMaCD()) {
                System.out.println("Trùng mã CD!");
                return false;
            }
        }

        list[count] = cd;
        count++;
        return true;
    }

    public int getSoLuongCD() {
        return count;
    }

    public double tongGiaThanh() {
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += list[i].getGiaThanh();
        }
        return sum;
    }

    public void sapXepGiamTheoGia() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (list[i].getGiaThanh() < list[j].getGiaThanh()) {
                    CD temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }

    public void sapXepTangTheoTua() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (list[i].getTenCD().compareToIgnoreCase(list[j].getTenCD()) > 0) {
                    CD temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }

    public void xuatDanhSach() {
        if (count == 0) {
            System.out.println("Danh sách rỗng!");
            return;
        }
        System.out.println("|   Mã CD   |     Tên CD     |  Số bài  |   Giá thành   |");
        for (int i = 0; i < count; i++) {
            System.out.println(list[i]);
        }
    }
}
