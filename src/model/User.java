package model;

public class User {

    private String nombreCompleto;
    private String id;
    private String usuario;
    private String contraseña;
    private Rol rol;
    
    public User(String nombreCompleto, String id, String usuario, String contraseña, Rol rol) {
        this.nombreCompleto = nombreCompleto;
        this.id = id;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.rol = rol;
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
    return "User{" +
            "nombreCompleto='" + getNombreCompleto() + '\'' +
            ", id='" + getId() + '\'' +
            ", usuario='" + getUsuario() + '\'' +
            ", contraseña='" + getContraseña() + '\'' +
            ", rol=" + getRol() +
            '}';
}
  
}