package com.teachersdunet.javaintermediaire;

import java.util.Scanner;

public class ExamenTest {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		//String name = "Je suis une chaîne de caractères";
		//System.out.println(name);
		Examen examen = new Examen();
		System.out.println("Entrez la matière concernée: ");
		String matiere = clavier.nextLine();
		examen.afficherMessage(matiere);
		clavier.close();
	}

}
