package ex6.edu.listview_ads;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText edtThongTin;
    ListView lvTen;
    ArrayList<String> dsTen;
    ArrayAdapter<String> bo_nguon;
    void getControls(){
        edtThongTin = findViewById(R.id.edtThongTin);
        lvTen = findViewById(R.id.lvTen);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getControls();
        dsTen = new ArrayList<String>();
        dsTen.add("Ánh Tuyết");
        dsTen.add("Kungfu Panda");
        dsTen.add("Alipapa");
        dsTen.add("Jack Sparow");
        bo_nguon = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                dsTen);
        lvTen.setAdapter(bo_nguon);
        lvTen.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                edtThongTin.setText("        Bạn chọn "+ dsTen.get(i));
            }
        });
    }
    public void ThemPhanTu(){
        EditText edtNhapTen = findViewById(R.id.edtNhapTen);
        String tenNhap = edtNhapTen.getText().toString();
        dsTen.add(tenNhap);
        bo_nguon.notifyDataSetChanged();
    }

}