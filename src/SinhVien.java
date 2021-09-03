
public class SinhVien {
    public String ten;
    public String maSV;
    public String tenlop;

    public SinhVien(String ten, String maSV, String tenlop) {
        this.ten = ten;
        this.maSV = maSV;
        this.tenlop = tenlop;
    }

    public void thongtin(){
        System.out.println("Thong tin" + ten +" "+ maSV +" "+ tenlop);
    }

}
