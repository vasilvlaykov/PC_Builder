package com.example.pcbuildervasvlay;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PcCaseEA extends RecyclerView.Adapter<PcCaseEA.PcCaseVH> {
    private List<PcCase> mExampleList;
    private static RecyclerViewClickListener listener;

    public static class PcCaseVH extends RecyclerView.ViewHolder  implements View.OnClickListener{
        public TextView modelName;
        public TextView modelPrice;


        public PcCaseVH(@NonNull View itemView) {
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

    public PcCaseEA(List<PcCase> exampleList, RecyclerViewClickListener listener) {
        this.mExampleList = exampleList;
        this.listener = listener;
    }

    @Override
    public PcCaseVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.example_pc_case, parent, false);
        PcCaseVH evh = new PcCaseVH(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull PcCaseVH holder, int position) {
        PcCase currentItem = mExampleList.get(position);

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
