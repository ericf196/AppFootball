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
 * Created by Omega on 26/3/2017.
 */

public class TeamAdapterScored extends RecyclerView.Adapter<TeamAdapterScored.TeamViewHolder> {

    private List<Team> items;

    public static class TeamViewHolder extends RecyclerView.ViewHolder {
        // Campos respectivos de un item
        public ImageView imagenEscudo;
        public TextView teamName;
        public TextView scored;
        public TextView position;

        public TeamViewHolder(View v) {
            super(v);
            imagenEscudo = (ImageView) v.findViewById( R.id.ic_escudo);
            teamName = (TextView) v.findViewById(R.id.team_name);
            scored = (TextView) v.findViewById(R.id.scored);
            position = (TextView) v.findViewById(R.id.position);
        }
    }

    public TeamAdapterScored(List<Team> items) {
        this.items = items;
    }

    public TeamViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_list_team_scored, parent, false);

        return new TeamAdapterScored.TeamViewHolder(v);
    }

    public void onBindViewHolder(TeamAdapterScored.TeamViewHolder holder, int position) {
        holder.imagenEscudo.setImageResource(items.get(position).getEscudoTeam());
        holder.teamName.setText(String.valueOf(items.get(position).getNameTeam()));
        holder.scored.setText(String.valueOf(items.get(position).getGoalsScored()));
        holder.position.setText(String.valueOf((position)+1));

    }

    public int getItemCount() {
        return items.size();
    }

}
