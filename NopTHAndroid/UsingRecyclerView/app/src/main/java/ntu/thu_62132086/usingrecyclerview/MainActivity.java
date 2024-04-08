package ntu.thu_62132086.usingrecyclerview;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import kotlin.jvm.internal.Lambda;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recylerData;
    RecyclerView recyclerViewLandScape;

    protected void onCreat(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);
        recylerData = getDataForRecyclerView();
        // tim dieu khien tao lay out to contruster
        recyclerViewLandScape = findViewById(R.id.recyclerland);
        //5
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
    }

    //tra ve danh sach ;anscape
    ArrayList<LandScape> getDataForRecyclerView() {
        ArrayList<LandScape> dsDuLieu = new ArrayList<LandScape>();
        LandScape landScap1 = new LandScape("anhxa", "ANH SIEU XE");
        // ap vao trong danh sach
        dsDuLieu.add(landScap1);
        dsDuLieu.add(new LandScape("duthuyen", "ANH DU THUYEN"));
        dsDuLieu.add(new LandScape("laptop1", "ANH lap top"));
        return dsDuLieu;
    }

}

