package com.example.omega.appfooball.recyclerView;

import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.omega.appfooball.R;
import com.example.omega.appfooball.models.Team;

import java.util.List;

/**
 * Created by Omega on 26/3/2017.
 */

public class TeamAdapterConceded extends RecyclerView.Adapter<TeamAdapterConceded.TeamViewHolder>{

    private List<Team> items;



    public static class TeamViewHolder extends RecyclerView.ViewHolder {
        // Campos respectivos de un item
        public ImageView imagenEscudo;
        public TextView teamName;
        public TextView conceded;
        public TextView position;
        public CardView card_view;
        public LinearLayout linear_card;


        public TeamViewHolder(View v) {
            super(v);
            imagenEscudo = (ImageView) v.findViewById( R.id.ic_escudo);
            teamName = (TextView) v.findViewById(R.id.team_name);
            conceded = (TextView) v.findViewById(R.id.conceded);
            position = (TextView) v.findViewById(R.id.position);
            card_view= (CardView) v.findViewById(R.id.card_view);
            linear_card= (LinearLayout) v.findViewById(R.id.linear_card);

        }
    }

    public TeamAdapterConceded(List<Team> items) {
        this.items = items;
    }


    public TeamViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_list_team_conceded, parent, false);


        return new TeamViewHolder(v);

    }


    public void onBindViewHolder(TeamViewHolder holder, int position) {


        if(position%2==0) {
            holder.card_view.setCardBackgroundColor(Color.argb(255,56,56,56));

        } else
            holder.card_view.setCardBackgroundColor(Color.BLACK);


        holder.imagenEscudo.setImageResource(items.get(position).getEscudoTeam());
        holder.teamName.setText(String.valueOf(items.get(position).getNameTeam()));
        holder.conceded.setText(String.valueOf(items.get(position).getGoalsConceded()));
        holder.position.setText(String.valueOf((position)+1));


    }

    public int getItemCount() {
        return items.size();
    }


}
