package ntu.thu_62132086.bottomnavi;




import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);

        // Mặc định hiển thị Fragment Algorithm khi Activity được tạo
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new AlgorithmFragment()).commit();
    }

    // Sự kiện lắng nghe khi người dùng chọn mục trong BottomNavigationView
    private final BottomNavigationView.OnNavigationItemSelectedListener navListener =
            item -> {
                Fragment selectedFragment = null;
                // Xác định Fragment tương ứng với mục được chọn
                switch (item.getItemId()) {
                    case R.id.algorithm:
                        selectedFragment = new AlgorithmFragment();
                        break;
                    case R.id.course:
                        selectedFragment = new CourseFragment();
                        break;
                    case R.id.profile:
                        selectedFragment = new ProfileFragment();
                        break;
                }
                // Thay thế Fragment hiện tại bằng Fragment được chọn
                if (selectedFragment != null) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                }
                return true;
            };
}