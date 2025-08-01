import java.util.Scanner;

import model.Rol;
import service.GestorUser;
public class App  {
    public static void main(String[] args)  {
    var teclado = new Scanner(System.in);
    GestorUser gestor = new GestorUser();
    

    int opc;

     do {
    System.out.println("""
        MENU PRINCIPAL
        1. Iniciar Sesion
        2. Para continuar
        3. Salir
    """);
    System.out.print("Seleccione una opción: ");
    opc = teclado.nextInt();
    teclado.nextLine();
    

    switch (opc) {
      case 1:
        gestor.iniciarSesion();
        break;
      case 3: 
      System.exit(0);
    }
    }while(opc!=2);
if (gestor.usuarioActual == null) {
    System.out.println("Debe iniciar sesión primero.");
    return;
}
  if (gestor.usuarioActual.getRol().equals(Rol.ADMIN)) {
    
    gestor.menuAdmin();}
  else{
    gestor.menuEstandar();
}
}
}
