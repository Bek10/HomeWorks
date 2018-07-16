package com.company.entity;

public class MixedMartialArts extends MartialArts {

    private int numberOfRounds;
    private String bestFighter;
    private double sizeOfOctagon;

    public int getNumberOfRounds() {
        return numberOfRounds;
    }

    public void setNumberOfRounds(int numberOfRounds) {
        this.numberOfRounds = numberOfRounds;
    }

    public String getBestFighter() {
        return bestFighter;
    }

    public void setBestFighter(String bestFighter) {
        this.bestFighter = bestFighter;
    }

    public double getSizeOfOctagon() {
        return sizeOfOctagon;
    }

    public void setSizeOfOctagon(double sizeOfOctagon) {
        this.sizeOfOctagon = sizeOfOctagon;
    }
}
