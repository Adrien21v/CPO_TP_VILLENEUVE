/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_villeneuve;

/**
 *
 * @author adrie
 */
import java.util.Random;
import java.util.Scanner;
public class TP1_guessMyNumber_VILLENEUVE {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
      
        Random generateurAleat = new Random();
        int nombreAleatoire = generateurAleat.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        int nombreSaisi;
        
        while (true) {
            System.out.print("Devinez le nombre entre 0 et 100 : ");
            nombreSaisi = scanner.nextInt();
            if (nombreSaisi < nombreAleatoire) {
                System.out.println("Trop petit ! Essayez encore.");
            } else if (nombreSaisi > nombreAleatoire) {
                System.out.println("Trop grand ! Essayez encore.");
            } else {
                System.out.println("Felicitations ! Vous avez gagne !");
                break; //
            }
        }
        scanner.close();
    }
}
   
 
