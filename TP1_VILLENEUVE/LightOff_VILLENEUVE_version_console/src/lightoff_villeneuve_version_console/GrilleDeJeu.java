
package lightoff_villeneuve_version_console;

public class GrilleDeJeu {
    private CelluleLumineuse[][] Grille;
    private int nbLignes;
    private int nbColonnes;
    public GrilleDeJeu(int nbLignes, int nbColonnes) {
    CelluleLumineuse[][] Grille = new CelluleLumineuse[nbLignes][nbColonnes];

        // Remplir la matriceCellules avec de nouvelles instances de CelluleLumineuse
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                Grille[i][j] = new CelluleLumineuse(true) {};
            }
        }
    }
}
