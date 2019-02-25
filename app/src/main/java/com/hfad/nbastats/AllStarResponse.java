package com.hfad.nbastats;

import java.util.List;

public class AllStarResponse
{
    private String player;
    private List<AllStar> results;

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public List<AllStar> getResults() {
        return results;
    }

    public void setResults(List<AllStar> results) {
        this.results = results;
    }
}
