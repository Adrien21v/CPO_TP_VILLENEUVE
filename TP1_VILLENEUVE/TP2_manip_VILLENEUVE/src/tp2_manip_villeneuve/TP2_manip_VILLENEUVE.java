
package tp2_manip_VILLENEUVE;

import java.util.Random;

public class TP2_manip_VILLENEUVE {

    public static void main(String[] args) {
        

        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2;
        
     
        System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " +assiette3.nbCalories) ;
        System.out.println("---------------");
        
       
        System.out.println("Assiette 1 : "+assiette1);
        System.out.println("Assiette 2 : "+assiette2);
        
        assiette2 = assiette1;
        assiette1 = assiette3;
        
        System.out.println("Après l'échange des assiettes :");
        System.out.println("Assiette 1 : "+assiette1);
        System.out.println("Assiette 2 : "+assiette2);
        
       
        System.out.println("----------");
        
        Moussaka [] tab = new Moussaka[10];
        
        Random generateurAleat = new Random();
        
        for(int i=0;i<tab.length;i++){
            tab[i] = new Moussaka(generateurAleat.nextInt(500));
            System.out.println(tab[i]);
        }
    }
}
