package entities;
public class Snake implements Jump {
    private int start, end;

    public Snake(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() { return start; }
    public int getEnd() { return end; }
}
