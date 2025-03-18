package engine;


import java.util.*;

import entities.*;
import models.*;


public class GameFactory {

    public static Board createBoard() {
        int boardSize = 100; // Standard board size

        // List of snakes and ladders
        List<Jump> jumps = Arrays.asList(
                new Snake(17, 7), new Snake(54, 34), new Snake(62, 19), new Snake(98, 79),
                new Ladder(3, 22), new Ladder(5, 8), new Ladder(20, 29), new Ladder(57, 76)
        );

        // Convert List<Jump> to List<Integer[]> (to match Board constructor)
        List<Integer[]> jumpList = new ArrayList<>();
        for (Jump j : jumps) {
            jumpList.add(new Integer[]{j.getStart(), j.getEnd()});
        }

        return new Board(boardSize, jumpList); // ✅ Now matches constructor
    }
}
