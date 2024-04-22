package TicTacToe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int dimensions;
    private List<List<Cell>> board;

    public Board(int dimensions) {
        this.dimensions = dimensions;
        List<List<Cell>> board = new ArrayList<>();
        for (int i = 0; i < dimensions; i++) {
            List<Cell> temp = new ArrayList<>();
            for (int j = 0; j < dimensions; j++) {
                temp.add(new Cell(i, j));
            }
            board.add(temp);
        }
        this.board = board;
    }

    public int getDimensions() {
        return dimensions;
    }

    public void setDimensions(int dimensions) {
        this.dimensions = dimensions;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }
}
