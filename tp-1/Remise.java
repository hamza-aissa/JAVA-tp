import java.util.Scanner;
public class Remise {
    public static void main (String args[] ){
        Scanner sc = new Scanner(System.in);
        System.out.println ("donner le prix du produit: ") ;
        Integer prix = sc.nextInt() ;
        System.out.println ("donner le pourcentage du remise: ") ;
        Integer remise = sc.nextInt() ;
        Integer prix_ar = prix - prix * remise /100;
        System.out.println (" le prix du produit est desormais : "  + prix_ar) ;

    }
    
}
