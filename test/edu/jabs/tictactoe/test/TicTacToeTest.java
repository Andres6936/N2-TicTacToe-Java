package edu.jabs.tictactoe.test;

import java.util.ArrayList;

import junit.framework.TestCase;
import edu.jabs.tictactoe.domain.TicTacToe;

/**
 * Test class for the tic tac toe game
 */
public class TicTacToeTest extends TestCase
{

    // -----------------------------------------------------------------
    // Attributes
    // -----------------------------------------------------------------

    /**
     * Tic tac toe game
     */
    private TicTacToe ticTacToe;
    /**
     * Symbol assigned to player 1
     */
    private String symbolPlayer1;
    /**
     * Symbol assigned to player 2
     */
    private String symbolPlayer2;
    /**
     * square positions occupied by player 1
     */
    private ArrayList squaresPlayer1;
    /**
     * square positions occupied by player 2
     */
    private ArrayList squaresPlayer2;
    /**
     * Unmarked square positions
     */
    private ArrayList unMarkedSquares;

    // -----------------------------------------------------------------
    // Methods
    // -----------------------------------------------------------------

    /**
     * prepares the test data for scenario 1
     */
    private void setupScenario1( )
    {
        String allMarked, squaresWithoutSymbol;
        String[] occupied, unOccupied;
        int square;
        // Prepares the board
        ticTacToe = new TicTacToe( );

        // First Player

        symbolPlayer1 = "X";
        allMarked = "1,3,5,9";
        occupied = allMarked.split( "," );
        squaresPlayer1 = new ArrayList( );

        for( int i = 0; i < occupied.length; i++ )
        {
            square = Integer.parseInt( occupied[ i ] );
            ticTacToe.placeSymbolInSquare( square, symbolPlayer1 );
            squaresPlayer1.add( new Integer( square ) );
        }

        // Second player

        symbolPlayer2 = "O";
        allMarked = "2,6,7,8";
        occupied = allMarked.split( "," );
        squaresPlayer2 = new ArrayList( );

        for( int i = 0; i < occupied.length; i++ )
        {
            square = Integer.parseInt( occupied[ i ] );
            ticTacToe.placeSymbolInSquare( square, symbolPlayer2 );
            squaresPlayer2.add( new Integer( square ) );
        }

        // Unmarked Squares

        squaresWithoutSymbol = "4";
        unOccupied = squaresWithoutSymbol.split( "," );
        unMarkedSquares = new ArrayList( );

        for( int i = 0; i < unOccupied.length; i++ )
        {
            square = Integer.parseInt( unOccupied[ i ] );
            unMarkedSquares.add( new Integer( square ) );
        }
    }

