package com.example.beehyr;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class product_adapter extends RecyclerView.Adapter<product_adapter.productviewholder> {
    private Context Cmtx;
    private List<product> productList;

    public product_adapter(Context cmtx, List<product> productList) {
        Cmtx = cmtx;
        this.productList = productList;
    }

    @Override
    public productviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =LayoutInflater.from(Cmtx);
        View view =inflater.inflate(R.layout.card_jobs,null);
        return new productviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull productviewholder holder, int position) {
    product product=productList.get(position);
    holder.im.setImageDrawable(Cmtx.getResources().getDrawable(product.getIm()));
    holder.t1.setText(product.getText1());
    holder.t2.setText(product.getText2());
    holder.t3.setText(product.getText3());
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class productviewholder extends RecyclerView.ViewHolder {
        ImageView im;
        TextView t1,t2,t3;
        Button b1;
        public productviewholder(@NonNull View itemView) {
            super(itemView);
            im=itemView.findViewById(R.id.tag);
            t1=itemView.findViewById(R.id.t1);
            t2=itemView.findViewById(R.id.t2);
            t3=itemView.findViewById(R.id.t3);
            b1=itemView.findViewById(R.id.b1_apply);

        }
    }
}
