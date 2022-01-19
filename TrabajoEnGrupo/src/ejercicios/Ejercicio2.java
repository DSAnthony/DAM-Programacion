package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/** 
 * En la granja de Rebeca y Pedro quieren recordar el nombre de todos sus patos, corderos, conejos y perros.
 * Nos pide crear un programa en Java que les permita introducir y almacenar los nombres, pudiendo almacenar tantos nombres como sea necesario, consultarlos y añadir alguno nuevo a posteriori si es necesario.
 * 
 * @version 1.0
 * @author Antonio, Maria, Dionny
 */

public class Ejercicio2 {
	
	static Scanner teclado = new Scanner(System.in);
	static String patos[] = {"Connie", "Muse"};
    static String conejos[] = {"Rex", "Diego"};
    static String perros[] = {"Kai","Xen"};
    static String corderos[] = {"Jhon", "Ram"};

    /** 
     * En este parametro creamos un menu que sea amigable con el cliente.
     *  
	 * @param mostrarMenu()
	 */
    
    public static void mostrarMenu() {		
		int opcion;
		do {
			System.out.println("Bienvenido al menú principal");
			System.out.println("----------------------------------");
			System.out.println("1. Menú de patos.");
            System.out.println("2. Menú de conejos.");
            System.out.println("3. Menú de perros.");
            System.out.println("4. Menú de corderos.");
			System.out.println("5. Salir.");
			opcion = Integer.parseInt(teclado.nextLine()); 
			
			switch (opcion) {
			case 1:
				submenuAnimales(patos);
				break;
			case 2:
                submenuAnimales(conejos);
				break;
            case 3:
                submenuAnimales(perros);
                break;
            case 4:
                submenuAnimales(corderos);
            break;
			case 5:
                System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Valor introducido incorrecto.");
				break;
			}
		} while (opcion != 5);
	}
	
    /** 
     * Aplicamos un Array de strings equivalente a la opcion elegida en menu de arriba en el que recoge que animal
	 * esta seleccionado y crea un array bidimencional que añade el nombre del animal al tipo de animal seleccionado.
     * 
	 * @param arrayAnimal[] 
	 */
    
	public static void submenuAnimales(String arrayAnimal[]) {
		int opcion;
		do {
			System.out.println("Bienvenido al submenú de gestión");
			System.out.println("----------------------------------");
			System.out.println("1. Añadir animal.");
            System.out.println("2. Consultar nombres.");
			System.out.println("3. Salir.");
			// opcion = teclado.nextInt(); 
            opcion = Integer.parseInt(teclado.nextLine()); 
            // teclado.next();
			
			switch (opcion) {
			case 1:
                arrayAnimal = Arrays.copyOf(arrayAnimal, arrayAnimal.length + 1);
                System.out.println("¿Qué nombre tiene?");
		        String nombre = teclado.nextLine();
                arrayAnimal[arrayAnimal.length-1] = nombre;
				break;
			case 2:
                for (int i = 0; i < arrayAnimal.length; i++) {
			        System.out.println(arrayAnimal[i]);
                }
				break;
            case 3:
            mostrarMenu();
			    break;
			default:
				System.out.println("Valor introducido incorrecto.");
				break;
			}
		} while (opcion != 3);
	}
	
	/** 
	 * Main que invoca menu principal
	 * 
	 * @param args 
	 */
	
	public static void main(String[] args) {
		mostrarMenu();
        teclado.close();
	}
}