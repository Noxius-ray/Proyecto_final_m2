package model;



public class Acciones {
    private String descripcion;
    private long fechaActual = System.currentTimeMillis();

    public Acciones(String descripcion, long fechaActual) {
        this.descripcion = descripcion;
        this.fechaActual = fechaActual;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public long getFechaactual() {
        return fechaActual;
    }
  
    
    public String toString() {
        return String.format("Fecha y hora: %tc" , fechaActual ) + " - " + descripcion;
    }
}
 

