/*
Classe Moussaka
29 Septembre 2023
TP2 : Manip objets
 */
package tp2_manip_VILLENEUVE;

public class Moussaka {
    public int nbCalories;
    
    //Constructeur 
    public Moussaka(int qtt){
        nbCalories =qtt;
    }//Fin Constructeur
    
    //ToString
    @Override
    public String toString() {
        return "Cette moussaka contient "+nbCalories +" calories.";
    }//Fin ToString

}//Fin Classe

