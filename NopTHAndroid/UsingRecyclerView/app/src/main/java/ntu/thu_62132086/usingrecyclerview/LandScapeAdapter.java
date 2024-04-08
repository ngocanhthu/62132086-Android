package ntu.thu_62132086.usingrecyclerview;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

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
        LayoutInflater cai_bom= LayoutInflater.from(context);
        View vItern = cai_bom.inflate(R.layout.itern_land,parent,false);
         ItemLandHoder hoderCreated =new ItemLandHoder(vItern) ;

        return hoderCreated;

    }
      // BUOC 3
    @Override
    public void onBindViewHolder(@NonNull ItemLandHoder holder, int position) {
   // lay doi tuong  hien thi
        LandScape landScapeHienthi = lstDaTa.get(position);
        // trich thong tin
        String caption = landScapeHienthi.getLandCation();
        String tenfileAnh = landScapeHienthi.getLandImageFileName();
        holder.tvCaption.setText(caption);
        // dat anh
        String packageName = holder.itemView.getContext().getPackageName();
        //lay id cho anh  thong qua ten
        //nbo anh trong file mip map
        int imageid = holder.itemView.getResources().getIdentifier(tenfileAnh,"mipmap",packageName);
        holder.ivlandscape.setImageResource(imageid);


    }

    @Override
    public int getItemCount() {
        return lstDaTa.size() ;
        // dem phan tu co bao nhiu

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
