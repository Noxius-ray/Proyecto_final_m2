package ui;


import model.Rol;
import service.GestorUser;
public class App  {
    public static void main(String[] args)  {
    GestorUser gestor = new GestorUser();

while (true) {
  

    if (gestor.usuarioActual == null) {   
 gestor.menuPrincipal();
 }
 if (gestor.usuarioActual == null) {
  continue;
                }

  if (gestor.usuarioActual.getRol().equals(Rol.ADMIN)) {
    
    gestor.menuAdmin();}

  else{
    gestor.menuEstandar();
}
}
}}
