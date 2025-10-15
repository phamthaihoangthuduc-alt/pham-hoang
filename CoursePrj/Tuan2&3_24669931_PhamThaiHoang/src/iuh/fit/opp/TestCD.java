package iuh.fit.opp;

import java.util.Scanner;

public class TestCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng tối đa CD: ");
        int n = sc.nextInt();
        sc.nextLine();

        CDList ds = new CDList(n);
        int chon;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm CD");
            System.out.println("2. Hiển thị danh sách CD");
            System.out.println("3. Số lượng CD hiện có");
            System.out.println("4. Tổng giá thành");
            System.out.println("5. Sắp xếp giảm theo giá");
            System.out.println("6. Sắp xếp tăng theo tựa");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    System.out.print("Nhập mã CD: ");
                    int ma = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhập tên CD: ");
                    String ten = sc.nextLine();
                    System.out.print("Nhập số bài hát: ");
                    int soBai = sc.nextInt();
                    System.out.print("Nhập giá thành: ");
                    float gia = sc.nextFloat();

                    CD cd = new CD(ma, ten, soBai, gia);
                    ds.themCD(cd);
                    break;
                case 2:
                    ds.xuatDanhSach();
                    break;
                case 3:
                    System.out.println("Số lượng CD: " + ds.getSoLuongCD());
                    break;
                case 4:
                    System.out.println("Tổng giá thành: " + ds.tongGiaThanh());
                    break;
                case 5:
                    ds.sapXepGiamTheoGia();
                    System.out.println("Đã sắp xếp giảm dần theo giá.");
                    break;
                case 6:
                    ds.sapXepTangTheoTua();
                    System.out.println("Đã sắp xếp tăng dần theo tựa.");
                    break;
                case 0:
                    System.out.println("Kết thúc chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (chon != 0);
    }
}
