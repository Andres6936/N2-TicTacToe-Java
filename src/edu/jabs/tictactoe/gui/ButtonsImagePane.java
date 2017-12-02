package edu.jabs.tictactoe.gui;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Image pane that contains the buttons
 */
public class ButtonsImagePane extends JPanel implements ActionListener
{

    // -----------------------------------------------------------------
    // Constants
    // -----------------------------------------------------------------

    /**
     * Command Option 1
     */
    private static final String OPTION_1 = "OPTION_1";

    /**
     * Command Option 2
     */
    private static final String OPTION_2 = "OPTION_2";

    /**
     * Command for new game
     */
    private static final String NEW_GAME = "NEW_GAME";

    // -----------------------------------------------------------------
    // GUI Attributes
    // -----------------------------------------------------------------
    /**
     * New game button
     */
    private JButton newGameButton;
    /**
     * Button for option 1
     */
    private JButton ption1Button;
    /**
     * Button for option 2
     */
    private JButton botonOpcion2;
    // -----------------------------------------------------------------
    // Attributes
    // -----------------------------------------------------------------
    /**
     * Instance for the main GUI class
     */
    private TicTacToeGUI main;

    // -----------------------------------------------------------------
    // Constructors
    // -----------------------------------------------------------------

    /**
     * Initializes the message panel for the user
     * @param window Main window. window != null.
     */
    public ButtonsImagePane( TicTacToeGUI window )
    {
        main = window;
        newGameButton = new JButton( );
        ption1Button = new JButton( );
        botonOpcion2 = new JButton( );
        initializeButton( newGameButton, "New Game", ButtonsImagePane.NEW_GAME, Color.BLACK );
        initializeButton( ption1Button, "Option 1", ButtonsImagePane.OPTION_1, Color.BLACK );
        initializeButton( botonOpcion2, "Option 2", ButtonsImagePane.OPTION_2, Color.BLACK );
        add( newGameButton );
        add( ption1Button );
        add( botonOpcion2 );
    }
    // -----------------------------------------------------------------
    // Methods
    // -----------------------------------------------------------------
    /**
     * Defines the properties for a button. <br>
     * @param button Button for which the attributes are being defines. button !=null.
     * @param label text that will appear on the button. label != null.
     * @param command command associated with the button. command != null.
     * @param textColor Color the text will appear in. textColor != null.
     */

    private void initializeButton( JButton button, String label, String command, Color textColor )
    {
        button.setText( label );
        button.setFocusable( false );
        button.setActionCommand( command );
        button.addActionListener( this );
        button.setForeground( textColor );
    }

    /**
     * method in charge of capturing the actions taken by the user
     * @param event Event done by the user. event != null.
     */
    public void actionPerformed( ActionEvent event )
    {
        String actionCommand = event.getActionCommand( );
        if( actionCommand.equals( ButtonsImagePane.NEW_GAME ) )
        {
            main.newGame( );
        }
        else if( actionCommand.equals( ButtonsImagePane.OPTION_1 ) )
        {
            main.funcReqOption1( );
        }
        else if( actionCommand.equals( ButtonsImagePane.OPTION_2 ) )
        {
            main.funcReqOption2( );
        }

        main.repaintTicTacToe( );
    }
}