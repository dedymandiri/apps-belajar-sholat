package com.example.belajarsholat.Adapter.latihanquiz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.belajarsholat.Model.latihanquiz.LatihanquizItem;
import com.example.belajarsholat.R;

import java.util.List;

public class LatihanAdapter extends RecyclerView.Adapter<LatihanAdapter.RecyclerViewAdapter>{

    private Context context;
    private List<LatihanquizItem> datas;
    private LatihanAdapter.ItemClickListener itemClickListener;


    public LatihanAdapter(Context context, List<LatihanquizItem> data, ItemClickListener itemClickListener) {
        this.context = context;
        this.datas = data;
        this.itemClickListener = itemClickListener;
    }


    @NonNull
    @Override
    public RecyclerViewAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate( R.layout.item_layout, parent, false);
        return new LatihanAdapter.RecyclerViewAdapter(view, itemClickListener);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter holder, int position) {
        LatihanquizItem datalaporan = datas.get(position);
        holder.kuis.setText(datalaporan.getSoal());
        holder.pilihanA.setText(datalaporan.getA());
        holder.pilihanB.setText(datalaporan.getB());
        holder.pilihanC.setText(datalaporan.getC());
    }

    @Override
    public int getItemCount() {

        return datas.size();
    }

    public class RecyclerViewAdapter extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView kuis;
        RadioButton pilihanA, pilihanB, pilihanC;
        CardView cardquiz;
        LatihanAdapter.ItemClickListener itemClickListener;


        public RecyclerViewAdapter(@NonNull View itemView, LatihanAdapter.ItemClickListener itemClickListener) {
            super( itemView );
            cardquiz = itemView.findViewById(R.id.cardquiz);
            kuis = itemView.findViewById(R.id.kuis);
            pilihanA = itemView.findViewById(R.id.pilihanA);
            pilihanB = itemView.findViewById(R.id.pilihanB);
            pilihanC = itemView.findViewById(R.id.pilihanC);

            this.itemClickListener = itemClickListener;
            cardquiz.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
//            itemClickListener.onItemClick(view,getAdapterPosition());
        }

    }
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }

}