package com.company.entity;

public class Football extends GameWithBall {

    private int numberOfTimes;
    private double averageGoalsPerGame;
    private double averageAttendanceOfMatches;

    public int getNumberOfTimes() {
        return numberOfTimes;
    }

    public void setNumberOfTimes(int numberOfTimes) {
        this.numberOfTimes = numberOfTimes;
    }

    public double getAverageGoalsPerGame() {
        return averageGoalsPerGame;
    }

    public void setAverageGoalsPerGame(double averageGoalsPerGame) {
        this.averageGoalsPerGame = averageGoalsPerGame;
    }

    public double getAverageAttendanceOfMatches() {
        return averageAttendanceOfMatches;
    }

    public void setAverageAttendanceOfMatches(double averageAttendanceOfMatches) {
        this.averageAttendanceOfMatches = averageAttendanceOfMatches;
    }
}
