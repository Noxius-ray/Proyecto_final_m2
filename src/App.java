import service.GestorUser;
public class App {
    public static void main(String[] args) throws Exception {
    GestorUser gestor = new GestorUser();
      System.out.println("Gestión de Usuarios");
      System.out.println("=================================");
      System.out.println("Usuarios iniciales:");
      gestor.buscarUsuario();
      gestor.actualizar();
      gestor.eliminarUsuario();
      gestor.buscarUsuario();
      
    }
}
