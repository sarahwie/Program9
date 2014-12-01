package edu.cofc.csci221.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 * @author CSCI 221 - Programming Assignment 9
 * @since 18 Nov 2014
 * 
 * Class that inherits from JFrame. This frames 
 * the panel class and supplies wrapper methods
 * 
 * DO NOT MODIFY THIS CLASS
 *
 */
@SuppressWarnings("serial")
public class FractalUI extends JFrame {
	
	// private instance variables
	private FractalPanel fractalPanel;
	
	/**
	 * 
	 * No argument constructor that initializes 
	 * the UI and displays the grid panel to the 
	 * user.
	 * 
	 */
	public FractalUI( int level ) {
		
		fractalPanel = new FractalPanel( level );
		
		JPanel contentPane = (JPanel)this.getContentPane();
		
		contentPane.setLayout( new BorderLayout() );
		
		contentPane.setBorder( BorderFactory.createEmptyBorder( GridConstants.PAD, 
															GridConstants.PAD,
															GridConstants.PAD, 
															GridConstants.PAD ) );
		
		contentPane.add( fractalPanel, BorderLayout.CENTER );
		
		setSize( new Dimension( GridConstants.MAX_PANEL_WIDTH + GridConstants.FRAME_X_OFFSET, 
				                GridConstants.MAX_PANEL_HEIGHT + GridConstants.FRAME_Y_OFFSET ) );
		
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		setResizable( false );
		
		setTitle( "CSCI 221: Programming Assignment 9" );
		
		setVisible( true );
		
	} // end constructor
	
	/**
	 * Add a Line object to be drawn on the FractalPanel.
	 *  
	 * The Line class will be developed by you. 
	 * Please see Programming Assignment 4 for
	 * Further details.
	 *  
	 * @param line - that represents a valid Line object
	 */
	public void addLine( Line line ) {
		
		fractalPanel.addLine( line );
		
	} // end addLine() method


	/**
	 * 
	 */
	public void draw() {
		
		fractalPanel.draw();
		
	} // end draw() method
	
	/**
	 * 
	 * Remove all line objects. After
	 * this operation is performed, no lines
	 * will be drawn on the FractalPanel.
	 * 
	 */
	public void clear() {
		
		fractalPanel.clear();
		
		fractalPanel.draw();
		
	} // end clear() method

} // end FractalUI class definition

