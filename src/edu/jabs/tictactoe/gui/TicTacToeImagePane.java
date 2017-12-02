package edu.jabs.tictactoe.gui;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Image pane that displays the tic tac toe board
 */
public class TicTacToeImagePane extends JPanel implements ActionListener
{

    // -----------------------------------------------------------------
    // GUI Attributes
    // -----------------------------------------------------------------
    /**
     * Instance of the button that represents a square position in the board
     */
    private JButton squareButton;

    // -----------------------------------------------------------------
    // Attributes
    // -----------------------------------------------------------------
    /**
     * Instance of the main GUI
     */
    private TicTacToeGUI main;

    // -----------------------------------------------------------------
    // Constructors
    // -----------------------------------------------------------------
    /**
     * Initializes the image pane that contains the tic tac toe board
     * @param window Main window. window != null.
     */

    public TicTacToeImagePane( TicTacToeGUI window )
    {
        main = window;
        setLayout( new GridLayout( 3, 3, 3, 3 ) );
        setBackground( Color.black );
        initializeTicTacToe( );
    }

    // -----------------------------------------------------------------
    // Methods
    // -----------------------------------------------------------------

    /**
     * Initializes the tic tac toe board by placing buttons on each of the nine square positions on it
     */
    private void initializeTicTacToe( )
    {
        for( int i = 1; i <= 9; i++ )
        {
            squareButton = new JButton( );

            squareButton.setFocusable( false );
            squareButton.setRolloverEnabled( false );
            squareButton.setBorderPainted( true );

            squareButton.setFont( squareButton.getFont( ).deriveFont( ( float )50.0 ) );
            squareButton.setPreferredSize( new Dimension( 15, 15 ) );
            squareButton.setName( String.valueOf( i ) );
            squareButton.addActionListener( this );
            squareButton.setActionCommand( String.valueOf( i ) );
            add( squareButton );
        }
    }

    /**
     * responds to the events that the user executes on the board. <br>
     * @param event Event executed by the user. event != null.
     */
    public void actionPerformed( ActionEvent event )
    {

        String actionCommand = event.getActionCommand( );

        main.processMove( actionCommand );

        // Repaints the board
        main.repaintTicTacToe( );

    }

}