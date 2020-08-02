package algorithm;

import java.util.Vector;

public class KnightOnChessBoard {

	static class cell 
	{ 
		int x, y; 
		int dis; 

		public cell(int x, int y, int dis) 
		{ 
			this.x = x; 
			this.y = y; 
			this.dis = dis; 
		} 
	} 
	
	static class board
	{
		int rows;
		int cols;
		
		public board(int rows, int cols)
		{
			this.rows = rows;
			this.cols = cols;
		}
		
		public int getRows() 
		{
			return rows;
		}
		
		public int getCols() 
		{
			return cols;
		}
	}

	// Utility method returns true if (x, y) lies 
	// inside Board 
	static boolean isInside(int x, int y, board board) 
	{ 
		if (x >= 1 && x <= board.getRows() && y >= 1 && y <= board.getCols()) 
			return true; 
		return false; 
	} 

	public int knight(int A, int B, int C, int D, int E, int F) 
	{
		int[] knightPos = new int[] {C,D};
		int[] targetPos = new int[] {E,F};
		int[] boardSize = new int[] {A,B};		
		return minStepToReachTarget(knightPos, targetPos, boardSize);
	}

	static int minStepToReachTarget(int knightPos[], int targetPos[],  int[] boardSize)  
	{ 
		// x and y direction, where a knight can move 
		int dx[] = { -2, -1, 1, 2, -2, -1, 1, 2 }; 
		int dy[] = { -1, -2, -2, -1, 1, 2, 2, 1 }; 

		// queue for storing states of knight in board 
		Vector<cell> q = new Vector<cell>(); 
		
		// push starting position of knight with 0 distance 
        q.add(new cell(knightPos[0], knightPos[1], 0)); 
        
        cell t; 
        int x, y; 
        board board = new board(boardSize[0], boardSize[1]);
        boolean visit[][] = new boolean[board.getRows() + 1][board.getCols() + 1]; 
  
        // make all cell unvisited 
        for (int i = 1; i <= board.getRows(); i++) 
            for (int j = 1; j <= board.getCols(); j++) 
                visit[i][j] = false; 
  
        // visit starting state 
        visit[knightPos[0]][knightPos[1]] = true; 
  
        // loop untill we have one element in queue 
        while (!q.isEmpty()) { 
            t = q.firstElement(); 
            q.remove(0); 
  
            // if current cell is equal to target cell, 
            // return its distance 
            if (t.x == targetPos[0] && t.y == targetPos[1]) 
                return t.dis; 
  
            // loop for all reachable states 
            for (int i = 0; i < 8; i++) { 
                x = t.x + dx[i]; 
                y = t.y + dy[i]; 
  
                // If reachable state is not yet visited and 
                // inside board, push that state into queue 
                if (isInside(x, y, board) && !visit[x][y]) { 
                    visit[x][y] = true; 
                    q.add(new cell(x, y, t.dis + 1)); 
                } 
            } 
        } 
        return Integer.MAX_VALUE; // or -1

	}
}
