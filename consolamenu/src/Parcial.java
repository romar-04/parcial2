
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Sala de Sistemas
 */
import java.util.Scanner;



public class Parcial{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] miArray = new double[10];
        double[][] miMatriz = new double[4][4]; 

        int opcion = 0;

        System.out.println("MOISES MAGALLANES - ROMARIO SANCHEZ  ");
           
        while (opcion != 8) {
            
            System.out.println("MENU  ");
            
            System.out.println("1. Calcular area del circulo");
            
            System.out.println("2. Ingresar datos al Array");
            
            System.out.println("3. Listar todos los datos del Array");
            
            System.out.println("4. Ver un dato especifico del Array");
            
            System.out.println("5. Ingresar datos a la matriz");
            
            System.out.println("6. Listar todos los datos de la matriz");
            
            System.out.println("7. Ver un dato especifico de la Matriz");
            
            System.out.println("8. Salir");
            
            System.out.print("Escriba su opcion: ");
            
            opcion = sc.nextInt();

           
            switch (opcion) {
                case 1:
                    System.out.print("Escriba el radio del circulo: ");
                    double radio = sc.nextDouble();
                    double area = Math.PI * radio * radio;
                    System.out.println("El area es: " + area);
                    break;

                case 2:
                    System.out.println("Ingresando datos al array...");
                    for (int i = 0; i < miArray.length; i++) {
                        System.out.print("Dato " + i + ": ");
                        miArray[i] = sc.nextDouble();
                    }
                    break;

                case 3:
                    System.out.println("Mostrando los datos del array:");
                    for (int i = 0; i < miArray.length; i++) {
                        System.out.println("Posición " + i + ": " + miArray[i]);
                    }
                    break;

                case 4:
                    System.out.print("Escriba la posicion (0 a 9): ");
                    int posArray = sc.nextInt();
                    if (posArray >= 0 && posArray < miArray.length) {
                        System.out.println("Dato en posicion " + posArray + ": " + miArray[posArray]);
                    } else {
                        System.out.println("Esa posicion no existe en el array.");
                    }
                    break;

                case 5:
                    System.out.println("Ingresando datos a la matriz ");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 4; j++) {
                            System.out.print("Dato en [" + i + "][" + j + "]: ");
                            miMatriz[i][j] = sc.nextDouble();
                        }
                    }
                    break;

                case 6:
                    System.out.println("Mostrando la matriz:");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 4; j++) {
                            System.out.print(miMatriz[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    break;

                case 7:
                    System.out.print("Fila (0 a 3): ");
                    int fila = sc.nextInt();
                    System.out.print("Columna (0 a 3): ");
                    int columna = sc.nextInt();
                    if (fila >= 0 && fila < 4 && columna >= 0 && columna < 4) {
                        System.out.println("Dato en [" + fila + "][" + columna + "]: " + miMatriz[fila][columna]);
                    } else {
                        System.out.println("Coordenadas fuera de rango.");
                    }
                    break;

                case 8:
                    System.out.println("Programa finalizado");
                    break;

                default:
                    System.out.println("Opción invalida, intenta de nuevo.");
            }
        }
    }
}