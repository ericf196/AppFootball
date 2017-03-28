package com.example.omega.appfooball.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.omega.appfooball.R;
import com.example.omega.appfooball.recyclerView.Team;
import com.example.omega.appfooball.recyclerView.TeamAdapterPositionTable;
import com.example.omega.appfooball.recyclerView.TeamAdapterScored;

import java.util.ArrayList;


public class PositionTableFragment extends Fragment {

    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;


    public static PositionTableFragment newInstance(String param1, String param2) {
        PositionTableFragment fragment = new PositionTableFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v=inflater.inflate(R.layout.fragment_position_table, container, false);

        Team team=new Team();
        ArrayList<Team> items;
        items=team.cargarData();

// Obtener el Recycler
        recycler = (RecyclerView) v.findViewById(R.id.recycler_view_position_table);
        recycler.setHasFixedSize(true);


// Usar un administrador para LinearLayout
        lManager = new LinearLayoutManager(getActivity());
        recycler.setLayoutManager(lManager);

// Crear un nuevo adaptador
        adapter = new TeamAdapterPositionTable(items);
        recycler.setAdapter(adapter);
        return v;


    }

}
