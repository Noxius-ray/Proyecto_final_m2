import java.util.Scanner;



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
        2. Buscar Usuario
        3. Actualiar Datos
        4. Eliminar Usuario(Solo Admin)
        5. SALIR
    """);
    System.out.print("Seleccione una opción: ");
    opc = teclado.nextInt();
    teclado.nextLine();

    switch (opc) {
      case 1:
        gestor.iniciarSesion();
        break;
      case 2:
        gestor.buscarUsuario();
        break;
      case 3: 
        gestor.actualizar();
        break;
      case 4: 
        gestor.eliminarUsuario();
        break;
    
      default:
      System.out.println("OPCION NO VALIDA");
        break;
    }
    }while(opc!=5);
}
}
