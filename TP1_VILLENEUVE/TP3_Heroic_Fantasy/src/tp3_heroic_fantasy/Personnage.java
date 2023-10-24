
package tp3_heroic_fantasy;

/**
 *
 * @author adrie
 */
// Classe abstraite Personnage
public abstract class Personnage {
    private String nom;
    private int niveauVie;

    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
    }

    public int getNiveauVie() {
        return niveauVie;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Nom du personnage : " + nom + ", Niveau de vie : " + niveauVie;
    }
}