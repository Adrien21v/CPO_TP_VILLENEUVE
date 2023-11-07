package lightoff_villeneuve_version_console;


import java.util.Scanner;
import lightoff_villeneuve_version_console.GrilleDeJeu;

public class Partie {
    private GrilleDeJeu grille;
    private int nbCoups;

   
    public Partie() {
        grille = new GrilleDeJeu(4, 4); // Par défaut, grille de 4x4 pour le niveau normal
        nbCoups = 0;
    }

   
    public void lancerPartie() {
        initialiserPartie();
        afficherGrille();

        Scanner scanner = new Scanner(System.in);

        while (!grille.cellulesToutesEteintes() && !grille.cellulesToutesAllumees()) {
            System.out.println("Entrez un coup (ligne, colonne, diagonale ou quitter) : ");
            String coup = scanner.nextLine();

            if (coup.equals("ligne")) {
                System.out.print("Entrez le numéro de la ligne : ");
                int ligne = scanner.nextInt();
                grille.activerLigneDeCellules(ligne - 1); // Soustrayez 1 pour correspondre à l'index 0-based
            } else if (coup.equals("colonne")) {
                System.out.print("Entrez le numéro de la colonne : ");
                int colonne = scanner.nextInt();
                grille.activerColonneDeCellules(colonne - 1); // Soustrayez 1 pour correspondre à l'index 0-based
            } else if (coup.equals("diagonale")) {
                grille.activerDiagonaleDescendante();
            } else if (coup.equals("quitter")) {
                System.out.println("Partie interrompue. Revenez nous voir bientôt !");
                break;
            } else {
                System.out.println("Commande invalide.");
            }

            nbCoups++;
            afficherGrille();
            scanner.nextLine();
        }

        if (grille.cellulesToutesEteintes()) {
            System.out.println("Bravo ! Vous avez gagné en " + nbCoups + " coups.");
        } else if (grille.cellulesToutesAllumees()) {
            System.out.println("Bravo ! Vous avez gagné en " + nbCoups + " coups.");
        }
    }


    public void afficherGrille() {
        System.out.println(grille);
    }


    public void choisirNiveau() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choisissez un niveau de difficulté :");
        System.out.println("1. Facile (3x3)");
        System.out.println("2. Normal (5x5)");
        System.out.println("3. Difficile (7x7)");
        int choix = scanner.nextInt();

        switch (choix) {
            case 1:
                grille = new GrilleDeJeu(3, 3);
                break;
            case 2:
                grille = new GrilleDeJeu(5, 5);
                break;
            case 3:
                grille = new GrilleDeJeu(7, 7);
                break;
            default:
                System.out.println("Niveau de difficulté non valide. Niveau normal (5x5) choisi par défaut.");
                break;
        }
    }

    /**
     * Initialise une nouvelle partie en choisissant le niveau de difficulté et en mélangeant la grille.
     */
    public void initialiserPartie() {
        choisirNiveau();
        grille.melangerMatriceAleatoirement(10); // Mélanger la grille
    }
}