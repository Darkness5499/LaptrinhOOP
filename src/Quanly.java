import java.util.ArrayList;
import java.util.List;

public class Quanly {
    public ArrayList<SinhVien> listSinhVien = new ArrayList<>();

    public void themSV(SinhVien sinhVien){
        System.out.println("Đã thêm sinh viên" + sinhVien.ten);
        listSinhVien.add(sinhVien);
    }
    public void allSV(){
        System.out.println("Danh sach sinh vien");
        //muốn đọc danh sách các sinh viên, thì em phải đọc LẦN LƯỢT từng sinh viên trong danh sách
        //để đọc LẦN LƯỢT --> em phải lặp lần lượt các phần từ trong danh sách
        //lặp từ sinh viên đầu tiên -->sinh viên cuối trong danh sách (độ dài của danh sách)
        // danh sách có 10 sinh viên thì sinh viên cuối cùng là 10
        // với mỗi lần lặp đấy, em sẽ đọc thông tin của sinh viên đó
        for(int i = 0; i < listSinhVien.size(); i++){
            //đây là bước đọc thông tin của sinh viên
            listSinhVien.get(i).thongtin();


        }
    }
}
