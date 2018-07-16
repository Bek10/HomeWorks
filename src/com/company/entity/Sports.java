package com.company.entity;

public abstract class Sports {

    private String typeOfSports;
    private String name;
    private boolean isOlympicType;
    private int duration;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfSports() {
        return typeOfSports;
    }

    public void setTypeOfSports(String typeOfSports) {
        this.typeOfSports = typeOfSports;
    }

    public boolean getOlympicType() {
        return isOlympicType;
    }

    public void setOlympicType(boolean olympicType) {
        isOlympicType = olympicType;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}

