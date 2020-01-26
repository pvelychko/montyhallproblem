package com.pvelychko.montyhall.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.SplittableRandom;

public class Game {

    private Logger logger = LoggerFactory.getLogger(Game.class);
    private static final int AMOUNT_OF_BOXES = 3;
    private static SplittableRandom RANDOM = new SplittableRandom();

    private int prizeBox;
    private int chosenBox;
    private final int amountOfRounds;
    private int amountOfSwitchWins;
    private int amountOfStayWins;

    public Game(int amountOfRounds) {
        this.amountOfRounds = amountOfRounds;
    }

    public void play() {
        for (int i = 0; i < amountOfRounds; i++) {
            logger.debug("New game started!");

            initializeBoxes();
            openBoxesAndDecide(chosenBox);

            logger.debug("End of the game.\n");
        }
    }

    private void initializeBoxes() {
        logger.debug("Boxes initialization started!");

        prizeBox = RANDOM.nextInt(AMOUNT_OF_BOXES) + 1;
        logger.debug("Prize box: {}", prizeBox);

        chosenBox = RANDOM.nextInt(AMOUNT_OF_BOXES) + 1;
        logger.debug("Selected box: {}", chosenBox);

        logger.debug("Boxes initialization ended.");
    }

    private void openBoxesAndDecide(int chosenBox) {
        logger.debug("Opening of the empty boxes started!");

        if (prizeBox == chosenBox) {
            logger.debug("Stay player won!");
            amountOfStayWins++;
        } else {
            logger.debug("Switch player won!");
            amountOfSwitchWins++;
        }

        logger.debug("Opening of the empty boxes ended.");
    }



    public float getSwitchWinsRate() {
        return (float) amountOfSwitchWins / amountOfRounds;
    }

    public float getStayWinsRate() {
        return (float) amountOfStayWins / amountOfRounds;
    }
}
