package edu.cofc.csci221.ui;

/**
 * 
 * @author Sarah Wiegreffe
 * @since 01 December 2014
 * 
 * A class that extends the Line class and creates a KochLine object used to draw the Koch Snowflake Fractal, 
 * computes the fractal lines, accesses them, and determines if they are valid.
 */

public class KochLine extends Line {

	//Initialize instance variables to null
	private Point p1;
	private Point p2;
	private Point p3;
	private Point p4;
	private Point p5;
	
	/** 
	 * Public, 2-argument constructor.
	 * Preconditions: none
	 * Postconditions: Superclass has been called to initialize instance variables to values passed in the parameter.
	 */
	public KochLine(Point start, Point end) {
		
		//Call super class
		super(start, end);
		
		p1 = getStart();
		p5 = getEnd();
	}
	
	
	/** 
	 * Public method to get fractal KochLine segment A.
	 * Preconditions: none
	 * Postconditions: A has been returned.
	 * @return A 	a KochLine object
	 */
	public KochLine getLineA() {
		
		//Create new KochLine object
		KochLine A = new KochLine(p1,p2);
		
		return A;
	}
	
	
	/** 
	 * Public method to get fractal KochLine segment B.
	 * Preconditions: none
	 * Postconditions: B has been returned.
	 * @return B 	a KochLine object
	 */
	public KochLine getLineB() {
		
		//Create new KochLine object
		KochLine B = new KochLine(p2,p3);
		
		return B;
	}
	
	
	/** 
	 * Public method to get fractal KochLine segment C.
	 * Preconditions: none
	 * Postconditions: C has been returned.
	 * @return C 	a KochLine object
	 */
	public KochLine getLineC() {
		
		//Create new KochLine object
		KochLine C = new KochLine(p3,p4);
		
		return C;
	}
	
	
	/** 
	 * Public method to get fractal KochLine segment D.
	 * Preconditions: none
	 * Postconditions: D has been returned.
	 * @return D	a KochLine object
	 */
	public KochLine getLineD() {
		
		//Create new KochLine object
		KochLine D = new KochLine(p4,p5);
		
		return D;
	}
	
	/** 
	 * Public method to compute p2, p3, and p4 (x,y) coordinate values.
	 * Preconditions: none
	 * Postconditions: p2, p3, and p4 (x,y) coordinate values have been computed. Nothing is returned.
	 */
	public void computeFractal() {
		
		int deltaX = p5.getX() - p1.getX();
		int deltaY = p5.getY() - p1.getY();
		
		int x2 = (int)(p1.getX() + (deltaX / 3));
		int y2 = (int)(p1.getY() + (deltaY / 3));
		p2 = new Point(x2,y2);
		
		int x3 = (int)(((p1.getX() + p5.getX()) / 2) + ((Math.sqrt(3) * (p1.getY() - p5.getY())) / 6));
		int y3 = (int)(((p1.getY() + p5.getY()) / 2) + ((Math.sqrt(3) * (p5.getX() - p1.getX())) / 6));
		p3 = new Point(x3,y3);
		
		int x4 = (int)(p1.getX() + ((2 * deltaX) / 3));
		int y4 = (int)(p1.getY() + ((2 * deltaY) / 3));
		p4 = new Point(x4,y4);
	}
	
	
	/** 
	 * Public method to evaluate if all the KochLine segments (A, B, C, and D) are valid.
	 * Preconditions: none
	 * Postconditions: If all segments are valid, true has been returned. Else, false has been returned.
	 * @return a boolean
	 */
	public boolean isKochLineValid() {
		
		if (getLineA().isValid() && getLineB().isValid() && getLineC().isValid() && getLineD().isValid())
			return true;
		else
			return false;
	}
	
}