    /**
     * Prepares the data for scenario 2
     */
    private void setupScenario2( )
    {
        String allMarked, squaresWithoutSymbol;
        String[] occupied, unOccupied;
        int square;
        // Prepares the board
        ticTacToe = new TicTacToe( );

        // First Player

        symbolPlayer1 = "X";
        allMarked = "1,2,3,4";
        occupied = allMarked.split( "," );
        squaresPlayer1 = new ArrayList( );

        for( int i = 0; i < occupied.length; i++ )
        {
            square = Integer.parseInt( occupied[ i ] );
            ticTacToe.placeSymbolInSquare( square, symbolPlayer1 );
            squaresPlayer1.add( new Integer( square ) );
        }

        // Second player

        symbolPlayer2 = "O";
        allMarked = "5,6,7,8";
        occupied = allMarked.split( "," );
        squaresPlayer2 = new ArrayList( );

        for( int i = 0; i < occupied.length; i++ )
        {
            square = Integer.parseInt( occupied[ i ] );
            ticTacToe.placeSymbolInSquare( square, symbolPlayer2 );
            squaresPlayer2.add( new Integer( square ) );
        }

        // Unmarked squares

        squaresWithoutSymbol = "9";
        unOccupied = squaresWithoutSymbol.split( "," );
        unMarkedSquares = new ArrayList( );

        for( int i = 0; i < unOccupied.length; i++ )
        {
            square = Integer.parseInt( unOccupied[ i ] );
            unMarkedSquares.add( new Integer( square ) );
        }
    }
    /**
     * Prepares the data for scenario 3
     */
    private void setupEscenario3( )
    {
        String allMarked, squaresWithoutSymbol;
        String[] occupied, unOccupied;
        int square;
        // Prepares the board
        ticTacToe = new TicTacToe( );

        // First Player

        symbolPlayer1 = "X";
        allMarked = "1,3,7,9";
        occupied = allMarked.split( "," );
        squaresPlayer1 = new ArrayList( );

        for( int i = 0; i < occupied.length; i++ )
        {
            square = Integer.parseInt( occupied[ i ] );
            ticTacToe.placeSymbolInSquare( square, symbolPlayer1 );
            squaresPlayer1.add( new Integer( square ) );
        }

        // Second player

        symbolPlayer2 = "O";
        allMarked = "2,4,6,8";
        occupied = allMarked.split( "," );
        squaresPlayer2 = new ArrayList( );

        for( int i = 0; i < occupied.length; i++ )
        {
            square = Integer.parseInt( occupied[ i ] );
            ticTacToe.placeSymbolInSquare( square, symbolPlayer2 );
            squaresPlayer2.add( new Integer( square ) );
        }

        // Unmarked squares

        squaresWithoutSymbol = "5";
        unOccupied = squaresWithoutSymbol.split( "," );
        unMarkedSquares = new ArrayList( );

        for( int i = 0; i < unOccupied.length; i++ )
        {
            square = Integer.parseInt( unOccupied[ i ] );
            unMarkedSquares.add( new Integer( square ) );
        }
    }
    /**
     * Verifies that the square positions occupied by player 1 have his symbol assigned
     */
    public void testSquaresPlayer1( )
    {
        setupScenario1( );
        int size = squaresPlayer1.size( );
        int square;
        int i = 0;
        while( i < size )
        {
            square = ( ( Integer )squaresPlayer1.get( i ) ).intValue( );
            assertEquals( symbolPlayer1, ticTacToe.getSquareSymbol( square ) );
            i++;
        }
    }

    /**
     * Verifies that the square positions occupied by player 2 have his symbol assigned
     */
    public void testSquaresPlayer2( )
    {
        setupScenario2( );
        int size = squaresPlayer2.size( );
        int square;
        int i = 0;
        while( i < size )
        {
            square = ( ( Integer )squaresPlayer2.get( i ) ).intValue( );
            assertEquals( symbolPlayer2, ticTacToe.getSquareSymbol( square ) );
            i++;
        }
    }

    /**
     * Verifies that all the unmarked squares have no symbol assigned
     */
    public void testEmptySquares( )
    {
        setupEscenario3( );
        int size = unMarkedSquares.size( );
        int square;
        int i = 0;
        while( i < size )
        {
            square = ( ( Integer )unMarkedSquares.get( i ) ).intValue( );
            assertTrue( ticTacToe.emptySquare( square ) );
            i++;
        }
    }

    /**
     * verifies that after the board is cleared none of the square positions have symbols assigned
     */
    public void testClearBoard( )
    {
        setupScenario1( );
        ticTacToe.clearBoard( );
        for( int i = 1; i <= 9; i++ )
        {
            assertTrue( ticTacToe.emptySquare( i ) );
        }
    }

    /**
     * Verifies that when a player completely occupies the main diagonal, the player is correctly informed
     */
    public void testMainDiagonalOccupied( )
    {
        setupScenario2( );
        ticTacToe.clearBoard( );
        ticTacToe.placeSymbolInSquare( 1, symbolPlayer1 );
        ticTacToe.placeSymbolInSquare( 5, symbolPlayer1 );
        ticTacToe.placeSymbolInSquare( 9, symbolPlayer1 );
        assertTrue( ticTacToe.mainDiagonalFull( symbolPlayer1 ) );
        assertTrue( ticTacToe.wonGame( symbolPlayer1 ) );
    }

    /**
     * Verifies that when a player completely occupies the second diagonal, the player is correctly informed
     */
    public void testSecondDiagonalOccupied( )
    {
        setupEscenario3( );
        ticTacToe.clearBoard( );
        ticTacToe.placeSymbolInSquare( 3, symbolPlayer1 );
        ticTacToe.placeSymbolInSquare( 5, symbolPlayer1 );
        ticTacToe.placeSymbolInSquare( 7, symbolPlayer1 );
        assertTrue( ticTacToe.secondDiagonalFull( symbolPlayer1 ) );
        assertTrue( ticTacToe.wonGame( symbolPlayer1 ) );
    }

