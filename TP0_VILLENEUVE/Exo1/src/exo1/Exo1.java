/*
 * Villeneuve, TDB, Ex1 Tp0, 18/09
 */
package exo1;

import java.util.Scanner;

/**
 *
 * @author adrie
 */
public class Exo1 {

    private static int maVariable;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        String prenom;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Bonjour, quel est votre prenom ?");   
        prenom = sc.nextLine();
        
        int maVabriable = 0;
       
        
        System.out.println("au revoir"+ prenom + maVabriable);
    }
    
}

