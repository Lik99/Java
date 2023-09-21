public class TD01_EXO01_PremProg {
    public static void main(String[] args){
        double Taux1 = 0.196;
        double Taux2 = 0.055;
        double PrixTTC1 = 20.0;
        double PrixHT = PrixTTC1 / (1+Taux1);
        double PrixTTC2 = PrixHT*(1+Taux2);
        System.out.println("Le prix TTC au taux de 5.5% devrait être :" + PrixTTC2);
    }
}