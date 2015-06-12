package com.oliver;

public class MazeNode {

    private int x;
    private int y;
    private boolean visited;
    private MazeNode prev;

    MazeNode(int x, int y) {

        this.x = x;
        this.y = y;
        visited = false;
        prev = null;
    }

    public int getX() {

        return x;
    }

    public void setX(int x) {

        this.x = x;
    }

    public int getY() {

        return y;
    }

    public void setY(int y) {

        this.y = y;
    }

    public boolean isVisited() {

        return visited;
    }

    public void setVisited(boolean visited) {

        this.visited = visited;
    }

    public MazeNode getPrev() {

        return prev;
    }

    public void setPrev(MazeNode prev) {

        this.prev = prev;
    }
}
