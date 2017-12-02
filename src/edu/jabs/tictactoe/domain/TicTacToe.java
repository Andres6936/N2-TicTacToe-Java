package edu.jabs.tictactoe.domain;

/**
 * tic tac toe board
 */
public class TicTacToe
{
    // -----------------------------------------------------------------
    // Constants
    // -----------------------------------------------------------------
    /**
     * upper left square on the tic tac toe board
     */
    final public static int UPPER_LEFT = 1;
    /**
     * upper center square on the tic tac toe board
     */
    final public static int UPPER_CENTER = 2;
    /**
     * upper right square on the tic tac toe board
     */
    final public static int UPPER_RIGHT = 3;
    /**
     * middle right square on the tic tac toe board
     */
    final public static int MIDDLE_LEFT = 4;
    /**
     * middle center square on the tic tac toe board
     */
    final public static int MIDDLE_CENTER = 5;
    /**
     * middle left square on the tic tac toe board
     */
    final public static int MIDDLE_RIGHT = 6;
    /**
     * bottom left square on the tic tac toe board
     */
    final public static int BOTTOM_LEFT = 7;
    /**
     * bottom center square on the tic tac toe board
     */
    final public static int BOTTOM_CENTER = 8;
    /**
     * bottom right square on the tic tac toe board
     */
    final public static int BOTTOM_RIGHT = 9;

    // -----------------------------------------------------------------
    // Attributes
    // -----------------------------------------------------------------

    /**
     * Square 1
     */
    private Square square1;
    /**
     * Square 2
     */
    private Square square2;
    /**
     * Square 3
     */
    private Square square3;
    /**
     * Square 4
     */
    private Square square4;
    /**
     * Square 5
     */
    private Square square5;
    /**
     * Square 6
     */
    private Square square6;
    /**
     * Square 7
     */
    private Square square7;
    /**
     * Square 8
     */
    private Square square8;
    /**
     * Square 9
     */
    private Square square9;

    // -----------------------------------------------------------------
    // Constructor Method
    // -----------------------------------------------------------------

    /**
     * Creates the tic tac toe board by preparing all nine square positions
     */
    public TicTacToe( )
    {
        square1 = new Square( );
        square2 = new Square( );
        square3 = new Square( );
        square4 = new Square( );
        square5 = new Square( );
        square6 = new Square( );
        square7 = new Square( );
        square8 = new Square( );
        square9 = new Square( );
    }

    // -----------------------------------------------------------------
    // Methods
    // -----------------------------------------------------------------

    /**
     * Assigns a symbol to one of the square positions on the board. Square positions are numbered from 1 to 9, begining with the upper right position and increasing from right to left. <br>
     * <b>post: </b> the square position selected gets the symbol that was received as a parameter<br>
     * @param square number of the square position. 1 <= square <= 9
     * @param symbol Symbol that is to be assigned to the square. symbol != null y symbol != "".
     */
    public void placeSymbolInSquare( int square, String symbol )
    {
        switch( square )
        {
            case UPPER_LEFT:
                square1.assignSymbol( symbol );
                break;
            case UPPER_CENTER:
                square2.assignSymbol( symbol );
                break;
            case UPPER_RIGHT:
                square3.assignSymbol( symbol );
                break;
            case MIDDLE_LEFT:
                square4.assignSymbol( symbol );
                break;
            case MIDDLE_CENTER:
                square5.assignSymbol( symbol );
                break;
            case MIDDLE_RIGHT:
                square6.assignSymbol( symbol );
                break;
            case BOTTOM_LEFT:
                square7.assignSymbol( symbol );
                break;
            case BOTTOM_CENTER:
                square8.assignSymbol( symbol );
                break;
            case BOTTOM_RIGHT:
                square9.assignSymbol( symbol );
        }
    }
    /**
     * returns the symbol assigned to the square position <br>
     * @param square  the square number. 1 <= square <= 9.
     * @return symbol  Symbol the symbol assigned to the square position
     */
    public String getSquareSymbol( int square )
    {
        switch( square )
        {
            case UPPER_LEFT:
                return square1.getSymbol( );
            case UPPER_CENTER:
                return square2.getSymbol( );
            case UPPER_RIGHT:
                return square3.getSymbol( );
            case MIDDLE_LEFT:
                return square4.getSymbol( );
            case MIDDLE_CENTER:
                return square5.getSymbol( );
            case MIDDLE_RIGHT:
                return square6.getSymbol( );
            case BOTTOM_LEFT:
                return square7.getSymbol( );
            case BOTTOM_CENTER:
                return square8.getSymbol( );
            case BOTTOM_RIGHT:
                return square9.getSymbol( );
            default:
                return Square.EMPTY_SQUARE;
        }
    }

