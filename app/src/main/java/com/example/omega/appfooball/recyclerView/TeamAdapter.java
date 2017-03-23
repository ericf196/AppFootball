package com.example.omega.appfooball.recyclerView;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.omega.appfooball.R;

import java.util.List;

/**
 * Created by Omega on 23/3/2017.
 */

public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.TeamViewHolder>{

    private List<Team> items;

    public static class TeamViewHolder extends RecyclerView.ViewHolder {
        // Campos respectivos de un item
        public ImageView imagen;
        public TextView pases;
        public TextView scored;

        public TeamViewHolder(View v) {
            super(v);
            imagen = (ImageView) v.findViewById( R.id.ic_escudo);
            pases = (TextView) v.findViewById(R.id.pases);
            scored = (TextView) v.findViewById(R.id.scored);
        }
    }




    public TeamAdapter(List<Team> items) {
        this.items = items;
    }

    @Override
    public TeamViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_list_team, parent, false);
        return new TeamViewHolder(v);
    }

    @Override
    public void onBindViewHolder(TeamViewHolder holder, int position) {
        holder.imagen.setImageResource(items.get(position).getEscudoTeam());
        holder.pases.setText(String.valueOf(items.get(position).getGoalsPassing()));
        holder.scored.setText(String.valueOf(items.get(position).getGoalsScored()));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }


}
