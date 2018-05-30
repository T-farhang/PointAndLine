/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noghteandkhat;

/**
 *
 * @author Totia
 */
public class Noghte {

    private int xPosition;
    private int yPosition;

    public Noghte() {
        this.xPosition = 0;
        this.yPosition = 0;
    }

    public Noghte(int x, int y) {
        this.xPosition = x;
        this.yPosition = y;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public int[] getXY() {
        int[] result = new int[2];
        result[0] = this.xPosition;
        result[1] = this.yPosition;
        return result;
    }

    public void setXY(int x, int y) {
        this.xPosition = x;
        this.yPosition = y;
    }

    public double distance(int x, int y) {
        int xDis = this.xPosition - x;
        int yDis = this.yPosition - y;
        return Math.sqrt((xDis * xDis) + (yDis * yDis));
    }

    public double distance(Noghte other) {
        int xDis = this.xPosition - other.xPosition;
        int yDis = this.yPosition - other.yPosition;
        return (int) Math.sqrt((xDis * xDis) + (yDis * yDis));
    }

    public double distance() {
        return Math.sqrt(this.xPosition * this.xPosition + this.yPosition * this.yPosition);
    }

    public double Shib(int x, int y) {
        int yShib = this.yPosition - y;
        int xShib = this.xPosition - x;
        return (yShib / xShib);
    }

    public double Shib(Noghte other) {
        int xShib = this.xPosition - other.xPosition;
        int yShib = this.yPosition - other.yPosition;
        return (yShib / xShib);
    }

    public double Shib() {
        return (this.yPosition - this.yPosition) / (this.xPosition * this.xPosition);
    }

    @Override
    public String toString() {
        return "(" + this.xPosition + " , " + this.yPosition + ")";
    }

}
