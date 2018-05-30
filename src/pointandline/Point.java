/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointandline;

/**
 *
 * @author Totia
 */
public class Point {

    private int xPosition;
    private int yPosition;

    public Point() {
        this.xPosition = 0;
        this.yPosition = 0;
    }

    public Point(int x, int y) {
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

    public double distance(Point other) {
        int xDis = this.xPosition - other.xPosition;
        int yDis = this.yPosition - other.yPosition;
        return (int) Math.sqrt((xDis * xDis) + (yDis * yDis));
    }

    public double distance() {
        return Math.sqrt(this.xPosition * this.xPosition + this.yPosition * this.yPosition);
    }

    public double Slope(int x, int y) {
        int ySlope = this.yPosition - y;
        int xSlope = this.xPosition - x;
        return (ySlope / xSlope);
    }

    public double Slope(Point other) {
        int xSlope = this.xPosition - other.xPosition;
        int ySlope = this.yPosition - other.yPosition;
        return (ySlope / xSlope);
    }

    public double Slope() {
        return (this.yPosition - this.yPosition) / (this.xPosition * this.xPosition);
    }

    @Override
    public String toString() {
        return "(" + this.xPosition + " , " + this.yPosition + ")";
    }

}
