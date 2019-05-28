package com.johnny;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        // Add Players
        Team<BaseballPlayer> astros = new Team<>("astros");
        astros.addPlayer(new BaseballPlayer("Steve"));
        astros.addPlayer(new BaseballPlayer("John"));

        // Add Players
        Team<BaseballPlayer> yankees = new Team<>("yankees");
        yankees.addPlayer(new BaseballPlayer("Jeffrey"));
        yankees.addPlayer(new BaseballPlayer("Micheal"));

        Team<BaseballPlayer> cubs = new Team<>("cubs");
        cubs.addPlayer(new BaseballPlayer("pete"));


        Team<SoccerPlayer> manchester = new Team<>("manchester");
        manchester.addPlayer(new SoccerPlayer("messi"));


        // Match Results
        astros.matchResult(yankees, 8, 5);
        astros.matchResult(yankees, 8, 9);
        yankees.matchResult(astros, 5, 1);
        cubs.matchResult(yankees, 3, 2);
        cubs.matchResult(yankees, 2, 2);

        System.out.println("astros rank: " + astros.rankings());


        // compareTo() using interface Comparable<Team>
        System.out.println(astros.compareTo(yankees) + " comparison..");
        System.out.println(yankees.compareTo(astros) + " comparison..");


        // League ranking - sort
//        ArrayList<Team> league = new ArrayList<>();
//        league.add(astros);
//        league.add(yankees);
//        Collections.sort(league);
//        System.out.println("Best in the league: " + league.get(0).getName());

        League<Team<BaseballPlayer>> league = new League<>();
        System.out.println("\nPrinting league..");
        league.addTeam(yankees);
        league.addTeam(astros);
        league.addTeam(cubs);
        //league.addTeam(manchester);
        league.printLeague();

        league.sortTeams();
        league.printLeague();
    }
}
