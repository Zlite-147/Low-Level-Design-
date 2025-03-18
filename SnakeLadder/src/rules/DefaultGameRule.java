package rules;

public class DefaultGameRule implements GameRule {
    @Override
    public boolean isGameOver(int position, int boardSize) {
        return position == boardSize;
    }
}
