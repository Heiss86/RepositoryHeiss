/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teamexcersice;

/**
 *
 * @author kenneth
 */
public class TeamExcersice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Jeg er Awesome");
        for (int i = 0; i < 10; i++) {
            System.out.println("Kenneth er Awesome");
        }
        System.out.println("kenneth");
        
        boolean ErKennethDum = true;
        int i = 100;
        
        while (ErKennethDum){
            
            System.out.println("Hvor dum er Kenneth? (1-10)");
            System.out.println(""+i);
            System.out.println("");
            i -= 10;
            if (i == 0){
                ErKennethDum = false;
            }
        }
        System.out.println("Nu er Kenneth ikke dum mere");
    }
    
}
