import java.util.Scanner;
public class MaClasse {
public void afficher(int age) {
    System.out.println ("Bienvenu ");
    Scanner sc = new Scanner(System.in);
    System.out.println ("donner votre nom est prenom") ;
    String fullname = sc.nextLine() ;

    System.out.println (fullname+" tu a "+age +" ans") ;

}
public static void main (String args[]) {
    MaClasse m = new MaClasse(); 
    m.afficher(20) ;
}
}