package edu.jabs.tictactoe.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import edu.jabs.tictactoe.domain.PCPlayer;
import edu.jabs.tictactoe.domain.TicTacToe;

/**
 * GUI for the ticTackToe game
 */
public class TicTacToeGUI extends JFrame
{
    // -----------------------------------------------------------------
    // Constants
    // -----------------------------------------------------------------
    /**
     *  Symbol for the human player
     */
    private final static String PLAYER_SYMBOL = "X";

    /**
     * Symbol for the PC player
     */
    private final static String PC_SYMBOL = "O";

    // -----------------------------------------------------------------
    // gui Atributes
    // -----------------------------------------------------------------
    /**
     * tic tack toe ImagePane
     */
    private TicTacToeImagePane ticTacToePane;

    /**
     * buttons ImagePane
     */
    private ButtonsImagePane buttonsPane;

    /**
     * Meessage bar ImagePane
     */
    private MessagesImagePane messagesPane;

    // -----------------------------------------------------------------
    // Attributes
    // -----------------------------------------------------------------
    /**
     * tic tac toe game
     *
     */
    private TicTacToe ticTacToeGame;

    /**
     * PC player
     */
    private PCPlayer pcPlayer;

    // -----------------------------------------------------------------
    // Constructors
    // -----------------------------------------------------------------

    /**
     * builds the tic tac toe GUI
     * @param title the title that will be displayed on the frame. title != null.
     */
    public TicTacToeGUI( String title )
    {
        // the board
        ticTacToePane = new TicTacToeImagePane( this );
        // the buttons
        buttonsPane = new ButtonsImagePane( this );
        // messages
        messagesPane = new MessagesImagePane( );

        setPreferredSize( new Dimension( 300, 300 ) );
        add( messagesPane, BorderLayout.NORTH );
        add( ticTacToePane, BorderLayout.CENTER );
        add( buttonsPane, BorderLayout.SOUTH );
        setTitle( title );
        pack( );
        setResizable( false );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        messagesPane.displayMessage( "Ready to play!" );

        // Tic tac toe Game
        ticTacToeGame = new TicTacToe( );
        // PC player
        pcPlayer = new PCPlayer( ticTacToeGame, PC_SYMBOL );

    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Gets everything ready for a new game
     */
    public void newGame( )
    {

        // Clears the board
        ticTacToeGame.clearBoard( );

        JButton restartButton;

        // prepares de GUI for the tic tac toe game
        for( int i = 1; i <= 9; i++ )
        {
            restartButton = ( JButton )ticTacToePane.getComponent( i - 1 );
            restartButton.setEnabled( true );
            restartButton.setText( "" );
        }
    }

    /**
     * Makes the human player's move, if it is valid the computer player is invited to make a move
     * @param squarePosition Move made by the Human player. squarePosition != null and squarePosition != "".
     */
    public void processMove( String squarePosition )
    {

        int square;

        // Gets the number of the square position
        square = Integer.valueOf( squarePosition ).intValue( );

        // tells the game which square the player chose
        ticTacToeGame.placeSymbolInSquare( square, PLAYER_SYMBOL );

        // checks to see if the human player won the game.
        if( ticTacToeGame.wonGame( PLAYER_SYMBOL ) )
        {
            messagesPane.displayMessage( "You Won!" );

            JButton restartButton;
            // when a player wins the board is shut down
            for( int i = 1; i <= 9; i++ )
            {
                restartButton = ( JButton )ticTacToePane.getComponent( i - 1 );
                restartButton.setEnabled( false );
            }
        }
        else
        // if the human player didn't win then the computer player is invited to play
        {
            messagesPane.displayMessage( "My turn!" );

            // if the pc player was able to complete his move
            if( pcPlayer.play( ) )
            {
                // checks to see if the pc player won the game
                if( ticTacToeGame.wonGame( PC_SYMBOL ) )
                {
                    messagesPane.displayMessage( "I won!" );

                    JButton restartButton;
                    // if he won the board is shut down
                    for( int i = 1; i <= 9; i++ )
                    {
                        restartButton = ( JButton )ticTacToePane.getComponent( i - 1 );
                        restartButton.setEnabled( false );
                    }
                }
                else
                    // if he didnt win, the player is invited to play
                    messagesPane.displayMessage( "your turn" );
            }
            else
            {
                // if the pc player couldnt make his move
                // the game is over
                messagesPane.displayMessage( "game over..." );
            }
        }
    }

    /**
     * displays the player's symbols on the board according to the players' moves
     */
    public void repaintTicTacToe( )
    {

        String symbol;
        JButton restartButton;

        for( int i = 1; i <= 9; i++ )
        {
            restartButton = ( JButton )ticTacToePane.getComponent( i - 1 );
            // the symbol in every occupied square position is taken from the game
            if( !ticTacToeGame.emptySquare( i ) )
            {
                symbol = ticTacToeGame.getSquareSymbol( i );
                restartButton.setText( symbol );
                restartButton.setEnabled( false );
            }
        }
    }

    // -----------------------------------------------------------------
    // Extension Points
    // -----------------------------------------------------------------

    /**
     * Executes operation 1.<br>
     * <b>post: </b>the value from operation 1 is returned and is displayed on the screen.
     */

    public void funcReqOption1( )
    {
        String answer = ticTacToeGame.method1( );
        JOptionPane.showMessageDialog( this, answer, "Answer", JOptionPane.INFORMATION_MESSAGE );

    }

    /**
     * Executes operation 2.<br>
     * <b>post: </b>the value from operation 1 is returned and is displayed on the screen.
     */

    public void funcReqOption2( )
    {
        String answer = ticTacToeGame.method2( );
        JOptionPane.showMessageDialog( this, answer, "Answer", JOptionPane.INFORMATION_MESSAGE );

    }

    /**
     * Main execution method
     * @param args starting parameters for the program . not used.
     */
    public static void main( String[] args )
    {
        TicTacToeGUI gui = new TicTacToeGUI( "Tic tac toe game" );
        gui.setVisible( true );
    }
}