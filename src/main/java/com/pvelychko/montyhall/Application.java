package com.pvelychko.montyhall;

import com.pvelychko.montyhall.model.Game;

public class Application {
	private static final int DEFAULT_AMOUNT_OF_ROUNDS = 10_000;

	public static void main(String[] args) {
		int amountOfRounds = DEFAULT_AMOUNT_OF_ROUNDS;
		if (args.length == 1) {
			try {
				amountOfRounds = Integer.parseUnsignedInt(args[0]);
			} catch (NumberFormatException e) {
				System.out.println("Warning, invalid amount of rounds! Using the default values.");
			}
		} else {
			System.out.println("No arguments provided, using the default amount of rounds!");
		}

		playGames(amountOfRounds);
	}

	private static void playGames(int amountOfRounds) {
		Game game = new Game(amountOfRounds);
		game.play();

		System.out.println("\n************************************************");
		System.out.println("Monty Hall (Let's make a deal!) game statistics:\n");
		System.out.println("Games played: " + amountOfRounds);
		System.out.println("Switch box win: " + game.getSwitchWinsRate());
		System.out.println("Stay box win: " + game.getStayWinsRate());
		System.out.println("************************************************\n");
	}
}
