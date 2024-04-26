package ntu.thu_62132086.bottomnavigation_recylerview;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AlgorithmFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AlgorithmFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recyclerViewDatas;
    RecyclerView recyclerViewLandScape;
    public AlgorithmFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AlgorithmFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AlgorithmFragment newInstance(String param1, String param2) {
        AlgorithmFragment fragmenet = new AlgorithmFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        Fragment fragment = null;
        fragment.setArguments(args);
        return fragmenet;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    ArrayList<LandScape> getDataForRecyclerView(){

        ArrayList<LandScape> dsDuLieu = new ArrayList<LandScape>();
        LandScape landScape1 = new LandScape("Zenitsu");
        dsDuLieu.add(landScape1);
        dsDuLieu.add(new LandScape("zen", "Zenitsu"));
        dsDuLieu.add(new LandScape("ino", "Inosuke"));
        dsDuLieu.add(new LandScape("mui", "Muichiro"));
        return dsDuLieu;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_algoithm, container, false);
    }
}