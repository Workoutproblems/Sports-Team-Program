package com.johnny;

import java.util.ArrayList;
                                    // Comparable with Teams of SAME sport.
public class Team<T extends Player> implements Comparable<Team<T>> {

    private int wins  = 0;
    private int loses = 0;
    private int ties  = 0;
    private String name;

    ArrayList<T> members = new ArrayList<>();

    public void matchResult(Team<T> opponent, int our_score, int their_score) {

        if (our_score > their_score) {
            wins++;
        } else if (our_score < their_score) {
            loses++;
        } else if (our_score == their_score) {
            ties++;
        }
        if (opponent != null) {
            opponent.matchResult(null, their_score, our_score);
        }
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.rankings() > team.rankings()) {
            return -1;
        } else if (this.rankings() < team.rankings()) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean addPlayer(T player) {

        if (!members.contains(player)){
            members.add(player);
            System.out.println(this.name + " signed new player " + player.getName());
            return true;
        }
        else {
            return false;
        }
    }

    public Team(String name) {
        this.name = name;
    }

    public int rankings(){
        return (this.wins * 2) + ties;
    }

    public String getName() {
        return name;
    }
}
