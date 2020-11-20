package com.example.pcbuildervasvlay;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CpuEA extends RecyclerView.Adapter<CpuEA.CpuVH> {
    private List<CPU> mExampleList;
    private static RecyclerViewClickListener listener;

    public static class CpuVH extends RecyclerView.ViewHolder  implements View.OnClickListener{
        public TextView modelName;
        public TextView modelPrice;


        public CpuVH(@NonNull View itemView) {
            super(itemView);
            modelName = itemView.findViewById(R.id.textCPUPrice);
            modelPrice = itemView.findViewById(R.id.textPrice1);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            listener.onClick(view, getAdapterPosition(), modelName.getText().toString(), modelPrice.getText().toString());
        }
    }

    public CpuEA(List<CPU> exampleList, RecyclerViewClickListener listener) {
        this.mExampleList = exampleList;
        this.listener = listener;
    }

    @Override
    public CpuVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.example_cpu, parent, false);
        CpuVH evh = new CpuVH(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull CpuVH holder, int position) {
        CPU currentItem = mExampleList.get(position);

        holder.modelName.setText(currentItem.getName());
        holder.modelPrice.setText(Integer.valueOf(currentItem.getPrice()).toString());
    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }

    public interface RecyclerViewClickListener {
        void onClick(View v, int position, String name, String price);
    }

}
