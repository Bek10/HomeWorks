package com.company.entity;

public abstract class GameWithBall extends Sports {

    private int numberOfPlayers;
    private boolean isInBuilding;
    private double diameterOfBall;
    private double fieldWidth;
    private double fieldLength;

    public int getNumberOfPlayersOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int countOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public boolean isInBuilding() {
        return isInBuilding;
    }

    public void setInBuilding(boolean inBuilding) {
        isInBuilding = inBuilding;
    }

    public double getDiameterOfBall() {
        return diameterOfBall;
    }

    public void setDiameterOfBall(double diameterOfBall) {
        this.diameterOfBall = diameterOfBall;
    }

    public double getFieldWidth() {
        return fieldWidth;
    }

    public void setFieldWidth(double fieldWidth) {
        this.fieldWidth = fieldWidth;
    }

    public double getFieldLength() {
        return fieldLength;
    }

    public void setFieldLength(double fieldLength) {
        this.fieldLength = fieldLength;
    }
}
