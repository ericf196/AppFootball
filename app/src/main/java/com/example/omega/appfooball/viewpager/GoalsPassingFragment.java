package com.example.omega.appfooball.viewpager;

import android.os.Bundle;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;

import com.example.omega.appfooball.R;
import com.example.omega.appfooball.recyclerView.Team;
import com.example.omega.appfooball.recyclerView.TeamAdapter;

import java.util.ArrayList;



public class GoalsPassingFragment extends Fragment {

    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    public static GoalsPassingFragment newInstance() {
        GoalsPassingFragment fragment = new GoalsPassingFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =inflater.inflate(R.layout.fragment_goals_passing, container, false);

         ArrayList<Team> items = new ArrayList<>();

            items.add(new Team("Barcelona FC", 50,10,60, 80, R.drawable.arrow_left_drop_circle_outline));
            items.add(new Team("Atletico Madrid", 50,10,60, 80, R.drawable.arrow_left_drop_circle_outline));
            items.add(new Team("Real Madrid", 50,10,60, 80, R.drawable.arrow_left_drop_circle_outline));
            items.add(new Team("Rayo vallecano", 50,10,60, 80, R.drawable.arrow_left_drop_circle_outline));
            items.add(new Team("Eibar", 50,10,60, 80, R.drawable.arrow_left_drop_circle_outline));
            items.add(new Team("Levante", 50,10,60, 80, R.drawable.arrow_left_drop_circle_outline));
            items.add(new Team("Valencia", 50,10,60, 80, R.drawable.arrow_left_drop_circle_outline));



// Obtener el Recycler
        recycler = (RecyclerView) v.findViewById(R.id.recycler_view_passing);
        recycler.setHasFixedSize(true);


// Usar un administrador para LinearLayout
        lManager = new LinearLayoutManager(getActivity());
        recycler.setLayoutManager(lManager);


// Crear un nuevo adaptador
        adapter = new TeamAdapter(items);
        recycler.setAdapter(adapter);

        //rv.setAdapter(new AdapterRecycler(getTeam(),getActivity()));
        return v;
    }


    private ArrayList<Team> getTeam(){
        ArrayList<Team> teams= new ArrayList<>();
        Team team= new Team("Barcelona", 22, 30, 15, 30, R.drawable.arrow_left_drop_circle_outline);
        teams.add(team);

        team= new Team("Real Madrid", 22, 30, 15, 30, R.drawable.arrow_left_drop_circle_outline);
        teams.add(team);

        team= new Team("Atletico Madrid", 22, 30, 15, 30, R.drawable.arrow_left_drop_circle_outline);
        teams.add(team);

        return teams;
    }

}
