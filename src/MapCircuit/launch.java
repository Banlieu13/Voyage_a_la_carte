/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MapCircuit;

/**
 *
 * @author Commando
 */
public class launch {
  private static String a;
  private static String b;

    public static String getA() {
        return a;
    }

    public static void setA(String a) {
        launch.a = a;
    }

    public static String getB() {
        return b;
    }

    public static void setB(String b) {
        launch.b = b;
    }

     
    
    public static void main(String[] args){
     MapMain t = new MapMain();
     t.afficherMap(a,b);
}
    
}

