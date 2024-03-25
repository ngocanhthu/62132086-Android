package ntu.thu_62132086.cau3_myself;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText etHeight;
    private EditText etWeight;
    private TextView tvBMI;
    private Button btnCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etHeight = findViewById(R.id.et_height);
        etWeight = findViewById(R.id.et_weight);
        tvBMI = findViewById(R.id.tv_bmi);
        btnCalculate = findViewById(R.id.btn_calculate);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lấy giá trị chiều cao và cân nặng
                String heightStr = etHeight.getText().toString();
                String weightStr = etWeight.getText().toString();

                // Chuyển đổi sang kiểu float
                float height = Float.parseFloat(heightStr);
                float weight = Float.parseFloat(weightStr);

                // Tính toán BMI
                float bmi = weight / (height * height);

                // Hiển thị kết quả
                tvBMI.setText("BMI: " + String.format("%.2f", bmi));
            }
        });
    }
}