    /**
     * indicates whether or not the main diagonal (from the upper left square position to the bottom right square position has been completely occupied by that symbol. <br>
     * @param playerSymbol Symbol that we're looking for. playerSymbol != null.
     * @return true if the main diagonal has been completely occupied by the symbol, false otherwise.
     */
    public boolean mainDiagonalFull( String playerSymbol )
    {
        boolean hasIt = false;
        if( square1.hasSymbol( playerSymbol ) && square5.hasSymbol( playerSymbol ) && square9.hasSymbol( playerSymbol ) )
            hasIt = true;

        return hasIt;
    }

    /**
     * indicates whether or not the second diagonal (from the upper right square position to the bottom left square position has been completely occupied by that symbol. <br>
     * @param playerSymbol Symbol that we're looking for. playerSymbol != null.
     * @return true if the second diagonal has been completely occupied by the symbol, false otherwise.
     */
    public boolean secondDiagonalFull( String playerSymbol )
    {
        boolean hasIt = false;
        if( square3.hasSymbol( playerSymbol ) && square5.hasSymbol( playerSymbol ) && square7.hasSymbol( playerSymbol ) )
            hasIt = true;

        return hasIt;
    }

    /**
     * indicates whether or not the upper row has been completely occupied by that symbol. <br>
     * @param playerSymbol Symbol that we're looking for. playerSymbol != null.
     * @return true if the upper row has been completely occupied by that symbol, false otherwise.
     */
    public boolean upperRowFull( String playerSymbol )
    {
        boolean hasIt = false;
        if( square1.hasSymbol( playerSymbol ) && square2.hasSymbol( playerSymbol ) && square3.hasSymbol( playerSymbol ) )
            hasIt = true;

        return hasIt;
    }

    /**
     * indicates whether or not the center row has been completely occupied by the symbol  <br>
     * @param playerSymbol Symbol that we're looking for. playerSymbol != null.
     * @return true if the middle row has been completely occupied by that symbol, false otherwise.
     */
    public boolean middleRowFull( String playerSymbol )
    {
        boolean hasIt = false;
        if( square4.hasSymbol( playerSymbol ) && square5.hasSymbol( playerSymbol ) && square6.hasSymbol( playerSymbol ) )
            hasIt = true;

        return hasIt;
    }

    /**
     * indicates whether or not the bottom row has been completely occupied by the symbol. <br>
     * @param playerSymbol Symbol that we're looking for. playerSymbol != null.
     * @return true if the bottom row has been completely occupied by the symbol, false otherwise.
     */
    public boolean bottomRowFull( String playerSymbol )
    {
        boolean hasIt = false;
        if( square7.hasSymbol( playerSymbol ) && square8.hasSymbol( playerSymbol ) && square9.hasSymbol( playerSymbol ) )
            hasIt = true;

        return hasIt;
    }

    /**
     * indicates whether or not the left column has been completely occupied by the symbol.<br>
     * @param playerSymbol Symbol that we're looking for. playerSymbol != null.
     * @return true if the left column has been completely occupied by the symbol, false otherwise.
     */
    public boolean leftColumnFull( String playerSymbol )
    {
        boolean hasIt = false;
        if( square1.hasSymbol( playerSymbol ) && square4.hasSymbol( playerSymbol ) && square7.hasSymbol( playerSymbol ) )
            hasIt = true;

        return hasIt;
    }

