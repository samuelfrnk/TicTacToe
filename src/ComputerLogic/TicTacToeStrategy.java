package ComputerLogic;

import Game.Board;

public interface TicTacToeStrategy {
    /**
     This interface is crucial for implementing the Strategy DP.
     It enables a quick change between the computer's strategy.
     (e.g., from random guesses to minimax)
     **/
    public int getComputerMove(Board currentState);
}
