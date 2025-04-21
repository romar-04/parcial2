
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Sala de Sistemas
 */
public class parcial {


    static String[] array = new String[10];
    static String[][] matriz = new String[4][4];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            System.out.print("Elige la opcion que desees realizar : ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1 -> calcularAreaCirculo();
                case 2 -> ingresarArray();
                case 3 -> mostrarArray();
                case 4 -> mostrarArrayPosicion();
                case 5 -> ingresarMatriz();
                case 6 -> mostrarMatriz();
                case 7 -> mostrarMatrizPosicion();
                case 8 -> System.out.println("has finalizado");
                default -> System.out.println("Opcion no valida, intenta otra vez.");
            }
        } while (opcion != 8);
    }

    static void mostrarMenu() {
        System.out.println(" _____ Menu____ ");
        
        System.out.println("  MOISES MAGALLANES - ROMARIO SANCHEZ");
        
        System.out.println("1. Calcular area de un circulo");
        
        System.out.println("2. Ingresar datos al array");
        
        System.out.println("3. Ver todos los datos del array");
        
        System.out.println("4. Ver un dato específico del array");
        
        System.out.println("5. Ingresar datos a la matriz");
        
        System.out.println("6. Ver todos los datos de la matriz");
        
        System.out.println("7. Ver un dato específico de la matriz");
        
        System.out.println("8. Salir");
    }

    static void calcularAreaCirculo() {
        System.out.print("Ingresa el radio del circulo: ");
        double radio = Double.parseDouble(sc.nextLine());
        double area = Math.PI * radio * radio;
        System.out.printf("Area del circulo: %.2f\n", area);
    }

    static void ingresarArray() {
        System.out.println("Ingresando datos al array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Posición " + i + ": ");
            array[i] = sc.nextLine();
        }
    }

    static void mostrarArray() {
        System.out.println("Contenido del array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "] = " + array[i]);
        }
    }

    static void mostrarArrayPosicion() {
        System.out.print("¿Que posicion del array quieres ver? (0-9): ");
        int pos = Integer.parseInt(sc.nextLine());
        if (pos >= 0 && pos < array.length)
            System.out.println("Valor en posicion " + pos + ": " + array[pos]);
        else
            System.out.println("Posicióo invalida.");
    }

    static void ingresarMatriz() {
        System.out.println("Ingresando datos a la matriz:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Posicion [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextLine();
            }
        }
    }

    static void mostrarMatriz() {
        System.out.println("Contenido de la matriz:");
        for (String[] fila : matriz) {
            for (String dato : fila) {
                System.out.print((dato != null ? dato : " ") + "\t");
            }
            System.out.println();
        }
    }

    static void mostrarMatrizPosicion() {
        System.out.print("Fila (0-3): ");
        int f = Integer.parseInt(sc.nextLine());
        System.out.print("Columna (0-3): ");
        int c = Integer.parseInt(sc.nextLine());

        if (f >= 0 && f < 4 && c >= 0 && c < 4)
            System.out.println("Valor en [" + f + "][" + c + "]: " + matriz[f][c]);
        else
            System.out.println("Coordenadas fuera de rango.");
    }
}



    
    

