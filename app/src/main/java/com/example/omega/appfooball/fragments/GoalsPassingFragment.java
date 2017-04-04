package com.example.omega.appfooball.fragments;

import android.os.Bundle;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;

import com.example.omega.appfooball.R;
import com.example.omega.appfooball.models.Team;
import com.example.omega.appfooball.recyclerView.TeamAdapterPassing;

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

        Team team=new Team();
         ArrayList<Team> items;
        items=team.orderByGoalsPassing();

// Obtener el Recycler
        recycler = (RecyclerView) v.findViewById(R.id.recycler_view_passing);
        recycler.setHasFixedSize(true);


// Usar un administrador para LinearLayout
        lManager = new LinearLayoutManager(getActivity());
        recycler.setLayoutManager(lManager);


// Crear un nuevo adaptador
        adapter = new TeamAdapterPassing(items);
        recycler.setAdapter(adapter);




        //rv.setAdapter(new AdapterRecycler(getTeam(),getActivity()));
        return v;
    }


}
