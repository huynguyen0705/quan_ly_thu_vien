import java.util.ArrayList;

public class QuanLyThuVien {
    ArrayList<SinhVien> DsSinhVien;
    public QuanLyThuVien(){
        DsSinhVien = new ArrayList<>();
    }
    public void ThemSinhVien(String hoTen, int namSinh, int tuoi, String maLop, String maPhieuMuon, String ngayMuon, String hanTra, String maSach){
        SinhVien sinhVien = new SinhVien(hoTen, namSinh, tuoi, maLop, maPhieuMuon, ngayMuon, hanTra, maSach);
        DsSinhVien.add(sinhVien);
        System.out.println("thêm thành công");
        for (int i = 0; i < DsSinhVien.size(); i++) {
            DsSinhVien.get(i).HienThiSinhVien();
        }
    }
}
