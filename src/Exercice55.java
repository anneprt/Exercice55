import java.util.Scanner;

public class Exercice55 {
    
    public static void main(String[] args) {
        int nombreCB;
        int nombreCheque;
        int nombreVirement;
        int nombreDebit;
        double resultat;
        Scanner lectureClavier = new Scanner(System.in);
        System.out.print(" Nombre d'achats par Carte Bleue : ");
        nombreCB = lectureClavier.nextInt();
        System.out.print(" Nombre de chèques émis : ");
        nombreCheque = lectureClavier.nextInt();
        System.out.print(" Nombre de virements automatiques : ");
        nombreVirement = lectureClavier.nextInt();
        nombreDebit = nombreCB + nombreCheque + nombreVirement;
        System.out.println("Vous avez émis " + nombreDebit + " débits ");
        resultat = pourcentage(nombreDebit, nombreCB);
        System.out.println(" dont " + resultat + " % par Carte bleue ");
        resultat = pourcentage(nombreDebit, nombreCheque);
        System.out.println("" + resultat + " % par Chèques ");
        resultat = pourcentage(nombreDebit, nombreVirement);
        System.out.println("" + resultat + " % par Virement automatique ");
    }

    public static double pourcentage(int total, int nombreCB) {

        double pourcentage = (double) nombreCB / total * 100;
        return pourcentage;
    }


}
