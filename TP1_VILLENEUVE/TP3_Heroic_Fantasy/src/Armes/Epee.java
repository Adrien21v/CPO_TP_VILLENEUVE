
package Armes;

import Armes.Arme;

/**
 *
 * @author adrie
 */
public class Epee extends Arme{
    
    private int finesse;

    public Epee(String nom, int niveauAttaque, int finesse) {
        super(nom, niveauAttaque);
        if (finesse < 100) {
            this.finesse = finesse;
        } else {
            this.finesse = 100; // Assure que la finesse de l'épée ne dépasse pas 100.
        }
    }

    public int getFinesse() {
        return finesse;
    }

    @Override
    public String toString() {
        return super.toString() + ", Finesse : " + finesse;
    }
}

