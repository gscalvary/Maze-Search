package com.oliver;

import java.util.ArrayList;
import java.util.Stack;

// Takes an adjacency matrix graph representation of a maze along with an entrance and an exit node and returns
// true if a path exists through the maze from entrance to exit or false otherwise.
public class MazeSearcher {

    public boolean search(MazeNode[][] graph, MazeNode entrance, MazeNode exit) {

        Stack<MazeNode> s = new Stack<MazeNode>();
        s.push(entrance);
        MazeNode prev = null;

        while(!s.isEmpty()) {
            MazeNode node = s.pop();
            node.setVisited(true);
            node.setPrev(prev);
            if(node.getX() == exit.getX() && node.getY() == exit.getY()) return true;
            for(MazeNode child : getChildren(graph, node)) {
                s.push(child);
            }
            prev = node;
        }

        return false;
    }

    private ArrayList<MazeNode> getChildren(MazeNode[][] g, MazeNode m) {

        ArrayList<MazeNode> mn = new ArrayList<MazeNode>();

        // Up
        int x = m.getX();
        int y = m.getY() - 1;
        if(y >= 0 && g[x][y] != null && !g[x][y].isVisited()) mn.add(g[x][y]);
        // Down
        x = m.getX();
        y = m.getY() + 1;
        if(y < g.length && g[x][y] != null && !g[x][y].isVisited()) mn.add(g[x][y]);
        // Left
        x = m.getX() - 1;
        y = m.getY();
        if(x >= 0 && g[x][y] != null && !g[x][y].isVisited()) mn.add(g[x][y]);
        // Right
        x = m.getX() + 1;
        y = m.getY();
        if(x < g.length && g[x][y] != null && !g[x][y].isVisited()) mn.add(g[x][y]);

        return mn;
    }
}
