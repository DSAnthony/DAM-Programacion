package ejercicios;

import java.util.Scanner;

/**
 * Queremos hacer un programa que calcula: en un terreno del campo viven inicialmente 20 gatos y 3500 ratones.
 * Cada gato se come cada día un ratón. Siempre que haya ratones para comer, los gatos se reproducen cada 200 días. 
 * Los ratone se reproducen cada 100 días.
 * 
 * @version 1.0
 * @author Dionny, María, Antonio
 */

public class Ejercicio1 {
	
static Scanner teclado = new Scanner(System.in);
static int gatos = 20;
static int ratones = 3500;

	/**
	 * Función Main que hace el cálculo principal, muestra cuantos gatos y ratones hay y suma 100 días cada iteración.
	 * 
	 * @param args
	 */

    public static void main(String[] args) {
        int salir = 0, dias = 0, ratonesMuertos = 0, ratonesMuertosTotal = 0;

        // Cada 100 días, ratones x2
        // Cada 200 días, gatos x4

        do {
            dias += 100;
            contarAnimales(dias);
            ratonesMuertos = ratones - (ratones - (gatos * 100));
            ratonesMuertosTotal += ratonesMuertos;

            System.out.println("Han pasado " + dias + " días.");
            System.out.println("Hay " + gatos + " gatos.");

            if ((ratones - ratonesMuertos) < 0) {
                System.out.println("Los gatos se han comido todos los ratones.");
                System.out.println("Total de ratones muertos: " + ratonesMuertosTotal);
                break;
            } else {
                System.out.println("Quedan " + (ratones - ratonesMuertos) + " ratones.");
                System.out.println("Se han matado a " + ratonesMuertos + " ratones.");
            }
            
            System.out.println("Introduce -1 para terminar el programa.");
            salir = teclado.nextInt();
        } while (salir != -1);
    }

    /**
     * Función que calcula si han pasado 100 o 200 días.
     * 
     * @param dias
     */
    
    
    public static void contarAnimales (int dias) {
        if (dias % 200 == 0) {
            gatos = gatos * 4;
        } else if (dias % 100 == 0){
            ratones = ratones * 2;
        }
    }
}
