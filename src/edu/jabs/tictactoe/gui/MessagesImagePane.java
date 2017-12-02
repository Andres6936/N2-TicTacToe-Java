package edu.jabs.tictactoe.gui;


import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Image Pane that displays the game messages
 */
public class MessagesImagePane extends JPanel
{
    // -----------------------------------------------------------------
    // GUI Attributes
    // -----------------------------------------------------------------
    /**
     * Game Message
     */
    private JLabel gameMessage;

    // -----------------------------------------------------------------
    // Constructors
    // -----------------------------------------------------------------
    /**
     * Initializes the message image pane
     */
    public MessagesImagePane( )
    {
        setLayout( new FlowLayout( ) );
        gameMessage = new JLabel( );
        gameMessage.setForeground( Color.blue );
        gameMessage.setHorizontalAlignment( JLabel.LEFT );
        add( gameMessage );
        setBackground( Color.white );
    }

    // -----------------------------------------------------------------
    // Methods
    // -----------------------------------------------------------------

    /**
     * changes the value in the field game message
     * @param value the new value that the field will take. value != null.
     */
    public void displayMessage( String value )
    {
        gameMessage.setText( value );
    }

}