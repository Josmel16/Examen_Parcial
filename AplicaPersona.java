package ArreglodeO;

import java.util.Scanner;

public class AplicaPersona {

    static ArregloPersona arreglo;
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        MenuCola();
    }

    static void crearArreglo() {
        int tam;
        System.out.println("Ingrese tamaño del Arreglo: ");
        tam = teclado.nextInt();
        arreglo = new ArregloPersona(tam);
        System.out.println("Arreglo Creado...");
    }

    public static void MenuCola() {
        int opcion;
        do {
            System.out.println("\n===============");
            System.out.println(" Menu de opciones ");
            System.out.println("=================");
            System.out.println("[1] Crear arreglo");
            System.out.println("=================");
            System.out.println("[2] Ingresar datos");
            System.out.println("[3] Mostar datos");
            System.out.println("[4] Elimanr datos");
            System.out.println("[5] Buscar datos");
            System.out.println("[6] Buscar elemento a eliminar");
            System.out.println("[0] Salir");
            System.out.println("=================");

            System.out.println("Ingrese una alternativa: ");
            opcion = teclado.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    crearArreglo();
                    break;
                case 2:
                    arreglo.InsertarDatos();
                    break;
                case 3:
                    arreglo.mostrar();
                    break;
                case 4:
                    arreglo.eliminar();
                    break;
                case 5: {
                    String bus;
                     System.out.print("Ingrese codigo: ");
                     teclado.nextLine();
                     bus = teclado.nextLine();
                    arreglo.Busqueda(bus);
                }
                break;
                case 6: {
                    String bus;
                    System.out.println("Ingrese Codigo");
                    teclado.nextLine();
                    bus = teclado.nextLine();
                    arreglo.eliminarBus(bus);
                }
                break;
                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Ingrese una opcion Correrta...");
                    break;
            }
        } while (true);
    }
}
