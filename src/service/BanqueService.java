package service;

public class BanqueService {
	
    public double conversion(double montant) {
        double taux = 3.36;
        double montantConverti = montant * taux;
        return montantConverti;
    }
    public static void main(String[] args) {
    		BanqueService BS= new BanqueService ();
    		System.out.println(BS.conversion(500));
    		
        }

}
