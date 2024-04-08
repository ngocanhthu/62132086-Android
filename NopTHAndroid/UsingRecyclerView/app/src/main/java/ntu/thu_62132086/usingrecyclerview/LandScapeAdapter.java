package ntu.thu_62132086.usingrecyclerview;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

// KE THUA RECYCLERVIEW.ADAPTER
public class LandScapeAdapter  extends RecyclerView.Adapter<LandScapeAdapter.ItemLandHoder>
{    //khai bao
    Context context ;
    ArrayList <LandScape> lstDaTa;

    public LandScapeAdapter(Context context, ArrayList<LandScape> lstDaTa) {
        this.context = context;
        this.lstDaTa = lstDaTa;
    }


    @NonNull
    @Override
    public ItemLandHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemLandHoder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ItemLandHoder extends  RecyclerView.ViewHolder{
        // thuc hien ham khoi tao khai bao contruster
        TextView tvCaption;
        ImageView ivlandscape;

        public ItemLandHoder(@NonNull View itemView) {
            super(itemView);
            tvCaption =itemView.findViewById((R.id.textView));
             ivlandscape =itemView.findViewById(R.id.imageViewLand);
        }
    }
}
