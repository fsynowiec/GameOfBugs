public class TilePlaceholder extends TileModel {

    public TilePlaceholder(Position pos) {
        super(pos, 0);
    }

    @Override
    public boolean[][] getMoveOptions(BoardModel board) {
        return null;
    }
}
