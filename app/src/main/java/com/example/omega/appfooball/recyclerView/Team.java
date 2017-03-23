package com.example.omega.appfooball.recyclerView;

import com.example.omega.appfooball.R;

import java.util.ArrayList;

/**
 * Created by Omega on 22/3/2017.
 */
public class Team {

    private String nameTeam;
    private int goalsPassing;
    private int goalsConceded;
    private int goalsScored;
    private int pointTable;
    private int escudoTeam;

    public Team(String nameTeam, int goalsPassing, int goalsConceded, int goalsScored, int pointTable, int escudoTeam) {
        this.nameTeam = nameTeam;
        this.goalsPassing = goalsPassing;
        this.goalsConceded = goalsConceded;
        this.goalsScored = goalsScored;
        this.pointTable = pointTable;
        this.escudoTeam = escudoTeam;
    }

    public String getNameTeam() {
        return nameTeam;
    }

    public void setNameTeam(String nameTeam) {
        this.nameTeam = nameTeam;
    }

    public int getGoalsPassing() {
        return goalsPassing;
    }

    public void setGoalsPassing(int goalsPassing) {
        this.goalsPassing = goalsPassing;
    }

    public int getGoalsConceded() {
        return goalsConceded;
    }

    public void setGoalsConceded(int goalsConceded) {
        this.goalsConceded = goalsConceded;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public int getPointTable() {
        return pointTable;
    }

    public void setPointTable(int pointTable) {
        this.pointTable = pointTable;
    }

    public int getEscudoTeam() {
        return escudoTeam;
    }

    public void setEscudoTeam(int escudoTeam) {
        this.escudoTeam = escudoTeam;
    }


    public static final ArrayList<Team> teams = new ArrayList<>();

    static {
        teams.add(new Team("Barcelona FC", 50,10,60, 80, R.drawable.arrow_left_drop_circle_outline));
        teams.add(new Team("Atletico Madrid", 50,10,60, 80, R.drawable.arrow_left_drop_circle_outline));
        teams.add(new Team("Real Madrid", 50,10,60, 80, R.drawable.arrow_left_drop_circle_outline));
        teams.add(new Team("Rayo vallecano", 50,10,60, 80, R.drawable.arrow_left_drop_circle_outline));
        teams.add(new Team("Eibar", 50,10,60, 80, R.drawable.arrow_left_drop_circle_outline));
        teams.add(new Team("Levante", 50,10,60, 80, R.drawable.arrow_left_drop_circle_outline));
        teams.add(new Team("Valencia", 50,10,60, 80, R.drawable.arrow_left_drop_circle_outline));

    }


}
