package Chapter7.TicTacToe;

import java.util.Arrays;

import static Chapter7.TicTacToe.GameState.EMPTY;
import static Chapter7.TicTacToe.GameState.O;

public class Board {
    private GameState gameState;
    private boolean alreadyPlayed;
    GameState [][] gameArray = new GameState[3][3];
    int j;
    int i;


    enum Status{
         WON,
         LOST,
         DRAW;

    }



    public Board() {
        for (GameState[] gameState : gameArray) {
            Arrays.fill(gameState, EMPTY);
        }
    }
//    public void setBoard() {
//        for ( i = 0; i < gameArray.length; i++){
//            for(j = 0; j < gameArray[i].length; j++)
////                gameArray[i][j] = EMPTY;
//
//        }

    public String setBoard() {
        StringBuilder display = new StringBuilder();
        for (GameState[] options : gameArray) {
            for (int j = 0; j < options.length; j++) {
                if (j != options.length - 1)
                    display.append(options[j]).append(" ");

                else
                    display.append(options[j]).append("\n");
            }

        }
        return display.toString();
    }




    public GameState getBoard(){
        return gameArray[i][j];
    }
    public void validateBoardSize(int size){
        if(size <1 || size> 9){
            throw new ArrayIndexOutOfBoundsException("must be between 1 and 9");
        }

    }
    public void setPlayer1(int size, GameState gameState){
        validateBoardSize(size);
        int row = (size - 1) /3;
        int column = (size - 1) % 3;
        checkThatPositionHasAlreadyBeenPlayed(size, gameArray[row][column]);
//        if(gameState.equals(EMPTY))
            gameArray[row][column] = GameState.X;
     }
     public GameState[][] getPlayer(){
        return gameArray;
     }

     public void setPlayer2(int size){
         validateBoardSize(size);
         int row = (size - 1)/3;
         int column = (size-1)%3;
         checkThatPositionHasAlreadyBeenPlayed(size,gameArray[row][column]);
         if(gameState.equals(EMPTY))
             gameArray[row][column] = O;
     }

    public void checkThatPositionHasAlreadyBeenPlayed(int size, GameState gameState){
    boolean alreadyPlayed = gameState.equals(GameState.X) || gameState.equals(O);
         if(alreadyPlayed)
    throw new IllegalArgumentException("Position already played");
    }

}
