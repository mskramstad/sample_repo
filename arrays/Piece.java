/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Piece {
    private int value;
    private boolean alive;

    public Piece() {
    }

    public Piece(int value, boolean alive) {
        this.value = value;
        this.alive = alive;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    @Override
    public String toString() {
        return "Piece{" + "value=" + value + ", alive=" + alive + '}';
    }
    
    
}
