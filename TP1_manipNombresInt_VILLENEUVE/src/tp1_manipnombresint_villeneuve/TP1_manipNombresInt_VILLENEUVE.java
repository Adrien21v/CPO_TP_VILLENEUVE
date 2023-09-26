/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_villeneuve;

/**
 *
 * @author adrie
 */
import java.util.Scanner;
public class TP1_manipNombresInt_VILLENEUVE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez saisir le premier entier : ");
        int entier1 = scanner.nextInt();

        System.out.print("Veuillez saisir le deuxieme entier : ");
        int entier2 = scanner.nextInt();

        System.out.println("Vous avez saisi les entiers suivants :");
        System.out.println("Premier entier : " + entier1);
        System.out.println("Deuxieme entier : " + entier2);

        int somme = entier1 + entier2;
        int difference = entier1 - entier2;
        int produit = entier1 * entier2;

        System.out.println("La somme des entiers est : " + somme);
        System.out.println("La difference des entiers est : " + difference);
        System.out.println("Le produit des entiers est : " + produit);

        int quotient = entier1 / entier2;
        int reste = entier1 % entier2;

        System.out.println("Le quotient de la division est : " + quotient);
        System.out.println("Le reste de la division est : " + reste);

        scanner.close();
    }
}

        
    
    

