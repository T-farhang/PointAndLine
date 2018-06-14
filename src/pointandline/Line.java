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

    public Line() {
    }

    public Line(double x1, double y1, double x2, double y2) {
        point1 = new Point(x1, y1);
        point2 = new Point(x2, y2);

    }

    public Line(Point p1, Point p2) {
        this.point1 = p1;
        this.point2 = p2;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point p1) {
        this.point1 = p1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point p2) {
        this.point2 = p2;
    }

    public double getPoint1X() {
        return point1.getxPosition();
    }

    public void setPoint1X(double x) {
        point1.setxPosition(x);
    }

    public double getPoint1Y() {
        return point1.getyPosition();
    }

    public void setPoint1Y(double y) {
        point1.setxPosition(y);
    }

    public double getPoint2X() {
        return point2.getxPosition();
    }

    public void setPoint2X(double x) {
        point2.setxPosition(x);
    }

    public double getPoint2Y() {
        return point2.getyPosition();
    }

    public void setPoint2Y(double y) {
        point2.setxPosition(y);
    }

    public double[] getPoint1XY() {
        return point1.getXY();
    }

    public void setPoint1XY(double x, double y) {
        point1.setxPosition(x);
        point1.setyPosition(y);
    }

    public double[] getPoint2XY() {
        return point2.getXY();
    }

    public void setPoint2XY(double x, double y) {
        point2.setxPosition(x);
        point2.setyPosition(y);
    }

    @Override
    public String toString() {
        return "Line{" + "Point 1 = " + point1 + ", Point 2 = " + point2 + '}';
    }

    public double lenght() {
        return point1.distance(point2);
    }

    public double slope() {
        return point1.Slope(point2);
    }

    public void isParallel(Line other) {
        if (this.slope() == other.slope()) {
            System.out.println("They are parallel.");
        } else {
            System.out.println("They aren't parallel.");
        }
    }
}
