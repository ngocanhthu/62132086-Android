package ntu.thu_62132086.bottomnavi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class ProfileFragment extends Fragment {
    //hai hằng số ARG_PARAM1 và ARG_PARAM2 là các khóa cho các đối số được truyền vào Fragment. mparam1 và mparam2 là các biến thành viên để lưu trữ giá trị của các đối số này.
    private  static final  String ARG_PARAM1=  "param1";
    private static final String ARG_PARAM2 = "param2";
    private  String mparam1;
    private  String mparam2;
    public void CourseFragment (){

    }
    // Phương thức này tạo một phiên bản mới của ProfileFragment với các tham số đã chỉ định. Nó thiết lập các đối số cho fragment bằng một Bundle.
    public static CourseFragment newInstance(String param1, String param2) {
        CourseFragment fragment = new CourseFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
    //Phương thức này được gọi khi fragment đang được tạo. Nó lấy các đối số được truyền vào fragment và gán chúng cho các biến thành viên.
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mparam1 = getArguments().getString(ARG_PARAM1);
            mparam2 = getArguments().getString(ARG_PARAM2);
        }
    }
 //Phương thức này tạo và trả về giao diện cho fragment. Nó inflate một layout từ một tập tin XML (fragment_profile.xml) và trả về View gốc của layout.
 //Phương thức này tạo và trả về giao diện cho fragment. Nó inflate một layout từ một tập tin XML (fragment_profile.xml) và trả về View gốc của layout.
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

}
