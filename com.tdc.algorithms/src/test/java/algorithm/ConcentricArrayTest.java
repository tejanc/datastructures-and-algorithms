package algorithm;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ConcentricArrayTest {

	@Test
	public void test() {
		ConcentricArray ca = new ConcentricArray();
		
		ArrayList<ArrayList<Integer>> e = new ArrayList<ArrayList<Integer>>();
		int input = 7;
		
		e = ca.prettyPrint(input);
		ca.printArray(e);
		
		
	}

}
