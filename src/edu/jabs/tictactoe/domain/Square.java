package edu.jabs.tictactoe.domain;

/**
 * Tic Tac Toe' Square
 */
public class Square
{

    // -----------------------------------------------------------------
    // Constants
    // -----------------------------------------------------------------

    /**
     * String that represents an empty square
     */
    final public static String EMPTY_SQUARE = "";

    // -----------------------------------------------------------------
    // Attributes
    // -----------------------------------------------------------------

    /**
     * Symbol that indicates which player occupied the square
     */
    private String symbol;

    // -----------------------------------------------------------------
    // Constructor Method
    // -----------------------------------------------------------------
    /**
     * Creates an empty square
     */
    public Square( )
    {
        symbol = EMPTY_SQUARE;
    }

    // -----------------------------------------------------------------
    // Methods
    // -----------------------------------------------------------------

    /**
     * indicates that the square has been occupied by the player using his symbol <br>
     * <b>pre: </b> there must be an active instance of TicTacToe. <br>
     * <b>post: </b> the symbol was assigned to this square. <br>
     * @param aSymbol Symbol that is to be assigned to this square. symbol != null and symbol != "".
     */
    public void assignSymbol( String aSymbol )
    {
        symbol = aSymbol;
    }

    /**
     * get the symbol assigned to this square <br>
     * <b>pre: </b> there must be an active instance of TicTacToe.  <br>
     * @return symbol Symbol assigned to this square. symbol != null.
     */
    public String getSymbol( )
    {
        return symbol;
    }

    /**
     * Indicates if the square is empty <br>
     * <b>pre: </b> there must be an active instance of TicTackToe.  <br>
     * @return true if the square is empty, false otherwise.
     */
    public boolean isEmpty( )
    {
        boolean empty = false;
        if( symbol.equals( EMPTY_SQUARE ) )
            empty = true;
        return empty;
    }

    /**
     * Erases the symbol assigned to this square <br>
     * <b>pre: </b> there must be an active instance of TicTackToe.  <br>
     * <b>post: </b> the String "" is assigned as the symbol of the current square. <br>
     */
    public void clean( )
    {
        symbol = EMPTY_SQUARE;
    }

    /**
     * indicates if the square has a certain symbol assigned <br>
     * <b>pre: </b> there must be an active instance of TicTackToe. <br>
     * @param aSymbol the symbol that were comparing. aSymbol != null.
     * @return true if the square has that symbol assigned, false otherwise.
     */
    public boolean hasSymbol( String aSymbol )
    {
        boolean hasIt = symbol.equals( aSymbol );
        return hasIt;
    }
}