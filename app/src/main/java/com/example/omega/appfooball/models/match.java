package com.example.omega.appfooball.models;

import com.example.omega.appfooball.R;

import java.util.ArrayList;

/**
 * Created by Omega on 29/3/2017.
 */

public class Match {


    private Team teamHome;
    private Team teamGuest;

    public Match() {
    }

    public Match(Team teamHome, Team teamGuest) {
        this.teamHome = teamHome;
        this.teamGuest = teamGuest;
    }

    public Team getTeamHome() {
        return teamHome;
    }

    public void setTeamHome(Team teamHome) {
        this.teamHome = teamHome;
    }

    public Team getTeamGuest() {
        return teamGuest;
    }

    public void setTeamGuest(Team teamGuest) {
        this.teamGuest = teamGuest;
    }


    public ArrayList<Match> cargarData(){
        ArrayList<Match> matchs = new ArrayList<>();


        matchs.add(new Match(new Team("Arsenal FC", 50,20,39, R.drawable.arsenal_fc, 50,10,10,30,50),new Team("West Bromwich Albion", 40,22,39, R.drawable.west_bromwich_albion, 41,15,25,26,50)));
        matchs.add(new Match(new Team("Wigan Athletic sasdss ddd", 31,41,27, R.drawable.wigan_athletic, 22,29,20,10,50),new Team("Fulham_FC", 25,33,35, R.drawable.fulham_fc, 40,15,8,25,50)));
        matchs.add(new Match(new Team("Liverpool FC", 55,12,60, R.drawable.liverpool_fc, 56,9,9,33,50),new Team("Manchester City", 54,9,53, R.drawable.manchester_city, 60,7,10,30,50)));


        return matchs;
    }

}
