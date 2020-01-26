package com.pvelychko.montyhall;

import com.pvelychko.montyhall.model.Game;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameTest {
    private Logger logger = LoggerFactory.getLogger(GameTest.class);

    @Test
    public void switchWinRateTwoThird() {
        System.out.println("This test method should be run");

        logger.info("switchWinRateShoudBeTwoThird started!");
        Game game = new Game(10000);
        game.play();

        System.out.println("fsafdsf");

        assertTrue(Math.abs(0.666666 - game.getSwitchWinsRate()) < 0.01);
        logger.info("switchWinRateShoudBeTwoThird ended.");
    }
}
