import java.util.Scanner;

public class TD01_EXO02_MonPremProg{

    public static void main(String[] args){
        // Cette année, la mairie de notre village a décidé d’aider financièrement les
        // familles pour la rentrée scolaire. Le calcul de cette aide sera fait par rapport aux
        // salaires des parents. L’aide est accordée pour la somme des salaires (père et
        // mère) au plus égale à 2000 €. Le montant de l’aide est égal à 10% de la somme
        // des salaires.
        // Concevoir un algorithme permettant la saisie (lecture) des salaires du père et de
        // la mère (entrer 0 si l’un des parents n’a pas de salaire), et permettant d’afficher
        // (d’écrire) le montant de l’aide si la somme des salaires est inférieure ou égale à
        // 2000 €. 

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Veuillez indiquer le salaire de votre mère (au moins 0) ");
        double salaire_mere = myScanner.nextDouble();

        System.out.println("Veuillez indiquer le salaire de votre père (au moins 0) ");
        double salaire_pere = myScanner.nextDouble();

        double salaire = salaire_mere + salaire_pere;

        if ( salaire > 2000.0 ){
            System.out.println("votre aider financièrement equal " + 0.1 * salaire);
        } else{
            System.out.println("votre aider financièrement est 500e ");
        }
    }
}