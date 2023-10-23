
package tp2_relation_1_villeneuve;


public class Personne {
    
    public String nom,prenom;
    public int nbVoitures;
    public Voiture [] liste_voitures;

    public Personne(String name, String firstname){
        nom = name;
        prenom = firstname;
        liste_voitures = new Voiture [3] ;
        nbVoitures =0;

    }
    
    
    @Override
    public String toString() {
        return "Il s'appelle "+prenom+" "+nom;
    }
    
    public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
        
        if(nbVoitures>2 || !(voiture_a_ajouter.Proprietaire == null)){
            return false;
        } else {
            
            liste_voitures[nbVoitures]=voiture_a_ajouter;
            nbVoitures++;
            
            voiture_a_ajouter.Proprietaire = this ; 
            
            return true;
        }
    }
}
