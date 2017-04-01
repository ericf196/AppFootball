package com.example.omega.appfooball.recyclerView;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.omega.appfooball.R;
import com.example.omega.appfooball.models.Match;
import com.example.omega.appfooball.models.Team;

import java.util.List;

/**
 * Created by Omega on 29/3/2017.
 */

public class TeamAdapterScoresFixtures extends RecyclerView.Adapter<TeamAdapterScoresFixtures.TeamViewHolder>{

    private List<Match> items;


    public static class TeamViewHolder extends RecyclerView.ViewHolder {
        // Campos respectivos de un item
        public ImageView imageTeamHome;
        public ImageView imageTeamGuest;
        public TextView nameTeamHome;
        public TextView nameTeamGuest;
        public TextView vsResult;

        public TeamViewHolder(View v) {
            super(v);
            imageTeamGuest = (ImageView) v.findViewById( R.id.image_team_guest);
            imageTeamHome = (ImageView) v.findViewById( R.id.image_team_home);
            nameTeamHome = (TextView) v.findViewById(R.id.name_home_team);
            nameTeamGuest = (TextView) v.findViewById(R.id.name_guest_team);
            //vsResult = (TextView) v.findViewById(R.id.vs_result);


        }
    }

    public TeamAdapterScoresFixtures(List<Match> items) {
        this.items = items;
    }



    @Override
    public TeamViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_list_scores_fixtures, parent, false);


        return new TeamViewHolder(v);


    }

    @Override
    public void onBindViewHolder(TeamViewHolder holder, int position) {

        holder.imageTeamGuest.setImageResource(items.get(position).getTeamGuest().getEscudoTeam());
        holder.imageTeamHome.setImageResource(items.get(position).getTeamHome().getEscudoTeam());
        holder.nameTeamGuest.setText(String.valueOf(items.get(position).getTeamGuest().getNameTeam()));
        holder.nameTeamHome.setText(String.valueOf(items.get(position).getTeamHome().getNameTeam()));
        //holder.vsResult.setText();


    }

    @Override
    public int getItemCount() {
        return items.size();
    }


}
