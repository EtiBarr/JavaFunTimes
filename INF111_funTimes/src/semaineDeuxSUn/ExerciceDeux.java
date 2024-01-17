package semaineDeuxSUn;
import java.util.Scanner;

public class ExerciceDeux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 String unInput ; // Donnée introduite par l'utilisateur
		 Scanner clavier ;
		 float unNombre ; // la valeur numérique de l'input

		 clavier = new Scanner(System.in);

		System.out.print("Introduire une valeur numérique (ou # pour terminer)) : ");
		 // Lecture du nombre sous la forme d'une chaine de caractères
		 unInput = clavier.nextLine() ;

		 // On boucle tant que ce n'est pas "#"
		 while (!unInput.equals("#")) {

		 // Transformation de la chaine de caractère en un nombre
		// Attention, il y aura une erreur si la chaine de
		// caractères n'est pas un nombre
		 unNombre = Float.parseFloat(unInput);

		 // Affichage de la valeur numérique (non indispensable)
		 System.out.println("La nouvelle valeur : " +unNombre) ;
		// -----------------------------------
		// Mettre votre traitement ici …
		 
		// -----------------------------------

		 // Lecture d'un nouveau nombre
		System.out.print("Introduire une valeur numérique (ou # pour terminer)) : ") ;
		 unInput = clavier.nextLine() ;

		 } // fin du while

		 System.out.println("Au revoir !");
		 clavier.close();
		} 

	}


