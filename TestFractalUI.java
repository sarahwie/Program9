package edu.cofc.csci221.ui;

/**
 * 
 * @author CSCI 221 - Programming Assignment 9
 * @since 18 Nov 2014
 * 
 * Test Driver for Fractal UI Application
 *
 */
public class TestFractalUI {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// --------------------------------
		// Level test cases 0, 1, 2, 3
		// See output in assignment PDF
		// --------------------------------

		int level = 3;
		
		FractalUI ui = new FractalUI( level );
		
		ui.addLine( new KochLine( new Point( 100, 300 ), new Point( 300, 300 ) ) );
		ui.addLine( new KochLine( new Point( 300, 300 ), new Point( 200, 100 ) ) );
		ui.addLine( new KochLine( new Point( 200, 100 ), new Point( 100, 300 ) ) );

		ui.draw();
		
	} // end main() method

} // end TestFractalUI class definition
