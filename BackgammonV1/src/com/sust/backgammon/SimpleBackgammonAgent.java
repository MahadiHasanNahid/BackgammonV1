package com.sust.backgammon;

/**
 *
 * @author Md Mahadi Hasan
 */

/* A backgammon agent that just takes the first possible move.
 * Actually is not too bad an agent, if it is the right player number.
 */
public class SimpleBackgammonAgent extends BackgammonAgent {
    public SimpleBackgammonAgent(int my_player_num) {
	super(my_player_num);
    }
	
    @Override
    public Move chooseMove(BackgammonBoard b) {
	MoveSet ms = b.getValidMoves(player_num);
	return ms.getMove(0);
    }
}
