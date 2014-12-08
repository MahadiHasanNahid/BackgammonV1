package com.sust.backgammon;


/**
 *
 * @author Md Mahadi Hasan
 */

public class ExpectiminimaxBackgammonAgent extends BackgammonAgent {
    private Evaluation evaluation;

    public ExpectiminimaxBackgammonAgent(int my_player_num) {
	super(my_player_num);
	evaluation = new NaiveEvaluation();
    }

    public ExpectiminimaxBackgammonAgent(int my_player_num, Evaluation e) {
	super(my_player_num);
	evaluation = e;
    }

    @Override
    public Move chooseMove(BackgammonBoard b) {
	/* Fill in this code. */
	return null;
    }
}