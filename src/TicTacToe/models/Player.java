package TicTacToe.models;

public class Player {
    private PlayerType playerType;
    private String name;
    private Symbol symbol;

    public Player(PlayerType playerType, String name, Symbol symbol) {
        this.playerType = playerType;
        this.name = name;
        this.symbol = symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }
}
