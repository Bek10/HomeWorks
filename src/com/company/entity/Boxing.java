package com.company.entity;

public class Boxing extends MartialArts {

    private int numberOfRounds;
    private double ringSize;
    private double weightOfGloves;

    public int getNumberOfRounds() {
        return numberOfRounds;
    }

    public void setNumberOfRounds(int numberOfRounds) {
        this.numberOfRounds = numberOfRounds;
    }

    public double getRingSize() {
        return ringSize;
    }

    public void setRingSize(double ringSize) {
        this.ringSize = ringSize;
    }

    public double getWeightOfGloves() {
        return weightOfGloves;
    }

    public void setWeightOfGloves(double weightOfGloves) {
        this.weightOfGloves = weightOfGloves;
    }
}
