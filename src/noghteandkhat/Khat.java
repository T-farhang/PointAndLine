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
public class Khat {

    private Noghte noghte1, noghte2;

    public Khat() {
    }

    public Khat(int x1, int y1, int x2, int y2) {
        noghte1 = new Noghte(x1, y1);
        noghte2 = new Noghte(x2, y2);

    }

    public Khat(Noghte noghte1, Noghte noghte2) {
        this.noghte1 = noghte1;
        this.noghte2 = noghte2;
    }

    public Noghte getNoghte1() {
        return noghte1;
    }

    public void setNoghte1(Noghte noghte1) {
        this.noghte1 = noghte1;
    }

    public Noghte getNoghte2() {
        return noghte2;
    }

    public void setNoghte2(Noghte noghte2) {
        this.noghte2 = noghte2;
    }

    public int getNoghte1X() {
        return noghte1.getxPosition();
    }

    public void setNoghte1X(int x) {
        noghte1.setxPosition(x);
    }

    public int getNoghte1Y() {
        return noghte1.getyPosition();
    }

    public void setNoghte1Y(int y) {
        noghte1.setxPosition(y);
    }

    public int getNoghte2X() {
        return noghte2.getxPosition();
    }

    public void setNoghte2X(int x) {
        noghte2.setxPosition(x);
    }

    public int getNoghte2Y() {
        return noghte2.getyPosition();
    }

    public void setNoghte2Y(int y) {
        noghte2.setxPosition(y);
    }

    public int[] getNoghte1XY() {
        return noghte1.getXY();
    }

    public void setNoghte1XY(int x, int y) {
        noghte1.setxPosition(x);
        noghte1.setyPosition(y);
    }

    public int[] getNoghte2XY() {
        return noghte2.getXY();
    }

    public void setNoghte2XY(int x, int y) {
        noghte2.setxPosition(x);
        noghte2.setyPosition(y);
    }

    @Override
    public String toString() {
        return "Khat{" + "noghte1=" + noghte1 + ", noghte2=" + noghte2 + '}';
    }

    public void getLenght() {
        noghte1.distance(noghte2);
    }

    public void getShib() {
        noghte1.Shib(noghte2);
    }
}
