package com.company.entity;

public class Tennis extends GameWithBall {

    private int numberOfSets;
    private int numberOfGrandSlams;
    private double averageBallSpeed;

    public int getNumberOfSets() {
        return numberOfSets;
    }

    public void setNumberOfSets(int numberOfSets) {
        this.numberOfSets = numberOfSets;
    }

    public int getNumberOfGrandSlams() {
        return numberOfGrandSlams;
    }

    public void setNumberOfGrandSlams(int numberOfGrandSlams) {
        this.numberOfGrandSlams = numberOfGrandSlams;
    }

    public double getAverageBallSpeed() {
        return averageBallSpeed;
    }

    public void setAverageBallSpeed(double averageBallSpeed) {
        this.averageBallSpeed = averageBallSpeed;
    }
}
