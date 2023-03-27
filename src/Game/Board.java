package Game;

public class Board {

    /**
     This Class is responsible for the internal data representation of
     the tictactoe game
     **/

    /*
    initialize game-board with following indices follows:
    (0,0) | (0,1) | (0,2)
    ------+-------+------
    (1,0) | (1,1) | (1,2)
    ------+-------+------
    (2,0) | (2,1) | (2,2)
     */
    private char[][] gameBoard = new char[3][3];

    public void setXMove(int x, int y){gameBoard[x][y] = 'c';}
    public void setOMove(int x, int y){gameBoard[x][y] = 'o';}
    public boolean winCheck(){return true;}

}
