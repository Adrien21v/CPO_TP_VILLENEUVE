/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_villeneuve;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author adrie
 */
public class TP1_stats_VILLENEUVE {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        Random generateurAleat = new Random();
        int[] tableauResultats = new int[6];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Combien de lancers de de souhaitez-vous simuler ? ");
        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            int resultatLancer = generateurAleat.nextInt(6); 
            tableauResultats[resultatLancer]++; 
        }
        System.out.println("Resultats des lancers en pourcentage :");
        for (int i = 0; i < 6; i++) {
            double pourcentage = (double) tableauResultats[i] / m * 100;
            System.out.println("Face " + (i + 1) + ": " + pourcentage + "%");
        }

        scanner.close();
    }
}