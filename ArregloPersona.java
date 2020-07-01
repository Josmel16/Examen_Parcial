package ArreglodeO;

import java.util.Scanner;

public class ArregloPersona {

    static Scanner teclado = new Scanner(System.in);
    private int max;
    private int Frente;
    private int Final;
    int pos = 0;
    persona[] arreglo;
    persona per = new persona();

    public ArregloPersona(int max) {
        this.max = max;
        this.Frente = 0;
        this.Final = 0;
        this.arreglo = new persona[max + 1];
        for (int i = 0; i < this.max + 1; i++) {
            arreglo[i] = new persona();
        }

    }

    public boolean isArregloLleno() {
        if (this.Frente == this.max) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isArregloVacio() {
        if (this.Frente == Final) {
            return true;
        } else {
            return false;
        }
    }

    public void InsertarDatos() {

        if (this.isArregloLleno()) {
            System.out.println("El arreglo esta Lleno...");
        } else {

            System.out.println("Ingrese el Código de la persona : ");
            String codigo = teclado.next();

            System.out.println("Ingrese el Nombre de la persona : ");
            String nom = teclado.next();

            System.out.println("Ingrese la tarifa de " + nom + " : ");
            double trf = teclado.nextDouble();

            System.out.println("Ingrese la Hora de  " + nom + " : ");
            int hrs = teclado.nextInt();

            arreglo[pos].registrar(codigo, nom, hrs, trf);

            System.out.println("Se inserto el elemento  en la posicion\n" + (Final + 1));
            this.Frente++;
            pos++;

        }

    }

    public void mostrar() {
        if (this.isArregloVacio()) {
            System.out.println("El arreglo esta vacio no hay datos....");
        } else {
            for (int i = 0; i < Frente; i++) {
                arreglo[i].mostrarDatos();
            }
        }
    }

    public void eliminar() {
        if (this.isArregloVacio()) {
            System.out.println("El arreglo esta vacio no hay datos....");
        } else {
            Frente--;
            System.out.println("Se elimino a la persona");
        }
    }

    public void Busqueda(String cod) {

        if (isArregloVacio()) {
            System.out.println("El arreglo esta vacio no hay datos....");
        } else {
            for (int i = 0; i < Frente; i++) {

                if (cod.equals(arreglo[i].getCodigo())) {
                    arreglo[i].mostrarDatos();
                    break;
                } else {
                    System.out.println("no se encontro!!");
                }
            }
        }

    }
    
    public void eliminarBus(String cod){
        if (isArregloVacio()) {
            System.out.println("El arreglo esta vacio no hay datos....");
        } else {
            for (int i = 0; i < Frente; i++) {
                if (cod.equals(arreglo[i].getCodigo())) {
                    Frente--;
            System.out.println("Se elimino a la persona");
            break;
                }else{
                     System.out.println("no se encontro!!");
                }
                
            }
        }
    }
}
