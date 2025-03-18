import models.*;
import java.util.*;
import rules.*;
import engine.*;

public class Main {
    public static void main(String[] args) {
        Board board = GameFactory.createBoard();
        List<Player> players = Arrays.asList(new Player("Alice"), new Player("Bob"));
        GameRule gameRule = new DefaultGameRule();

        GameEngine game = new GameEngine(board, players, gameRule);
        System.out.println("Game of Snake & Ladder started \n\n");
        game.play();
    }
}