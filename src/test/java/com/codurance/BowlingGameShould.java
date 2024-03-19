package com.codurance;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class BowlingGameShould {
    @ParameterizedTest(name = "{0} pin(s) in a single roll should score {0}")
    @ValueSource(ints = {0, 1, 2})
    public void
    score_a_single_roll(int pins) {
        BowlingGame bowlingGame = new BowlingGame();

        bowlingGame.roll(pins);

        assertEquals(pins, bowlingGame.score());
    }
}