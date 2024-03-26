package ntu.thu_62132086.cau2_temperature_conversion;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText NumberC = findViewById(R.id.editC);
        final EditText NumberF = findViewById(R.id.editF);
        Button C = findViewById(R.id.CtoF);
        Button F = findViewById(R.id.FtoC);
        Button clear = findViewById(R.id.clear);
        C.setOnClickListener(v -> {
            double f = Double.parseDouble(NumberC.getText().toString());
            Double c = (f*9)/5+32;
            NumberF.setText(String.valueOf(c));
        });
        F.setOnClickListener(v -> {
            double c = Double.parseDouble(NumberF.getText().toString());
            Double f = (c-32)*5/9;
            NumberC.setText(String.valueOf(f));
        });
        clear.setOnClickListener(view -> {
            NumberF.setText("");
            NumberC.setText("");
        });
    }
}
