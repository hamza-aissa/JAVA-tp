import java.util.Scanner;
public class Bienvenu {
public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println ("Quel est votre prénom ?") ;
    String prenom = sc.nextLine() ;
    System.out.println ("Quel est votre age ?") ;
    Integer age = sc.nextInt() ;
System.out.println ("\nBienvenu " + prenom ) ;
System.out.println ("\n Vous avez " + age+"ans" ) ;
}
}