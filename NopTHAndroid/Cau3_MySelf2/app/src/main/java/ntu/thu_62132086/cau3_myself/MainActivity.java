package ntu.thu_62132086.cau3_myself;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize TextViews
        TextView textViewHometown = findViewById(R.id.textViewHometown);
        TextView textViewDOB = findViewById(R.id.textViewDOB);
        TextView textViewHobbies = findViewById(R.id.textViewHobbies);

        // Set student information
        textViewHometown.setText("Quê quán: (Điền thông tin quê quán)");
        textViewDOB.setText("Ngày sinh: (Điền thông tin ngày sinh)");
        textViewHobbies.setText("Sở thích: (Liệt kê các sở thích của bạn)");
    }
}
