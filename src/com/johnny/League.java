package com.johnny;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team>  {

    ArrayList<T> league = new ArrayList<>();

    public void addTeam(T team) {
        if (!league.contains(team)) {
            league.add(team);
        } else {
            System.out.println("couldn't add team");
        }
    }
    // sort works b/c Team has compareTo()
    public void sortTeams(){

        Collections.sort(league);
    }
    public void printLeague() {

        for (T t: league) {

            System.out.println("\t" + t + " " + t.getName() + " rank: " + t.rankings());
        }
    }
}
