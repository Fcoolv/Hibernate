package es.altair.hibernate.main;

import java.util.Scanner;

public class App {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int opcion = 0;
		do {
			System.out.println("\t\t\t\t║═══════════════════════════════════════════════║");
			System.out.println("\t\t\t\t║              MENU BASE LVP                    ║");
			System.out.println("\t\t\t\t╠═══════════════════════════════════════════════╣");
			System.out.println("\t\t\t\t║ 1. EQUIPOS                                    ║");
			System.out.println("\t\t\t\t║                                               ║");
			System.out.println("\t\t\t\t║ 2. JUGADORES                                  ║");
			System.out.println("\t\t\t\t║                                               ║");
			System.out.println("\t\t\t\t║ 3. JUEGOS                                     ║");
			System.out.println("\t\t\t\t║                                               ║");
			System.out.println("\t\t\t\t║ 4. TIPOS DE JUEGOS                            ║");
			System.out.println("\t\t\t\t║                                               ║");
			System.out.println("\t\t\t\t║ 0. Salir                                      ║");
			System.out.println("\t\t\t\t║═══════════════════════════════════════════════║");
			System.out.print("Opcion a escoger: ");
			try {
				opcion = sc.nextInt();
			} catch (Exception e) {
				System.out.println("No has introducido un numero.");
			}
		} while (opcion < 0 || opcion > 4);
		switch (opcion) {
		case 1:
			do {
				System.out.println("\t\t\t\t║═══════════════════════════════════════════════║");
				System.out.println("\t\t\t\t║              EQUIPOS                          ║");
				System.out.println("\t\t\t\t╠═══════════════════════════════════════════════╣");
				System.out.println("\t\t\t\t║ 1. AÑADIR                                     ║");
				System.out.println("\t\t\t\t║                                               ║");
				System.out.println("\t\t\t\t║ 2. ACTUALIZAR EQUIPO                          ║");
				System.out.println("\t\t\t\t║                                               ║");
				System.out.println("\t\t\t\t║ 3. BORRAR EQUIPO                              ║");
				System.out.println("\t\t\t\t║                                               ║");
				System.out.println("\t\t\t\t║ 4. LISTAR EQUIPOS                             ║");
				System.out.println("\t\t\t\t║                                               ║");
				System.out.println("\t\t\t\t║ 0. Volver                                     ║");
				System.out.println("\t\t\t\t║═══════════════════════════════════════════════║");
				System.out.print("Opcion a escoger: ");
				try {
					opcion = sc.nextInt();
				} catch (Exception e) {
					System.out.println("No has introducido un numero.");
				}
			} while (opcion < 0 || opcion > 4);
			switch (opcion) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			}
			break;
		case 2:
			do {
				System.out.println("\t\t\t\t║═══════════════════════════════════════════════║");
				System.out.println("\t\t\t\t║              JUGADORES                        ║");
				System.out.println("\t\t\t\t╠═══════════════════════════════════════════════╣");
				System.out.println("\t\t\t\t║ 1. AÑADIR  JUGADOR                            ║");
				System.out.println("\t\t\t\t║                                               ║");
				System.out.println("\t\t\t\t║ 2. ACTUALIZAR JUGADOR                         ║");
				System.out.println("\t\t\t\t║                                               ║");
				System.out.println("\t\t\t\t║ 3. BORRAR JUGADOR                             ║");
				System.out.println("\t\t\t\t║                                               ║");
				System.out.println("\t\t\t\t║ 4. LISTAR JUGADORES                           ║");
				System.out.println("\t\t\t\t║                                               ║");
				System.out.println("\t\t\t\t║ 0. Volver                                     ║");
				System.out.println("\t\t\t\t║═══════════════════════════════════════════════║");
				System.out.print("Opcion a escoger: ");
				try {
					opcion = sc.nextInt();
				} catch (Exception e) {
					System.out.println("No has introducido un numero.");
				}
			} while (opcion < 0 || opcion > 4);
			switch (opcion) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			}
			break;
		}
	}
}
