package com.company.entity;

public abstract class MartialArts extends Sports {

    private int numberOfFighters;
    private boolean isFullContact;

    public int getNumberOfFighters() {
        return numberOfFighters;
    }

    public void setNumberOfFighters(int numberOfFighters) {
        this.numberOfFighters = numberOfFighters;
    }

    public boolean isFullContact() {
        return isFullContact;
    }

    public void setFullContact(boolean fullContact) {
        isFullContact = fullContact;
    }
}
