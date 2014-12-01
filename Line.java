package edu.cofc.csci221.ui;

/**
 * 
 * @author Programming Assignment 4 - Line Solution Key
 * @since 30 Sept. 2014
 * 
 * Line class that stores start and end points
 *
 */
public class Line {
	
	// private instance variables
	private Point start = null;
	private Point end = null;
	
	
	/**
	 * 
	 * @param x
	 * @param y
	 */
	public Line( Point start, Point end ) {
		
		setStart( start );
		setEnd( end );
		
	} // end constructor
	
	
	/**
	 * 
	 * @param start
	 */
	public void setStart( Point start ) {
		
		if ( start != null ) {
			
			this.start = start;
			
		}
		
	} // end setStart() method
	
	
	/**
	 * 
	 * @return
	 */
	public Point getStart() {
		
		return start;
		
	} // end getStart() method
	
	
	/**
	 * 
	 * @return
	 */
	public Point getEnd() {
		
		return end;
		
	} // end getEnd() method
	
	/**
	 * 
	 * @param end
	 */
	public void setEnd( Point end ) {
		
		if ( end != null ) {
			
			this.end = end;
			
		}
		
	} // end setEnd() method
	
	
	/**
	 * 
	 * @return
	 */
	public boolean isValid() {
		
		boolean valid = true;
		
		if ( getStart() == null || getEnd() == null ) 
			valid = false;
		
		return valid;
		
	} // end isValid() method
	

} // end Line class definition
