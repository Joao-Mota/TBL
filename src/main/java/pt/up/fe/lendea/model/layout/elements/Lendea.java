package pt.up.fe.lendea.model.layout.elements;

public class Lendea extends Element {
    private int health;
    private int strike;
    private int defense;
    private int coins;
    private boolean win;


    public Lendea(int x, int y) {
        super(x, y);
        this.health = 3;
        this.strike = 10;
        this.defense = 10;
        this.coins = 0;
    }

    public void decreaseHealth() {
        this.health--;
    }
    public void incrementHealth() {this.health++;}

    public int getHealth() {
        return health;
    }

    public void decreaseCoins() {this.coins--;}
    public void incrementCoins() {this.coins++;}

    public int getCoins() {return coins;}

    public void decreaseStrike() {
        this.strike--;
    }
    public void incrementStrike() {this.strike++;}

    public int getStrike() {return strike;}

    public void decreaseDefense() {
        this.defense--;
    }
    public void incrementDefense() {this.defense++;}

    public int getDefense() {
        return defense;
    }

    public boolean getWin() {return win;}

    public void setWin(boolean win) {this.win = win;}
}
