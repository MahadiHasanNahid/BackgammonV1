package com.sust.backgammon;


/**
 *
 * @author Md Mahadi Hasan
 */

/**
 *  Driver program for backgammon program.
 */

public class BackgammonMain {
    
    public static void main(String[] args) {
	/* Start up a backgammon game using these two agents. */
	//	BackgammonAgent agent0 = new UserBackgammonAgent(0);
	BackgammonAgent agent0 = new UserBackgammonAgent(0);
	BackgammonAgent agent1 = new SimpleBackgammonAgent(1);

        BackgammonGame bg = new BackgammonGame(agent0,agent1,System.out);
        bg.playGame();
    }
}
