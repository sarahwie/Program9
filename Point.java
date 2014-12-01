package edu.cofc.csci221.ui;

/**
 * 
 * @author Programming Assignment 4 - Point Solution Key
 * @since 30 Sept. 2014
 * 
 * Point class that stores x and y coordinate locations
 *
 */
public class Point {
	
	// private instance variables
	private int x = 0;
	private int y = 0;
	
	/**
	 * 
	 */
	public Point() {
		
		this( 0, 0 );
		
	} // end overloaded constructor
	
	/**
	 * 
	 * @param point
	 */
	public Point( Point point ) {
		
		setPoint( point );
		
	} // end overloaded constructor
	
	/**
	 * 
	 * @param x
	 * @param y
	 */
	public Point( int x, int y ) {
		
		setX( x );
		setY( y );
		
	} // end overloaded constructor
	
	/**
	 * 
	 * @param point
	 */
	public void setPoint( Point point ) {
		
		if ( point != null ) {
			
			setX( point.getX() );
			setY( point.getY() );
			
		}
		
	} // end setPoint() method
	
	/**
	 * 
	 * @param x
	 */
	public void setX( int x ) {
		
		if ( x >= 0 && x <= GridConstants.MAX_PANEL_WIDTH ) {
			
			this.x = x;
			
		} else {
			
			this.x = 0;
			
		}
		
	} // end setX() method
	
	/**
	 * 
	 * @return
	 */
	public int getX() {
		
		return x;
		
	} // end getX() method
	
	/**
	 * 
	 * @param y
	 */
	public void setY( int y ) {
		
		if ( y >= 0 && y <= GridConstants.MAX_PANEL_HEIGHT ) {
			
			this.y = y;
			
		} else {
			
			this.y = 0;
			
		}
		
	} // end setY() method
	
	/**
	 * 
	 * @return
	 */
	public int getY() {
		
		return y;
		
	} // end getY() method


} // end Point class definition

