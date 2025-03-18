package engine;


import models.*;
import rules.*;



import java.util.*;

public class GameEngine {
    private Board board;
    private Queue<Player> players;
    private Dice dice;
    private GameRule gameRule;

    public GameEngine(Board board, List<Player> players, GameRule gameRule) {
        this.board = board;
        this.players = new LinkedList<>(players);
        this.dice = new Dice();
        this.gameRule = gameRule;
    }

    public void play() {
        while (true) {
            Player currentPlayer = players.poll();
            int diceRoll = dice.roll();
            System.out.println(currentPlayer.getName() + " rolled a " + diceRoll);

            int newPosition = currentPlayer.getPosition() + diceRoll;
            if (newPosition > board.getSize()) {
                System.out.println(currentPlayer.getName() + " stays at " + currentPlayer.getPosition());
            } else {
                newPosition = board.getNewPosition(newPosition);
                currentPlayer.setPosition(newPosition);
                System.out.println(currentPlayer.getName() + " moved to " + newPosition);
            }

            if (gameRule.isGameOver(newPosition, board.getSize())) {
                System.out.println(currentPlayer.getName() + " wins the game! 🎉");
                break;
            }
            players.offer(currentPlayer);
        }
    }
}
