package models;

import java.util.*;

public class Board {
    private int size;
    private Map<Integer, Integer> jumpMap;

    public Board(int size, List<Integer[]> jumpList) {
        this.size = size;
        this.jumpMap = new HashMap<>();

        for (Integer[] jump : jumpList) {
            jumpMap.put(jump[0], jump[1]);  // Mapping start to end
        }
    }

    // This function ensures if a player lands on a snake or ladder, they move accordingly.
    public int getNewPosition(int position) {
        while (jumpMap.containsKey(position)) {
            System.out.println("Jump detected! Moving from " + position + " to " + jumpMap.get(position));
            position = jumpMap.get(position);
        }
        return position;
    }

    public int getSize() { return size; }
}
