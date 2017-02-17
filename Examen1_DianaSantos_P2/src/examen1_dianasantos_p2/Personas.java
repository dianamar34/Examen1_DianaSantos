
package examen1_dianasantos_p2;


public class Personas {
    protected String nombre;
    protected int edad;
    protected String ID;
    protected String  IDBoleto;
    protected String depto;
    protected int dinero;

    public Personas() {
    }

    public Personas(String nombre, int edad, String ID, String IDBoleto, String depto, int dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.ID = ID;
        this.IDBoleto = IDBoleto;
        this.depto = depto;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getIDBoleto() {
        return IDBoleto;
    }

    public void setIDBoleto(String IDBoleto) {
        this.IDBoleto = IDBoleto;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return  nombre + ID + depto +  IDBoleto ;
    }
    
    
}
