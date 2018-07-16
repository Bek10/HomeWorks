package com.company.entity;

public class Basketball extends GameWithBall {

    private int numberOfPeriods;
    private String bestLeague;
    private String bestPlayer;

    public int getNumberOfPeriods() {
        return numberOfPeriods;
    }

    public void setNumberOfPeriods(int numberOfPeriods) {
        this.numberOfPeriods = numberOfPeriods;
    }

    public String getBestLeague() {
        return bestLeague;
    }

    public void setBestLeague(String bestLeague) {
        this.bestLeague = bestLeague;
    }

    public String getBestPlayer() {
        return bestPlayer;
    }

    public void setBestPlayer(String bestPlayer) {
        this.bestPlayer = bestPlayer;
    }
}
