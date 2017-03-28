package com.example.omega.appfooball.recyclerView;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.omega.appfooball.R;

import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by Omega on 27/3/2017.
 */

public class TeamAdapterPositionTable extends RecyclerView.Adapter<TeamAdapterPositionTable.TeamViewHolder>{

    private List<Team> items;

public static class TeamViewHolder extends RecyclerView.ViewHolder {
    // Campos respectivos de un item
    public ImageView imagenEscudo;
    public TextView teamName;
    public TextView position;
    public TextView table_pj;
    public TextView table_g;
    public TextView table_e;
    public TextView table_p;
    public TextView table_pts;

    public TeamViewHolder(View v) {
        super(v);
        imagenEscudo = (ImageView) v.findViewById(R.id.ic_escudo);
        teamName = (TextView) v.findViewById(R.id.team_name);
        position = (TextView) v.findViewById(R.id.position);

        table_pj = (TextView) v.findViewById(R.id.table_pj);
        table_g = (TextView) v.findViewById(R.id.table_g);
        table_e = (TextView) v.findViewById(R.id.table_e);
        table_p = (TextView) v.findViewById(R.id.table_p);
        table_pts = (TextView) v.findViewById(R.id.table_pts);
    }

}

    public TeamAdapterPositionTable(List<Team> items) {
        this.items = items;
    }


    public TeamViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_list_team_position, parent, false);

        return new TeamAdapterPositionTable.TeamViewHolder(v);
    }


    public void onBindViewHolder(TeamViewHolder holder, int position) {
        holder.imagenEscudo.setImageResource(items.get(position).getEscudoTeam());
        holder.teamName.setText(String.valueOf(items.get(position).getNameTeam()));
        holder.position.setText(String.valueOf((position) + 1));

        holder.table_pj.setText(String.valueOf(items.get(position).getPartidosJugados()));
        holder.table_g.setText(String.valueOf(items.get(position).getPartidosGanados()));
        holder.table_e.setText(String.valueOf(items.get(position).getPartidosEmpatados()));
        holder.table_p.setText(String.valueOf(items.get(position).getPartidosPerdidos()));
        holder.table_pts.setText(String.valueOf(items.get(position).getPointTable()));


    }


    public int getItemCount() {
        return items.size();
    }


}