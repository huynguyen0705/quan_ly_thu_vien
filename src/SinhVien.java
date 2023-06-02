public class SinhVien extends TheMuon {
    private String HoTen;
    private int NamSinh;
    private int Tuoi;
    private String MaLop;

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int namSinh) {
        NamSinh = namSinh;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int tuoi) {
        Tuoi = tuoi;
    }

    public String getMaLop() {
        return MaLop;
    }

    public void setMaLop(String maLop) {
        MaLop = maLop;
    }
    public SinhVien(String hoTen, int namSinh, int tuoi, String maLop, String maPhieuMuon, String ngayMuon, String hanTra, String maSach){
        setHoTen(hoTen);
        setNamSinh(namSinh);
        setTuoi(tuoi);
        setMaLop(maLop);
        setMaPhieuMuon(maPhieuMuon);
        setNgayMuon(ngayMuon);
        setHanTra(hanTra);
        setMaSach(maSach);
    }
    public void HienThiSinhVien(){
        System.out.println("Họ tên: "+getHoTen());
        System.out.println("Năm sinh: "+getNamSinh());
        System.out.println("Tuổi: "+getTuoi());
        System.out.println("Mã lớp: "+getMaLop());
        System.out.println("Mã phiếu mượn: "+getMaPhieuMuon());
        System.out.println("Ngày mượn: "+getNgayMuon());
        System.out.println("Hạn trả: "+getHanTra());
        System.out.println("Mã sách: "+getMaSach());
    }
}
