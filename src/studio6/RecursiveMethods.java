package studio6;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
			if (n == 0) {
				return 0;
			}
			
			return Math.pow(0.5, n) + geometricSum(n-1);
		
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
			if (q == 0) {
				return p;
			}
			
			return gcd(q, p % q);
		
	}

	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
		int [] array2 = new int [array.length];
		
		if (array.length == 0) {
			return array2;
		}
		
			// FIXME create a helper method that can recursively reverse the given array
			return helperMethod(array, array2, array.length-1, 0);
		
	}
	
	public static int[] helperMethod(int [] array, int[] array2, int n, int counter) {
		
		if (n == 0) {
			array2[counter] = array[n]; //if the array length is 0 return an empty array2
			return array2; //at this point array2 should be filled reversliy
		}
		

		array2[counter] = array[n];
		return helperMethod(array, array2, n - 1, counter + 1);
	}

	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		
		if (radius <= radiusMinimumDrawingThreshold) {
			StdDraw.circle(xCenter, yCenter, radius);
		}
		
		StdDraw.circle(xCenter, yCenter, radius);
		
		
		 circlesUponCircles(xCenter + radius , yCenter , radius/3.0 ,radiusMinimumDrawingThreshold);
		 circlesUponCircles(xCenter - radius , yCenter  , radius/3.0 ,radiusMinimumDrawingThreshold);
		 circlesUponCircles(xCenter ,yCenter+radius  , radius/3.0 ,radiusMinimumDrawingThreshold);
		 circlesUponCircles(xCenter ,yCenter - radius, radius/3.0 ,radiusMinimumDrawingThreshold);
		
		
		// FIXME
	}

}
