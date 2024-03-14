package ex6.edu.ex6listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dsTinhThanhVN ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Hiển thị dữ liẹu list view
        //B1+ Cần có dữ liệu
        // từ đau có :từ cơ sở dữ liệu  (SQL , nossql ,xml)

        dsTinhThanhVN = new ArrayList<String>();
        //thêm dữ liệu ở đây ( Đúng ra ,ta phải đọc  từ một nguồn
        //Nhưng  ta hard -
        dsTinhThanhVN.add("Hà Nội");
        dsTinhThanhVN.add("HỒ CHÍ MINH");
        dsTinhThanhVN.add("ĐỒNG NAI");
        dsTinhThanhVN.add("NINH THUẬT");
        dsTinhThanhVN.add("Nha Trang");
        //B2  tạo danh sach adapter
        ArrayAdapter<String> adapterTinhThanh ;
        //3 THAM SỐ

        adapterTinhThanh = new ArrayAdapter<String>(this, android.R.layout.
                simple_expandable_list_item_1,
                dsTinhThanhVN);
     // B3.Gắn vào điều khiển hiển thị List View
        // 3.1  Tìm
        ListView lvTenTinhThanh = findViewById(R.id.lvDanhSanhTT);
        //3.2 Gắn
        lvTenTinhThanh.setAdapter(adapterTinhThanh);
        //3.3 .Lắng nghe và xử lí  sự kiện  user  tương tác
     lvTenTinhThanh.setOnItemClickListener(BoLangNghevaXL);

    }
    //Tạo bộ lắng nghe và xử li sự kiện OnItemClick ,đặt vào một biến
    //Gắn bộ lắng nghe vào
    AdapterView.OnItemClickListener BoLangNghevaXL = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick (AdapterView<?> adapterView ,View view ,int i,long l) {
               String  strTenTinhChon=     dsTinhThanhVN.get(i);
       // CODE  xu lis o day
            // i la vi tri phan tu vua duoc click
            // Vi du xu ly o day , là hiện lên màn hình một tháng  báo nhanh về vị trí  của phần tử vừa chọn
            //Lấy giá trị của phần tử thú i
            Toast.makeText(MainActivity.this, "Bạn vừa chọn ", Toast.LENGTH_SHORT).show();


        }
    };
}