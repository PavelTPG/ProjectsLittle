package PiersAndShips.entity;

public class Conteyner {

    private String number;
    private boolean empty = true;
    private int height;
    private int length;
    private int weidth;

    public Conteyner() {
    }

    public Conteyner(String number, int height, int length, int weidth) {
        this.number = number;
        this.height = height;
        this.length = length;
        this.weidth = weidth;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeidth() {
        return weidth;
    }

    public void setWeidth(int weidth) {
        this.weidth = weidth;
    }

    @Override
    public String toString() {
        return number + "(" + height + " * " + length + " * " + weidth + ")";
    }

}
