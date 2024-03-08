package cong.edu.ex2application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Đay là bộ lắng nghe xử lí sự kiện tính tổng
    public void XuLyCong(View view)
    {
        //tim tham chieu den dieu khien tren tep  Xml
        findViewById(R.id.edtA);
        //Co cai bien de cat
        EditText editTextSoA = findViewById(R.id.edtA);
        EditText editTextSoB = findViewById(R.id.edtB);
        EditText editTextKetQua = findViewById(R.id.edtKQ);
        // Lấy dữ liệu về
        String strA = editTextSoA.getText().toString();
        String strB = editTextSoB.getText().toString();


        //Chuyển dữ liệu sang số
        int so_A = Integer.parseInt(strA);
        int so_B =Integer.parseInt(strB) ;

        //Tính toán theo yêu cầu
       int tong = so_A +so_B ;

        //Hiện ra màn hình

        String strtong = String.valueOf(tong);
        editTextKetQua.setText(tong);
    }
}