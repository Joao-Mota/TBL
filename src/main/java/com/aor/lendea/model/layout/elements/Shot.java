package com.aor.lendea.model.layout.elements;


public class Shot extends Element {

    float floatX;

    private float speed;

    private boolean direction;

    private char character;

    static public boolean up = true;
    static public boolean down = false;
    public Shot(int x, int y, float speed, boolean direction, char character) {
        super(x,y);
        this.floatX = x;
        this.speed = speed;
        this.direction = direction;
        this.character = character;
    }

    public float getSpeed() {return speed;}

    public float getFloatX() {return floatX;}

}
