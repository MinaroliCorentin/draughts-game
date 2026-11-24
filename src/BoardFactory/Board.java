package BoardFactory;

public interface Board {

    void display();
    long getKings();
    long getBlackPawns();
    long getWhitePawns();
    long getEmptySquares();
    void setBlackPawns(long a);
    void setWhitePawns(long a);
}
