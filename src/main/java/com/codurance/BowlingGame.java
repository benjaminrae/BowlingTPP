package com.codurance;

public class BowlingGame {

    private int totalScore = 0;

    public void roll(int pins) {
        totalScore += pins;
    }

    public int score() {
        return totalScore;
    }
}
