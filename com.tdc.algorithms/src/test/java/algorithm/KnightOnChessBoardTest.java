package algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

public class KnightOnChessBoardTest {

	@Test
	public void test() {
		KnightOnChessBoard knights = new KnightOnChessBoard();
		int boardSize[] = { 30, 40};
        int knightPos[] = { 1, 1 }; 
        int targetPos[] = { 30, 40 }; 
        System.out.println( 
            knights.minStepToReachTarget( 
                knightPos, targetPos, boardSize)); 
	}

}
