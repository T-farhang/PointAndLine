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
public class Line {

    private Point point1, point2;
    private int Slope;

    public Line() {
    }

    public Line(int x1, int y1, int x2, int y2) {
        point1 = new Point(x1, y1);
        point2 = new Point(x2, y2);

    }

    public Line(Point noghte1, Point noghte2) {
        this.point1 = noghte1;
        this.point2 = noghte2;
    }

    public Point getNoghte1() {
        return point1;
    }

    public void setNoghte1(Point noghte1) {
        this.point1 = noghte1;
    }

    public Point getNoghte2() {
        return point2;
    }

    public void setNoghte2(Point noghte2) {
        this.point2 = noghte2;
    }

    public int getNoghte1X() {
        return point1.getxPosition();
    }

    public void setNoghte1X(int x) {
        point1.setxPosition(x);
    }

    public int getNoghte1Y() {
        return point1.getyPosition();
    }

    public void setNoghte1Y(int y) {
        point1.setxPosition(y);
    }

    public int getNoghte2X() {
        return point2.getxPosition();
    }

    public void setNoghte2X(int x) {
        point2.setxPosition(x);
    }

    public int getNoghte2Y() {
        return point2.getyPosition();
    }

    public void setNoghte2Y(int y) {
        point2.setxPosition(y);
    }

    public int[] getNoghte1XY() {
        return point1.getXY();
    }

    public void setNoghte1XY(int x, int y) {
        point1.setxPosition(x);
        point1.setyPosition(y);
    }

    public int[] getNoghte2XY() {
        return point2.getXY();
    }

    public void setNoghte2XY(int x, int y) {
        point2.setxPosition(x);
        point2.setyPosition(y);
    }

    @Override
    public String toString() {
        return "Khat{" + "noghte1=" + point1 + ", noghte2=" + point2 + '}';
    }

    public void getLenght() {
        point1.distance(point2);
    }

    public void getSlope() {
        point1.Slope(point2);
    }
}
