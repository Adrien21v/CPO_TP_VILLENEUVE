/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_villeneuve;

/**
 *
 * @author adrie
 */
public class TP2_Bieres_VILLENEUVE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere() ;
        uneBiere.nom = "Cuvee des trolls";
        uneBiere.degreAlcool = 7.0;
        uneBiere.lireEtiquette();
        
        BouteilleBiere uneAutre = new BouteilleBiere() ;
        uneAutre.nom = "Leffe";
        uneAutre.degreAlcool = 6.6;
        uneAutre.brasserie = "Abbaye de Leffe";
        uneAutre.lireEtiquette();
        
                }  
}

