package nangcao.edu.lv_nangcao;

import androidx.appcompat.app.AppCompatActivity;

import android.database.MatrixCursor;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import nangcao.edu.lv_nangcao.adapters.CountryAdapter;
import nangcao.edu.lv_nangcao.models.Country;

public class MainActivity<Country> extends AppCompatActivity {
    ArrayList<Country> dsQG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //b1
        dsQG= new ArrayList<Country>();
        MatrixCursor.RowBuilder dsQG1;
        dsQG1.add(new Country("VietNam", 90,"vn" ));
        dsQG1.add(new Country("Russia", 110,"ru" ));
        dsQG1.add(new Country("United State", 80,"us" ));

        ListView listView = findViewById(R.id.lvQG);
        CountryAdapter adapter = new CountryAdapter(this, dsQG);
        listView.setAdapter(adapter);
    }
}