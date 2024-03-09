package ex4.edu.ex4_addsybmuldiv_onclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong, nutTru, nutNhan, nutChia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Tinh();
    }
    void Tinh(){
        editTextSo1 = findViewById(R.id.edtTextSo1);
        editTextSo2 = findViewById(R.id.edtSo2);
        editTextKQ = findViewById(R.id.edtKQ);
        nutCong = findViewById(R.id.btnCong);
        nutTru = findViewById(R.id.btnTru);
        nutNhan = findViewById(R.id.btnNhan);
        nutChia = findViewById(R.id.btnChia);
    }
    public void Cong(View v){
        String So1 = editTextSo1.getText().toString();
        String So2 = editTextSo2.getText().toString();
        float so1 = Float.parseFloat(So1);
        float so2 = Float.parseFloat(So2);
        float tong = so1 + so2;
        String KQ = String.valueOf(tong);
        editTextKQ.setText(KQ);
    }
    public void Tru(View v){
        String So1 = editTextSo1.getText().toString();
        String So2 = editTextSo2.getText().toString();
        float so1 = Float.parseFloat(So1);
        float so2 = Float.parseFloat(So2);
        float tong = so1 - so2;
        String KQ = String.valueOf(tong);
        editTextKQ.setText(KQ);
    }
    public void Nhan(View v){
        String So1 = editTextSo1.getText().toString();
        String So2 = editTextSo2.getText().toString();
        float so1 = Float.parseFloat(So1);
        float so2 = Float.parseFloat(So2);
        float tong = so1 * so2;
        String KQ = String.valueOf(tong);
        editTextKQ.setText(KQ);
    }
    public void Chia(View v){
        String So1 = editTextSo1.getText().toString();
        String So2 = editTextSo2.getText().toString();
        float so1 = Float.parseFloat(So1);
        float so2 = Float.parseFloat(So2);
        float tong = so1 / so2;
        String KQ = String.valueOf(tong);
        editTextKQ.setText(KQ);
    }
}