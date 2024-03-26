package ntu.thu_62132086.cau4_banthan;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Khởi tạo TextViews
        TextView textViewName = findViewById(R.id.textViewName);
        TextView textViewDepartment = findViewById(R.id.textViewDepartment);
        TextView textViewHobbies = findViewById(R.id.textViewHobbies);

        // Thiết lập thông tin cá nhân
        textViewName.setText("Tên: Nguyễn Ngọc Anh Thư");
        textViewDepartment.setText("Khoa: Công Nghệ Thông Tin");
        textViewHobbies.setText("Sở thích: Hát");
    }
}