    /**
     * indicates whether or not the center column has been completely occupied by the symbol. <br>
     * @param playerSymbol. Symbol that we're looking for. playerSymbol != null.
     * @return true if the center column has been completely occupied by the symbol, false otherwise.
     */
    public boolean centerColumnFull( String playerSymbol )
    {
        boolean hasIt = false;
        if( square2.hasSymbol( playerSymbol ) && square5.hasSymbol( playerSymbol ) && square8.hasSymbol( playerSymbol ) )
            hasIt = true;

        return hasIt;
    }

    /**
     * indicates whether or not the right column has been completely occupied by the symbol. <br>
     * @param playerSymbol Symbol that we're looking for. playerSymbol != null.
     * @return true if the right column has been completely occupied by the symbol, false otherwise.
     */
    public boolean rightColumnFull( String playerSymbol )
    {
        boolean hasIt = false;
        if( square3.hasSymbol( playerSymbol ) && square6.hasSymbol( playerSymbol ) && square9.hasSymbol( playerSymbol ) )
            hasIt = true;

        return hasIt;
    }

    /**
     * indicates whether or not the square position is empty or not. Square positions are numbered from 1 to 9, begining with the upper right position and increasing from right to left. <br>
     * @param square the number that represents the square position. 1 < square < 9.
     * @return true if the square is empty, false otherwise.
     */
    public boolean emptySquare( int square )
    {
        switch( square )
        {
            case UPPER_LEFT:
                return square1.isEmpty( );
            case UPPER_CENTER:
                return square2.isEmpty( );
            case UPPER_RIGHT:
                return square3.isEmpty( );
            case MIDDLE_LEFT:
                return square4.isEmpty( );
            case MIDDLE_CENTER:
                return square5.isEmpty( );
            case MIDDLE_RIGHT:
                return square6.isEmpty( );
            case BOTTOM_LEFT:
                return square7.isEmpty( );
            case BOTTOM_CENTER:
                return square8.isEmpty( );
            case BOTTOM_RIGHT:
                return square9.isEmpty( );
            default:
                return false;
        }
    }

    /**
     * indicates whether or not the board is full. in other words if all the square positions have been occupied<br>
     * @return true if the board is full, false otherwise.
     */
    public boolean boardFull( )
    {
        boolean isFull = ! ( square1.isEmpty( ) || square2.isEmpty( ) || square3.isEmpty( ) || square4.isEmpty( ) || square5.isEmpty( ) || square6.isEmpty( ) || square7.isEmpty( ) || square8.isEmpty( ) || square9
                .isEmpty( ) );
        return isFull;
    }

    /**
     * indicates whether or not the player (according to the symbol) won the game. a player wins when he has occupied three square spaces in line be it either diagonal, a row or a column completely. <br>
     * @param symbol Symbol of the player that just made a move (O,X), symbol != null and symbol != "".
     * @return true if the player that just made a move won the game, false otherwise.
     */
    public boolean wonGame( String symbol )
    {
        boolean won = ( mainDiagonalFull( symbol ) || secondDiagonalFull( symbol ) || upperRowFull( symbol ) || middleRowFull( symbol ) || bottomRowFull( symbol ) || leftColumnFull( symbol ) || centerColumnFull( symbol ) || rightColumnFull( symbol ) );
        return won;

    }

    /**
     * clears all the symbols from the board. <br>
     * <b>post: </b> all the square positions are clear. <br>
     */
    public void clearBoard( )
    {
        square1.clean( );
        square2.clean( );
        square3.clean( );
        square4.clean( );
        square5.clean( );
        square6.clean( );
        square7.clean( );
        square8.clean( );
        square9.clean( );
    }

    // -----------------------------------------------------------------
    // Extension Points
    // -----------------------------------------------------------------

    /**
     * Method 1 an extension for the example
     * @return answer 1
     */

    public String method1( )
    {
        return "Answer 1";
    }

    /**
     * Method 2 an extension for the example
     * @return answer 2
     */

    public String method2( )
    {
        return "Answer 2";
    }
}
