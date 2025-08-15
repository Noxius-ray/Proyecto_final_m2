package model;

public class User {

    private String nombreCompleto;
    private String id;
    private String usuario;
    private String contraseña;
    private Rol rol;
    private Acciones historial[];
    private int cont;
    
    public User(){
        
    }
    public User(String nombreCompleto, String id, String usuario, String contraseña, Rol rol) {
        this.nombreCompleto = nombreCompleto;
        this.id = id;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.rol = rol;
        this.historial = new Acciones[100];
        this.cont =0;
    }
    
    public void AgregarAcciones (String descripcion){
        if(cont < historial.length){
            historial[cont]= new Acciones(descripcion, System.currentTimeMillis());
            cont++;
        }
          else {
            System.out.println("Historial lleno para este usuario.");
        }
    }
     public void mostrarHistorial() {
        for (int i = 0; i < cont; i++) {
            System.out.println(historial[i]);
        }
    }


    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getId() {
        return id;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }
   
  public Rol getRol() {
        return rol;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
 
    public void cambiarContraseña(String nuevaContraseña) {
        if (this.rol==Rol.ADMIN) {
    this.contraseña = nuevaContraseña;
        }
    
    }
@Override
public String toString() {
    return "User: " +
            "Nombre Completo=" + getNombreCompleto() +
            ", Id=" + getId()  +
            ", Usuario=" + getUsuario() +
            ", Contraseña=" + getContraseña()  +
            ", Rol=" + getRol();
}
  
}