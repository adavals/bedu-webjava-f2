package org.bedu.java.backend.sesion4;

import org.bedu.java.backend.sesion4.model.Persona;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
// Implementing CommandLineRunner interface
public class Sesion4Application implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(Sesion4Application.class, args);
	}

	// run() method for springBootApplication to execute
	@Override
	public void run(String... args) throws Exception {
		//Run usa Scanner para leer entrada del usuario
		//Leer entrada y establecer valores de atributos de Persona
		Scanner reader = new Scanner(System.in);

			// Print statement when method is called
			System.out.println("Welcome to Ghibli Park. \nAll admissions are by advance reservation only.");
			System.out.println("To continue to international reservations, please tell us your country.");
			String country = reader.nextLine();
			System.out.println("\nPlease remember the park is closed on Tuesdays, unless there's a national holiday\n");
			System.out.println("What's your name?");
			String name = reader.nextLine();
			System.out.println("What's your occupation?");
			String occupation = reader.nextLine();
			System.out.println("Please, write down your e-mail");
			String email = reader.nextLine();

		//Usar constructor que recibe atributos
		System.out.println("\nHere's your ticket");
		Persona persona = new Persona(country, name, occupation, email);
		System.out.println(persona);
		System.out.println("2,500 Yen");

	}
}
