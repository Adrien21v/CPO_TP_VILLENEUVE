
package lightoff_villeneuve_version_console;
 import java.util.Random;
public class GrilleDeJeu {

    GrilleDeJeu(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    boolean cellulesToutesAllumees() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    boolean cellulesToutesEteintes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void activerColonneDeCellules(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void activerDiagonaleDescendante() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void activerLigneDeCellules(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void melangerMatriceAleatoirement(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public class GrilleDeCellules {
    private CelluleLumineuse[][] matriceCellules;
    private int nbLignes;
    private int nbColonnes;


    public GrilleDeCellules(int nbLignes, int nbColonnes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];

        // Initialisation de la matrice de cellules
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse() {};
            }
        }
    }

  
    public void activerLigneDeCellules(int idLigne) {
        for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[idLigne][j].activerCellule();
        }
    }


    public void activerColonneDeCellules(int idColonne) {
        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][idColonne].activerCellule();
        }
    }
 void activerDiagonaleDescendante() {
        for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
            matriceCellules[i][i].activerCellule();
        }
    }

    public boolean cellulesToutesAllumees() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (!matriceCellules[i][j].getEtat()) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean cellulesToutesEteintes() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (matriceCellules[i][j].getEtat()) {
                    return false;
                }
            }
        }
        return true;
    }


    public void melangerMatriceAleatoirement(int nbTours) {
        Random random = new Random();

        for (int tour = 0; tour < nbTours; tour++) {
            int choix = random.nextInt(3);

            if (choix == 0) {
                int ligne = random.nextInt(nbLignes);
                activerLigneDeCellules(ligne);
            } else if (choix == 1) {
                int colonne = random.nextInt(nbColonnes);
                activerColonneDeCellules(colonne);
            } else {
                activerDiagonaleDescendante();
            }
        }
    }


    @Override
    public String toString() {
        StringBuilder grilleStr = new StringBuilder();

        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                grilleStr.append(matriceCellules[i][j]);
                grilleStr.append(" ");
            }
            grilleStr.append("\n");
        }

        return grilleStr.toString();
    }
    }
}