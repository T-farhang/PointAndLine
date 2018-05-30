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
public class NoghteAndKhat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Noghte n1 = new Noghte(1,2);
        System.out.println(n1);
        
        Noghte n2 = new Noghte();
        System.out.println(n2);
        
        n1.setxPosition(3);
        n1.setyPosition(4);
        System.out.println(n1);
        System.out.println("X is : " +n1.getxPosition());
        System.out.println("Y is : " +n1.getyPosition());
        
        n1.setXY(5, 6);
        System.out.println("X is : "+n1.getXY()[0]);
        System.out.println("Y is : "+n1.getXY()[1]);
        
        n2.setXY(1, 1);
        System.out.printf("distance is : %.2f%n", n2.distance(3, 3));
        System.out.printf("distance is : %.2f%n", n1.distance(n2));
        System.out.printf("distance is : %.2f%n", n2.distance(n1));
        System.out.printf("distance is : %.2f%n", n1.distance());
        System.out.printf("distance is : %.2f%n", n2.distance());
        
        System.out.printf("Shib : %.2f%n" , n2.Shib(2, 2));
      
    }

}
