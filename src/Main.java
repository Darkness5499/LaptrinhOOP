import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Quanly quanly = new Quanly();
        SinhVien sinhVien1 = new SinhVien("Đào Thị Huyến", "DT0310", "DT3B");
        SinhVien sinhvien2 = new SinhVien("Vũ Ngọc Điệp", "AT140310", "AT14C");
        quanly.themSV(sinhVien1);
        quanly.themSV(sinhvien2);
        quanly.allSV();
    }
}
