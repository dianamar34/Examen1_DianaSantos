
package examen1_dianasantos_p2;


public class Politicos extends Personas {
    private String partido;
    

    public Politicos() {
        super();
    }

    public Politicos(String partido, String nombre, int edad, String ID, String IDBoleto, String depto, int dinero) {
        super(nombre, edad, ID, IDBoleto, depto, dinero);
        this.partido = partido;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
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

    
    
}
