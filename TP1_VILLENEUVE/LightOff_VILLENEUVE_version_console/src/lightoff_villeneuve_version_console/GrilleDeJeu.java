
package lightoff_villeneuve_version_console;
 import java.util.Random;
public class GrilleDeJeu {
    private CelluleLumineuse[][] matriceCellules;
    private int nbLignes;
    private int nbColonnes;
    private boolean etat;

    public GrilleDeJeu(int p_nbLignes, int p_nbColonnes) {
        nbLignes = p_nbLignes;
        nbColonnes = p_nbColonnes;

        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];

        for (int x = 0; x < nbLignes; x++) {
            for (int y = 0; y < nbColonnes; y++) {
                matriceCellules[x][y] = new CelluleLumineuse(false) {};
            }
        }
       
    public eteindreToutesLesCellules() {
        for (int x = 0; x < nbLignes; x++) {
            for (int y = 0; y < nbColonnes; y++) {
                matriceCellules[x][y].eteindreCellule();
            }
        }
        this.etat = etat;
    }
        public void activerLigneColonneOuDiagonaleAleatoire() {
            Random random = new Random();
            int choix = random.nextInt(3); // Générer un nombre aléatoire entre 0 et 2

            if (choix == 0) {
            int ligne = random.nextInt(nbLignes);
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[ligne][j].activerCellule();
            }
        } else if (choix == 1) {
            int colonne = random.nextInt(nbColonnes);
            for (int i = 0; i < nbLignes; i++) {
                matriceCellules[i][colonne].activerCellule();
            }
        } else {
            for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
                matriceCellules[i][i].activerCellule();
            }
        }
        }
}