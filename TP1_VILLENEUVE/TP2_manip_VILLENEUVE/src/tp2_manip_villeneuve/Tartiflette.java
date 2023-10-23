/*
Classe Tartiflette
29 Septembre 
TP 2 : Manip objets
 */
package tp2_manip_VILLENEUVE;


public class Tartiflette {
    public int nbCalories;


     
    public Tartiflette(int qtt){
        nbCalories =qtt;
    }
    @Override
    public String toString() {
        return "Cette tartiflette contient "+nbCalories +" calories.";
    }
    
}
