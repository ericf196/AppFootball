package com.example.omega.appfooball.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.omega.appfooball.R;
import com.example.omega.appfooball.models.Match;
import com.example.omega.appfooball.models.Team;
import com.example.omega.appfooball.recyclerView.TeamAdapterConceded;
import com.example.omega.appfooball.recyclerView.TeamAdapterScoresFixtures;

import java.util.ArrayList;


public class ScoresFixturesFragment extends Fragment {

    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    // TODO: Rename and change types and number of parameters
    public static ScoresFixturesFragment newInstance() {
        ScoresFixturesFragment fragment = new ScoresFixturesFragment();
       /* Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);*/
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
        View v = inflater.inflate(R.layout.fragment_scored_fixtures, container, false);

        Match match=new Match();
        ArrayList<Match> matchs;
        matchs=match.cargarData();

        // Obtener el Recycler
        recycler = (RecyclerView) v.findViewById(R.id.recycler_view_score_fixture);
        recycler.setHasFixedSize(true);


        // Usar un administrador para LinearLayout
        lManager = new LinearLayoutManager(getActivity());
        recycler.setLayoutManager(lManager);

        // Crear un nuevo adaptador
        adapter = new TeamAdapterScoresFixtures(matchs);
        recycler.setAdapter(adapter);

        return v;
    }

}
