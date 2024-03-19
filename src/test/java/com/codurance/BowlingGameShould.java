package com.codurance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BowlingGameShould {

    @Test
    public void
    score_0_for_0_pins_rolled() {
        BowlingGame bowlingGame = new BowlingGame();

        int pins = 0;
        bowlingGame.roll(pins);

        assertEquals(0, bowlingGame.score());
    }

}