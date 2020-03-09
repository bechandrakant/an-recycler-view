package com.ppstudios.recyclerviewdemo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ppstudios.recyclerviewdemo.R;
import com.ppstudios.recyclerviewdemo.models.RecipeModel;

import java.util.ArrayList;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.ViewHolder> {

    private ArrayList<RecipeModel> recipeModels;
    private Context context;

    public RecipeAdapter(ArrayList<RecipeModel> recipeModels, Context context) {
        this.recipeModels = recipeModels;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        RecipeModel model = recipeModels.get(position);

        holder.imageView.setImageResource(model.getImg());
        holder.textView.setText(model.getText());
    }

    @Override
    public int getItemCount() {
        return recipeModels.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
        }
    }
}
