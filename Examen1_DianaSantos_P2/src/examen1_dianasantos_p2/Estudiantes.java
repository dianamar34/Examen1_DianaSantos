
package examen1_dianasantos_p2;


public class Estudiantes extends Personas{
    private String carrera;

    public Estudiantes() {
        super();
    }

    public Estudiantes(String carrera, String nombre, int edad, String ID, String IDBoleto, String depto, int dinero) {
        super(nombre, edad, ID, IDBoleto, depto, dinero);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
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
        return "Estudiantes{" + "carrera=" + carrera + '}';
    }
    
    
    
}