    /**
     * Verifies that when a player completely occupies the top row, the player is correctly informed
     */
    public void testTopRowOccupied( )
    {
        setupScenario2( );
        ticTacToe.clearBoard( );
        ticTacToe.placeSymbolInSquare( 1, symbolPlayer1 );
        ticTacToe.placeSymbolInSquare( 2, symbolPlayer1 );
        ticTacToe.placeSymbolInSquare( 3, symbolPlayer1 );
        assertTrue( ticTacToe.upperRowFull( symbolPlayer1 ) );
        assertTrue( ticTacToe.wonGame( symbolPlayer1 ) );
    }
    /**
     * Verifies that when a player completely occupies the middle row, the player is correctly informed
     */
    public void testMiddleRowOccupied( )
    {
        setupEscenario3( );
        ticTacToe.clearBoard( );
        ticTacToe.placeSymbolInSquare( 4, symbolPlayer1 );
        ticTacToe.placeSymbolInSquare( 5, symbolPlayer1 );
        ticTacToe.placeSymbolInSquare( 6, symbolPlayer1 );
        assertTrue( ticTacToe.middleRowFull( symbolPlayer1 ) );
        assertTrue( ticTacToe.wonGame( symbolPlayer1 ) );
    }
    /**
     * Verifies that when a player completely occupies the bottom row, the player is correctly informed
     */
    public void testBottomRowOccupied( )
    {
        setupScenario1( );
        ticTacToe.clearBoard( );
        ticTacToe.placeSymbolInSquare( 7, symbolPlayer1 );
        ticTacToe.placeSymbolInSquare( 8, symbolPlayer1 );
        ticTacToe.placeSymbolInSquare( 9, symbolPlayer1 );
        assertTrue( ticTacToe.bottomRowFull( symbolPlayer1 ) );
        assertTrue( ticTacToe.wonGame( symbolPlayer1 ) );
    }

    /**
     * Verifies that when a player completely occupies the left column, the player is correctly informed
     */
    public void testLeftColumnOccupied( )
    {
        setupScenario2( );
        ticTacToe.clearBoard( );
        ticTacToe.placeSymbolInSquare( 1, symbolPlayer1 );
        ticTacToe.placeSymbolInSquare( 4, symbolPlayer1 );
        ticTacToe.placeSymbolInSquare( 7, symbolPlayer1 );
        assertTrue( ticTacToe.leftColumnFull( symbolPlayer1 ) );
        assertTrue( ticTacToe.wonGame( symbolPlayer1 ) );
    }

    /**
     * Verifies that when a player completely occupies the center column, the player is correctly informed
     */
    public void testCenterColumnOccupied( )
    {
        setupEscenario3( );
        ticTacToe.clearBoard( );
        ticTacToe.placeSymbolInSquare( 2, symbolPlayer1 );
        ticTacToe.placeSymbolInSquare( 5, symbolPlayer1 );
        ticTacToe.placeSymbolInSquare( 8, symbolPlayer1 );
        assertTrue( ticTacToe.centerColumnFull( symbolPlayer1 ) );
        assertTrue( ticTacToe.wonGame( symbolPlayer1 ) );
    }

    /**
     * Verifies that when a player completely occupies the right column, the player is correctly informed
     */
    public void testRightColumnOccupied( )
    {
        setupScenario1( );
        ticTacToe.clearBoard( );
        ticTacToe.placeSymbolInSquare( 3, symbolPlayer1 );
        ticTacToe.placeSymbolInSquare( 6, symbolPlayer1 );
        ticTacToe.placeSymbolInSquare( 9, symbolPlayer1 );
        assertTrue( ticTacToe.rightColumnFull( symbolPlayer1 ) );
        assertTrue( ticTacToe.wonGame( symbolPlayer1 ) );
    }

    /**
     * verifies that when the board has been completely occupied, the game notifies the player
     */
    public void testOccupiedBoard( )
    {
        setupScenario2( );
        for( int i = 1; i <= 9; i++ )
        {
            ticTacToe.placeSymbolInSquare( i, symbolPlayer1 );
        }
        assertTrue( ticTacToe.boardFull( ) );
    }
}