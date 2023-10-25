
package lightoff_villeneuve_version_console;


public abstract class CelluleLumineuse {
    private boolean etat;

    public CelluleLumineuse(boolean etat) {
        if (etat = true) {
            this.etat = false; 
        }
    }
    public boolean activerCellule() {
        etat=!etat;
        return etat;
    }
    public boolean eteindreCellule() {
        if (etat = true) {
            etat = !etat;
        }
        return false;
    }
    public boolean estEteint () {
        return etat == false;
    }
    public boolean getEtat() {
        return etat;
    }
}