/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_villeneuve;

/**
 *
 * @author adrie
 */
import java.util.Scanner;
public class TP1_convertisseur_VILLENEUVE {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bonjour, saisissez une valeur : ");
        double valeur = scanner.nextDouble();

        System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
        System.out.println("1) De Celcius vers Kelvin");
        System.out.println("2) De Kelvin vers Celcius");
        System.out.println("3) De Farenheit vers Celcius");
        System.out.println("4) De Celcius vers Farenheit");
        System.out.println("5) De Kelvin vers Farenheit");
        System.out.println("6) De Farenheit vers Kelvin");

        int choix = scanner.nextInt();

        switch (choix) {
            case 1:
                double resultat1 = CelciusVersKelvin(valeur);
                System.out.println(valeur + " degre Celsius est egal a " + resultat1 + " degres Kelvin.");
                break;
            case 2:
                double resultat2 = KelvinVersCelcius(valeur);
                System.out.println(valeur + " degre Kelvin est egal a " + resultat2 + " degres Celsius.");
                break;
            case 3:
                double resultat3 = FarenheitVersCelcius(valeur);
                System.out.println(valeur + " degre Farenheit est egal a " + resultat3 + " degres Celsius.");
                break;
            case 4:
                double resultat4 = CelciusVersFarenheit(valeur);
                System.out.println(valeur + " degre Celsius est egal a " + resultat4 + " degres Farenheit.");
                break;
            case 5:
                double resultat5 = KelvinVersFarenheit(valeur);
                System.out.println(valeur + " degre Kelvin est egal a " + resultat5 + " degres Farenheit.");
                break;
            case 6:
                double resultat6 = FarenheitVersKelvin(valeur);
                System.out.println(valeur + " degre Farenheit est egal a " + resultat6 + " degres Kelvin.");
                break;
            default:
                System.out.println("Choix invalide.");
        }

        // Fermez le scanner
        scanner.close();
    }

    // Methodes de conversion
    public static double CelciusVersKelvin(double tCelcius) {
        return tCelcius + 273.15;
    }

    public static double KelvinVersCelcius(double tKelvin) {
        return tKelvin - 273.15;
    }

    public static double FarenheitVersCelcius(double tFarenheit) {
        return (tFarenheit - 32) * 5 / 9;
    }

    public static double CelciusVersFarenheit(double tCelcius) {
        return (tCelcius * 9 / 5) + 32;
    }

    public static double KelvinVersFarenheit(double tKelvin) {
        double tCelcius = KelvinVersCelcius(tKelvin);
        return CelciusVersFarenheit(tCelcius);
    }

    public static double FarenheitVersKelvin(double tFarenheit) {
        double tCelcius = FarenheitVersCelcius(tFarenheit);
        return CelciusVersKelvin(tCelcius);
    }
}


   

