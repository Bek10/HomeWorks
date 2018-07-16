package com.company.entity;

public class Wrestling extends MartialArts {

    private String typeOfWrestling;
    private int pointToWin;
    private int grappleDuration;

    public String getTypeOfWrestling() {
        return typeOfWrestling;
    }

    public void setTypeOfWrestling(String typeOfWrestling) {
        this.typeOfWrestling = typeOfWrestling;
    }

    public int getPointToWin() {
        return pointToWin;
    }

    public void setPointToWin(int pointToWin) {
        this.pointToWin = pointToWin;
    }

    public int getGrappleDuration() {
        return grappleDuration;
    }

    public void setGrappleDuration(int grappleDuration) {
        this.grappleDuration = grappleDuration;
    }
}
