import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isRunning = true;
        while (isRunning){
            try {
                System.out.println("QUẢN LÝ THƯ VIỆN");
                System.out.println("1. Nhập/Hiển thị sinh viên mượn sách");
                System.out.println("2. thoát");
                System.out.println("Mời chọn: ");
                QuanLyThuVien quanLyThuVien = new QuanLyThuVien();
                Scanner scanner = new Scanner(System.in);
                int input = scanner.nextInt();
                if (input <1 || input > 2){
                    System.out.println("chọn sai");
                }
                switch (input){
                    case 1:
                        System.out.println("NHẬP THÔNG TIN SINH VIÊN MƯỢN SÁCH");
                        System.out.println("Nhập họ tên:");
                        Scanner scanner1 = new Scanner(System.in);
                        String hoTen = scanner1.next();
                        System.out.println("Nhập năm sinh: ");
                        Scanner scanner2 = new Scanner(System.in);
                        int namSinh = scanner2.nextInt();
                        System.out.println("Nhập tuổi: ");
                        Scanner scanner3 = new Scanner(System.in);
                        int tuoi = scanner3.nextInt();
                        System.out.println("Nhập mã lớp học: ");
                        Scanner scanner4 = new Scanner(System.in);
                        String maLop = scanner4.next();
                        System.out.println("Nhập mã phiếu mượn: ");
                        Scanner scanner5 = new Scanner(System.in);
                        String maPhieuMuon = scanner5.next();
                        System.out.println("Nhap ngày mượn (dd/mm/yy): ");
                        Scanner scanner6 = new Scanner(System.in);
                        String ngayMuon = scanner6.next();
                        System.out.println("Nhập hạn trả (dd/mm/yy): ");
                        Scanner scanner7 = new Scanner(System.in);
                        String hanTra = scanner7.next();
                        System.out.println("Nhập mã sách: ");
                        Scanner scanner8 = new Scanner(System.in);
                        String maSach = scanner8.next();
                        quanLyThuVien.ThemSinhVien(hoTen,namSinh,tuoi,maLop,maPhieuMuon,ngayMuon,hanTra,maSach);
                        break;
                    case 2:
                        isRunning = false;
                }

            }catch (InputMismatchException e){
                System.out.println("nhập sai kiểu");
            }
        }
    }
}