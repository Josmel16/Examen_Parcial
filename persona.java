package ArreglodeO;

public class persona {

    private String codigo, nombre;
    private double tarifa;
    private int horas;
    
    public persona(){
        
    }

    
    public void registrar(String cod,String nom ,int hrs,double trf){
        this.codigo=cod;
        this.nombre=nom;
        this.tarifa=trf;
        this.horas=hrs;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    public double hallarSueldo(){
        double sueldo;
        sueldo=(tarifa*horas);
        return sueldo;
    }
     
     public void mostrarSueldo(){
        System.out.println("Promedio: "+hallarSueldo());
    }
 
    public void mostrarDatos(){
        System.out.println("\nCodigo = "+codigo);
        System.out.println("Nombre = "+nombre);
        System.out.println("Tarifa = "+tarifa);
        System.out.println("Hora = "+horas);
        System.out.println("Sueldo al dia es= "+hallarSueldo());
        System.out.println("Sueldo mencial (30 dias trabajados) = " + hallarSueldo()*30);
    }

   
}
