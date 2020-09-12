package com.elhady.expandrecyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;


import com.elhady.expandrecyclerview.R;
import com.elhady.expandrecyclerview.model.Expender;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ExpandAdapter extends RecyclerView.Adapter<ExpandAdapter.ExpandViewHolder> {
    List<Expender> expenderList;

    public ExpandAdapter(List<Expender> expenderList) {
        this.expenderList = expenderList;
    }

    @NonNull
    @Override
    public ExpandViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row, parent, false);
        return new ExpandViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ExpandViewHolder holder, int position) {
        Expender expender = expenderList.get(position);
        holder.codeNameTxt.setText(expender.getCodeName());
        holder.versionNameTxt.setText(expender.getVersion());
        holder.apiLevelNameTxt.setText(expender.getApiLevel());
        holder.descriptionNameTxt.setText(expender.getDescripion());

        boolean isExpandable = expenderList.get(position).isExpandable();
        holder.expandLayout.setVisibility(isExpandable ? View.VISIBLE : View.GONE);
    }

    @Override
    public int getItemCount() {
        return expenderList.size();
    }

    class ExpandViewHolder extends RecyclerView.ViewHolder {

        TextView codeNameTxt, versionNameTxt, apiLevelNameTxt, descriptionNameTxt;
        LinearLayout linearLayout;
        RelativeLayout expandLayout;

        public ExpandViewHolder(@NonNull View itemView) {
            super(itemView);

            codeNameTxt = itemView.findViewById(R.id.code_name);
            versionNameTxt = itemView.findViewById(R.id.versions);
            apiLevelNameTxt = itemView.findViewById(R.id.apl_level);
            descriptionNameTxt = itemView.findViewById(R.id.description);

            linearLayout = itemView.findViewById(R.id.linear_layout);
            expandLayout = itemView.findViewById(R.id.expandable_layout);

            //Handling expand on item
            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Expender expender = expenderList.get(getAdapterPosition());
                    expender.setExpandable(!expender.isExpandable());
                    notifyItemChanged(getAdapterPosition());
                }
            });
        }
    }

}
