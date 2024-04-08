package thu.edu.helloandroid;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) final EditText NumberC = findViewById(R.id.editC);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) final EditText NumberF = findViewById(R.id.editF);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button C = findViewById(R.id.CtoF);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button F = findViewById(R.id.FtoC);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button clear = findViewById(R.id.clear);
        C.setOnClickListener(v -> {
            double f = Double.parseDouble(NumberC.getText().toString());
            Double c = (f*9)/5+32;
            NumberF.setText(String.valueOf(c));
        });
        F.setOnClickListener(v -> {
            double c = Double.parseDouble(NumberF.getText().toString());
            Double f = (c-32)*5/9;
            NumberC.setText(String.valueOf(f));
            NumberC.setText("");
        });
        clear.setOnClickListener(view -> NumberF.setText(""));
    }
}