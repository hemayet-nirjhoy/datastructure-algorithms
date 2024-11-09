package backtracking;

import java.util.Arrays;

public class MazeSolver {

    public static boolean solveMaze(int[][] maze, int[][] solution, int x, int y) {
        int rows = maze.length;
        int cols = maze[0].length;
        System.out.println("*********************");
        printSolution(solution);
        System.out.println("----------------------");
        // Base case: if we reached the destination (bottom - right corner) and it is walkable
        if (x == rows -1 && y == cols - 1 && maze[x][y] == 1){
            solution[x][y] = 1;     // Mark the destination as part of the solution
            return true;            // Goal Achieved
        }

        // Check if the current move is valid
        if (isValid(maze, x, y)){
            solution[x][y] = 1;     // Mark the cell as part of the solution

            // Try moving in all four direction: left, right, up, down
            if (solveMaze(maze, solution, x, y - 1)) return true;   // move left
            if (solveMaze(maze, solution, x, y + 1)) return true;   // move right
            if (solveMaze(maze, solution, x - 1, y)) return true;   // move up
            if (solveMaze(maze, solution, x + 1, y)) return true;   // move down

            solution[x][y] = 0;     // Backtrack if none of the moves work
        }
        return false;
    }

    private static boolean isValid(int[][] maze, int x, int y) {
        int rows = maze.length;
        int cols = maze[0].length;
        return (x >= 0 && x < rows && y >=0 && y < cols && maze[x][y] == 1);
    }

    // Function to initialize the solution array and call the solver
    public static int[][] solve(int[][] maze) {
        int[][] solution = new int[maze.length][maze[0].length];

        if (!solveMaze(maze, solution, 0, 0)){
            System.out.println("No Solution found");
            return new int[0][0];
        }

        return solution;
    }

    public static void printSolution(int[][] solution) {
        for (int[] row : solution) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 0},
                {0, 1, 1, 0},
                {1, 1, 1, 1}
        };
        int[][] solution = solve(maze);
        printSolution(solution);
    }
}
