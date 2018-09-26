package ru.geekbrains.android3_4.ui;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import ru.geekbrains.android3_4.R;
import ru.geekbrains.android3_4.mvp.model.entity.Repos;

public class ReposAdapter extends RecyclerView.Adapter<ReposAdapter.MyViewHolder> {

  private ArrayList<Repos> repos;

  public ReposAdapter(ArrayList<Repos> repos) {
    this.repos = repos;
  }

  @Override public ReposAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext())
        .inflate(R.layout.item_view, parent, false);

    return new ReposAdapter.MyViewHolder(view);
  }

  @Override public void onBindViewHolder(ReposAdapter.MyViewHolder holder, int position) {
    holder.itemView.setText(repos.get(position).getName());
  }

  @Override public int getItemCount() {
    return repos.size();
  }

  public static class MyViewHolder extends RecyclerView.ViewHolder {

    private TextView itemView;

    public MyViewHolder(View v) {
      super(v);
      itemView = v.findViewById(R.id.item_text_view);
    }
  }
}
