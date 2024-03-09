package ex5.edu.ex5_addsubmudiv_onclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editTEXTSo1;
    EditText editTEXTSo2;
    EditText editTEXTKQ;
    Button nutCong, nutTru, nutNhan, nutChia;
    void TimDieuKhien(){
        editTEXTSo1 = (EditText) findViewById(R.id.edtTextSo1);
        editTEXTSo2 = (EditText) findViewById(R.id.edtTextSo2);
        editTEXTKQ = (EditText) findViewById(R.id.edtKQ);
        nutCong=(Button) findViewById(R.id.btnCong);
        nutTru=(Button) findViewById(R.id.btnTru);
        nutNhan=(Button) findViewById(R.id.btnNhan);
        nutChia=(Button) findViewById(R.id.btnChia);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        setContentView(R.layout.activity_main);
        //Gắn bộ lắng nghe sự kiện  và code xử lí cho từng nut
        View.OnClickListener boLangNgheCong =new View.OnClickListener() {
            @Override
            public void onClick(View v) {
          //Gọi hàm xử lí cộgn
                XuLi_Cong();


            }
        };
        nutCong.setOnClickListener(boLangNgheCong);
        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Xu li tru ở đay
                XuLi_Tru();
            }
        });
        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLi_Nhan();
            }
        });
        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              XuLi_Chia();
            }
        });

    }
    void XuLi_Cong(){
        // Lấy dữ liệu
        String so1 = editTEXTSo1.getText().toString();
        String so2 = editTEXTSo2.getText().toString();
        float num1 = Float.parseFloat(so1);
        float num2 = Float.parseFloat(so2);
        float tong = num1 + num2 ;

    }
    void XuLi_Tru(){
        String so1 = editTEXTSo1.getText().toString();
        String so2 = editTEXTSo2.getText().toString();
        float num1 = Float.parseFloat(so1);
        float num2 = Float.parseFloat(so2);
        float tong = num1 - num2 ;
    }
    void XuLi_Nhan(){
        String so1 = editTEXTSo1.getText().toString();
        String so2 = editTEXTSo2.getText().toString();
        float num1 = Float.parseFloat(so1);
        float num2 = Float.parseFloat(so2);
        float tong = num1 * num2 ;
    }
    void XuLi_Chia(){
        String so1 = editTEXTSo1.getText().toString();
        String so2 = editTEXTSo2.getText().toString();
        float num1 = Float.parseFloat(so1);
        float num2 = Float.parseFloat(so2);
        float tong = num1  / num2 ;
    }
}