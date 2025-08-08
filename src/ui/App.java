package ui;

import model.Rol;
import service.GestorUser;
public class App  {
    public static void main(String[] args)  {
    GestorUser gestor = new GestorUser();

while (true) {
  

    if (GestorUser.usuarioActual == null) {   
 gestor.menuPrincipal();
 }
 if (GestorUser.usuarioActual == null) {
  continue;
                }

  if (GestorUser.usuarioActual.getRol().equals(Rol.ADMIN)) {
    
    gestor.menuAdmin();}

  else{
    gestor.menuEstandar();
}
}
}}
