package Game;

import ComputerLogic.TicTacToeStrategy;
import View.TicTacToe;

import java.util.Random;

public class GameManager {
    private Board gameBoard;
    private TicTacToeStrategy strategy;
    private final TicTacToe ticTacToeView;
    private boolean player;

    private final Random rnd = new Random();

    public GameManager(){
        ticTacToeView = new TicTacToe();

        //determines who starts
        player = rnd.nextBoolean();

        //sleeps for 2 sec in order to display the logo :)
        try {Thread.sleep(2000);} catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if(player){
            ticTacToeView.setText("Player starts");
            Coordinates coordinates = ticTacToeView.getInput();
        }

        else{ticTacToeView.setText("Computer starts");}

    }

    public void firstTurn(){}
}
