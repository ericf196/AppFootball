package com.example.omega.appfooball.recyclerView;

import android.os.Build;

import com.example.omega.appfooball.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Omega on 22/3/2017.
 */
public class Team{

    private String nameTeam;
    private int goalsPassing;
    private int goalsConceded;
    private int goalsScored;
    private int pointTable;
    private int escudoTeam;
    private int partidosJugados;
    private int partidosGanados;
    private int partidosEmpatados;
    private int partidosPerdidos;

    ArrayList<Team> orderItems;

    public Team(){
        orderItems =cargarData();
    }

    public Team(String  nameTeam, int pointTable, int goalsScored, int goalsConceded,int escudoTeam , int goalsPassing, int partidosPerdidos, int partidosEmpatados, int partidosGanados, int partidosJugados) {
        this.partidosPerdidos = partidosPerdidos;
        this.partidosEmpatados = partidosEmpatados;
        this.partidosGanados = partidosGanados;
        this.partidosJugados = partidosJugados;
        this.escudoTeam = escudoTeam;
        this.pointTable = pointTable;
        this.goalsScored = goalsScored;
        this.goalsConceded = goalsConceded;
        this.goalsPassing = goalsPassing;
        this.nameTeam = nameTeam;
    }

    public int getPartidosPerdidos() {
        return partidosPerdidos;
    }

    public void setPartidosPerdidos(int partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }

    public int getPartidosEmpatados() {
        return partidosEmpatados;
    }

    public void setPartidosEmpatados(int partidosEmpatados) {
        this.partidosEmpatados = partidosEmpatados;
    }

    public int getPartidosGanados() {
        return partidosGanados;
    }

    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
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


    public ArrayList<Team> cargarData(){
        ArrayList<Team> items = new ArrayList<>();

        items.add(new Team("Arsenal FC", 50,20,39, R.drawable.arsenal_fc, 50,10,10,30,50));
        items.add(new Team("Chelsea FC", 60,15,58, R.drawable.chelsea_fc, 65,8,12,32,50));
        items.add(new Team("Liverpool FC", 55,12,60, R.drawable.liverpool_fc, 56,9,9,33,50));
        items.add(new Team("Manchester City", 54,9,53, R.drawable.manchester_city, 60,07,10,30,50));
        items.add(new Team("Manchester United", 68,10,58, R.drawable.manchester_united, 64,10,15,20,50));
        items.add(new Team("Fulham_FC", 25,33,35, R.drawable.fulham_fc, 40,15,8,25,50));
        items.add(new Team("Leicester city", 30,40,26, R.drawable.leicester_city, 42,16,9,22,50));
        items.add(new Team("Stoke City", 24,10,29, R.drawable.stoke_city, 38,9,19,33,50));
        items.add(new Team("Tottenham Hotspur", 26,25,38, R.drawable.tottenham_hotspur, 51,26,22,36,50));
        items.add(new Team("Watford FC", 32,36,28, R.drawable.watford_fc, 29,33,28,40,50));
        items.add(new Team("West Bromwich Albion", 40,22,39, R.drawable.west_bromwich_albion, 41,15,25,26,50));
        items.add(new Team("West Ham United", 33,28,38, R.drawable.west_ham_united, 30,27,28,15,50));
        items.add(new Team("Wigan Athletic sasdss ddd", 31,41,27, R.drawable.wigan_athletic, 22,29,20,10,50));


        return items;

    }


    public ArrayList<Team> positionTable(){



        Collections.sort(orderItems, new Comparator<Team>() {
            @Override
            public int compare(Team t1, Team t2)
            {

                return Integer.valueOf(t2.getPointTable()).compareTo(Integer.valueOf(t1.getPointTable()));
                //return  t1.getPointTable().compareTo(t2.getPointTable());
                //return (String.valueOf(fruit1.getPointTable())).compareTo(String.valueOf(fruit1.getPointTable()));
            }
        });
        return orderItems;

    }

    public ArrayList<Team> orderByGoalsPassing(){


        Collections.sort(orderItems, new Comparator<Team>() {
            @Override
            public int compare(Team t1, Team t2)
            {

                return Integer.valueOf(t2.getGoalsPassing()).compareTo(Integer.valueOf(t1.getGoalsPassing()));
                //return  t1.getPointTable().compareTo(t2.getPointTable());
                //return (String.valueOf(fruit1.getPointTable())).compareTo(String.valueOf(fruit1.getPointTable()));
            }
        });
        return orderItems;

    }


    public ArrayList<Team> orderByGoalsConceded(){

        ArrayList<Team> orderItems =cargarData();

        Collections.sort(orderItems, new Comparator<Team>() {
            @Override
            public int compare(Team t1, Team t2)
            {
                return Integer.valueOf(t2.getGoalsConceded()).compareTo(t1.getGoalsConceded());
            }
        });
        return orderItems;
    }


    public ArrayList<Team> orderByGoalsScored(){



        Collections.sort(orderItems, new Comparator<Team>() {
            @Override
            public int compare(Team t1, Team t2)
            {
                return Integer.valueOf(t2.getGoalsScored()).compareTo(t1.getGoalsScored());
            }
        });
        return orderItems;

    }
}
