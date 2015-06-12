package com.oliver;

public class Main {

    public static void main(String[] args) {

        // maze
        // X X O
        // X O O
        // O O X
        MazeNode[][] maze = new MazeNode[3][3];

        maze[0][0] = null;
        maze[0][1] = null;
        maze[0][2] = new MazeNode(0, 2);
        maze[1][0] = null;
        //false test below
        //maze[1][1] = null;
        //true test below
        maze[1][1] = new MazeNode(1, 1);
        maze[1][2] = new MazeNode(1, 2);
        maze[2][0] = new MazeNode(2, 0);
        maze[2][1] = new MazeNode(2, 1);
        maze[2][2] = null;

        MazeSearcher searcher = new MazeSearcher();
        MazeNode entrance = maze[2][0];
        MazeNode exit = maze[0][2];

        System.out.println("Is exit (" + exit.getX() + ", " + exit.getY() + ") reachable from entrance ("
                + entrance.getX() + ", " + entrance.getY() + ")?");
        System.out.println(searcher.search(maze, entrance, exit));

        System.out.println("Path from exit to entrance: ");
        MazeNode prev = exit.getPrev();
        if(prev == null) {
            System.out.print("does not exist.");
        } else {
            System.out.println("(" + exit.getX() + ", " + exit.getY() + ")");
        }
        while(prev != null) {
            System.out.println("(" + prev.getX() + ", " + prev.getY() + ")");
            prev = prev.getPrev();
        }
    }
}
