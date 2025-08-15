package ui;

import model.Rol;
import service.GestorUser;
public class App  {
    public static void main(String[] args)  {
    GestorUser gestor = new GestorUser();

while (true) {
  

    if (GestorUser.getUsuarioActual() == null) {   
 gestor.menuPrincipal();
 }
 if (GestorUser.getUsuarioActual() == null) {
  continue;
                }

  if (GestorUser.getUsuarioActual().getRol().equals(Rol.ADMIN)) {
    
    gestor.menuAdmin();}

  else{
    gestor.menuEstandar();
}
}
}}
