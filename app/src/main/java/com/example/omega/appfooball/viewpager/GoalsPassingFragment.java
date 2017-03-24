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

            items.add(new Team("Arsenal FC", 55,10,70, 80, R.drawable.arsenal_fc));
            items.add(new Team("Chelsea FC", 48,10,80, 80, R.drawable.chelsea_fc));
            items.add(new Team("Kiverpool FC", 45,10,60, 80, R.drawable.liverpool_fc));
            items.add(new Team("Manchester City", 32,10,10, 80, R.drawable.manchester_city));
            items.add(new Team("Manchester United", 22,10,60, 20, R.drawable.manchester_united));
            items.add(new Team("fulham_FC", 20,10,20, 80, R.drawable.fulham_fc));
            items.add(new Team("Leicester city", 18,10,45, 70, R.drawable.leicester_city));
            items.add(new Team("Stoke City", 18,10,45, 70, R.drawable.stoke_city));
            items.add(new Team("Tottenham Hotspur", 18,10,45, 70, R.drawable.tottenham_hotspur));
            items.add(new Team("Watford FC", 18,10,45, 70, R.drawable.watford_fc));
            items.add(new Team("West Bromwich Albion", 18,10,45, 70, R.drawable.west_bromwich_albion));
            items.add(new Team("West Ham United", 18,10,45, 70, R.drawable.west_ham_united));
            items.add(new Team("Wigan Athletic", 18,10,45, 70, R.drawable.wigan_athletic));





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


}
