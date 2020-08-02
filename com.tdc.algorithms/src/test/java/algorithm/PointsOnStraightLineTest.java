package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import org.junit.Test;

public class PointsOnStraightLineTest {

	@Test
	public void test() {
		ArrayList<Integer> x = new ArrayList<Integer>();
		ArrayList<Integer> y = new ArrayList<Integer>();
		PointsOnStraightLine pointsOnALine = new PointsOnStraightLine();
		
		int size = (int)(Math.random() * 100);
		for (int i = 0; i < size; ++i) {
			int randX = (int)(Math.random() * 1000);
			int randY = (int)(Math.random() * 1000);
			addXY(x,y, randX, randY);
		}
		
		printPoints(x, y);
		
		int maxPoints = pointsOnALine.maxPoints(x, y);
		System.out.println("There are " + maxPoints + " points on a line-able set of points");
		
	}
	
	private void printPoints(ArrayList<Integer> xArr, ArrayList<Integer> yArr) {
		System.out.print("{");
		for(int i = 0; i < xArr.size(); i++) {
			System.out.print(" ("+xArr.get(i)+","+yArr.get(i)+") ,");
		}
		System.out.println("}");
	}
	
	private void addXY(ArrayList<Integer> xArr, ArrayList<Integer> yArr, int x, int y)  {
		xArr.add(x);
		yArr.add(y);
	}

}
