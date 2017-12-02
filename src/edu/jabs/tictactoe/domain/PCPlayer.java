package edu.jabs.tictactoe.domain;

/**
 * the computer player in tic tac toe
 */
public class PCPlayer
{

    // -----------------------------------------------------------------
    // Atributes
    // -----------------------------------------------------------------
    /**
     * tic tac toe game that the computer player is playing
     */
    private TicTacToe ticTacToe;
    /**
     * Symbol assigned to the computer player
     */
    private String mySymbol;

    // -----------------------------------------------------------------
    // Constructors
    // -----------------------------------------------------------------

    /**
     * creates a new computer player for the current game going on and the symbol that was assigned to it <br>
     * <b>post: </b> the computer player is created <br>
     * @param ticTacToeGame particular instance of the ticTacToe game. ticTacToeGame != null.
     * @param symbol the symbol that the computer player will use. symbol != null y symbol != "".
     */
    public PCPlayer( TicTacToe ticTacToeGame, String symbol )
    {
        ticTacToe = ticTacToeGame;
        mySymbol = symbol;
    }

    // -----------------------------------------------------------------
    // Methods
    // -----------------------------------------------------------------

    /**
     * tries to make the pc player's next move "PC". <br>
     * <b>pre: </b> the object PCPlayer and the ticTacToe game must be initialized. <br>
     * <b>post: </b> the move is made, placing the PC player's symbol on the next available square position. <br>
     * @return true if the move was completed successfully, false otherwise.
     */
    public boolean play( )
    {

        int nextSquare = 0;
        boolean completed;

        if( ticTacToe.emptySquare( TicTacToe.UPPER_LEFT ) )
            nextSquare = TicTacToe.UPPER_LEFT;
        else if( ticTacToe.emptySquare( TicTacToe.UPPER_CENTER ) )
            nextSquare = TicTacToe.UPPER_CENTER;
        else if( ticTacToe.emptySquare( TicTacToe.UPPER_RIGHT ) )
            nextSquare = TicTacToe.UPPER_RIGHT;
        else if( ticTacToe.emptySquare( TicTacToe.MIDDLE_LEFT ) )
            nextSquare = TicTacToe.MIDDLE_LEFT;
        else if( ticTacToe.emptySquare( TicTacToe.MIDDLE_CENTER ) )
            nextSquare = TicTacToe.MIDDLE_CENTER;
        else if( ticTacToe.emptySquare( TicTacToe.MIDDLE_RIGHT ) )
            nextSquare = TicTacToe.MIDDLE_RIGHT;
        else if( ticTacToe.emptySquare( TicTacToe.BOTTOM_LEFT ) )
            nextSquare = TicTacToe.BOTTOM_LEFT;
        else if( ticTacToe.emptySquare( TicTacToe.BOTTOM_CENTER ) )
            nextSquare = TicTacToe.BOTTOM_CENTER;
        else if( ticTacToe.emptySquare( TicTacToe.BOTTOM_RIGHT ) )
            nextSquare = TicTacToe.BOTTOM_RIGHT;

        if( nextSquare == 0 )
        {
            completed = false;
        }
        else
        {
            ticTacToe.placeSymbolInSquare( nextSquare, mySymbol );
            completed = true;
        }

        return completed;
    }

}