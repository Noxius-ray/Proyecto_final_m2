package service;

import java.util.Scanner;



import model.Rol;
import model.User;

public class GestorUser {

public static Scanner teclado = new Scanner(System.in);
public static User usuarioActual;
public static User usuario[];
public static int cont = 0;
public static User usuario1 = new User("Pedro Barreto", "1", "Pedrito", "12345", Rol.ADMIN );
 

  static {
 usuario = new User[50];
 usuario[0] = usuario1;
        cont = 1;
}
    public void agregarUsuarios(){

        System.out.println("=== Registro de nuevo usuario ===");
    
    System.out.print("Ingrese el nombre completo: ");
    String nombre = teclado.nextLine();
    
    System.out.print("Ingrese el ID: ");
    String id = teclado.nextLine();
    
    System.out.print("Ingrese el nombre de usuario: ");
    String usuarioNombre = teclado.nextLine();

    System.out.print("Ingrese la contraseña: ");
    String contraseña = teclado.nextLine();
    
    System.out.print("Seleccione el rol (1 para ADMIN, 2 para ESTANDAR): ");
    int rolSeleccionado = teclado.nextInt();
    teclado.nextLine(); 

    Rol rol = (rolSeleccionado == 1) ? Rol.ADMIN : Rol.ESTANDAR;

    usuario[cont] = new User(nombre, id, usuarioNombre, contraseña, rol);
    cont++;
    System.out.println("Usuario agregado con exito");
    }


   

    public User iniciarSesion(){
       
        boolean encontrado = false;
        System.out.print("Ingrese el usuario: ");
        var username = teclado.nextLine();

        System.out.print("Ingrese la contraseña: ");
        var password = teclado.nextLine();

        for (int i = 0; i < cont; i++) {
            if(usuario[i].getUsuario().equals(username) && usuario[i].getContraseña().equals(password)){
        System.out.println("Se ha iniciado la sesion correctamente");
        System.out.println("Nombre del usuario: "+usuario[i].getNombreCompleto());
        encontrado = true;
        usuarioActual = usuario[i];
        return usuario[i];}}
        if(!encontrado){
       System.out.println("Usuario o contraseña ingresado incorrectamente");
        }
    return null;
    }
  
    public void buscarUsuario(){
         
     if(usuarioActual.getRol().equals(Rol.ADMIN))  {
        boolean encontrado= false;
        System.out.print("Ingrese el id del usuario: ");
        var validacionId = teclado.nextLine();

    for (int i = 0; i < cont; i++) {
    if(usuario[i].getId().equals(validacionId)){
    System.out.println("Usuario Encontrado");
    System.out.println(usuario[i].toString());
    encontrado=true;
    break;}}
    if (!encontrado) {
    System.out.println("Usuario no encontrado");
   }}
   else{
    System.out.println("Informacion del usuario");
    System.out.println(usuarioActual.toString());
   }
}
   //Metodo Actualizar
     public void actualizar(){
       
        if (usuarioActual.getRol().equals(Rol.ADMIN)) {
        System.out.print("Ingrese el id del usuario: ");
        var validacionId = teclado.nextLine();
        
    for (int i = 0; i < cont; i++) {
    if(usuario[i].getId().equals(validacionId)){
        System.out.print("Selecione 1 para cambiar nombre y 2 para cambiar contraseña: ");
        var opc = teclado.nextInt();
        teclado.nextLine();
        switch (opc) {
            case 1:
                System.out.print("Ingrese el nuevo nombre: ");
                var nuevoNombre = teclado.nextLine();
                usuario[i].setNombreCompleto(nuevoNombre);
                break;
            case 2:
            var contraEncontrada = false;
            do{System.out.print("Ingrese contraseña para poder actualizar: ");
                var validacionContra = teclado.nextLine();
                
            if (usuario[i].getContraseña().equals(validacionContra)) {
                
            
                System.out.print("Ingrese nueva contraseña: ");
                var nuevaContraseña = teclado.nextLine();
                usuario[i].cambiarContraseña(nuevaContraseña);
                contraEncontrada=true;}}while (!contraEncontrada);break;
            }
        }}}
        else if (usuarioActual.getRol().equals(Rol.ESTANDAR)) {
        System.out.print("Selecione 1 para cambiar nombre y 2 para cambiar contraseña: ");
        var opc = teclado.nextInt();
        teclado.nextLine();
        switch (opc) {
            case 1:
                System.out.print("Ingrese el nuevo nombre: ");
                var nuevoNombre = teclado.nextLine();
                usuarioActual.setNombreCompleto(nuevoNombre);
                break;
            case 2:
            var contraEncontrada = false;
            do{System.out.print("Ingrese contraseña para poder actualizar: ");
                var validacionContra = teclado.nextLine();
                
            if (usuarioActual.getContraseña().equals(validacionContra)) {
                
            
                System.out.print("Ingrese nueva contraseña: ");
                var nuevaContraseña = teclado.nextLine();
                usuarioActual.setContraseña(nuevaContraseña);
                contraEncontrada=true;
    System.out.println("Datos actualizados del usuario:");
        System.out.println(usuarioActual.toString()); 
            }
        }while (!contraEncontrada);break;}
        
   }}

   public void eliminarUsuario(){
        System.out.print("Ingrese el id del usuario a eliminar: ");
        var validacionId = teclado.nextLine();
        
        boolean encontrado = false;
        for (int i = 0; i < cont; i++) {
            if(usuario[i].getId().equals(validacionId)){
                encontrado = true;
                for (int j = i; j < cont - 1; j++) {
                    usuario[j] = usuario[j + 1];
                }
                usuario[cont - 1] = null; 
                cont--;
                System.out.println("Usuario eliminado con éxito.");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Usuario no encontrado.");
        }
   }
   public void menuPrincipal(){
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
            iniciarSesion(); 
            break;
        case 2:
        break;
        case 3:
            System.exit(0); // Finaliza todo
            break;
        default:
            System.out.println("Opción no válida");
    }
} while(opc!=2);
   }
   public void menuAdmin(){
int sc;
boolean seguir = true;

     do {
    System.out.println("""
        MENU PRINCIPAL
        1. Crear Usuarios
        2. Buscar Usuario
        3. Actualiar Datos
        4. Eliminar Usuario
        5. Cerrar Sesion
        6. SALIR
    """);
    System.out.print("Seleccione una opción: ");
    sc = teclado.nextInt();
    teclado.nextLine();
    

    switch (sc) {
      case 1:
        agregarUsuarios();
        break;
      case 2: 
        buscarUsuario();
        break;
      case 3: 
        actualizar();
        break;
      case 4:
        eliminarUsuario();
        break;  
        case 5:
        cerrarSesion();
        seguir=false;
        break;
      case 6: 
      System.out.println("Gracias por usar el sistema");
      System.exit(0);
      
    
      default:
      System.out.println("OPCION NO VALIDA");
        break;
    }
}while(seguir);
}
  public void menuEstandar(){
    int sc;
    boolean seguir = true;

     do {
    System.out.println("""
        MENU PRINCIPAL
        1. Ver informacion
        2. Actualiar Datos
        3. Cerrar Sesion
        4. SALIR
    """);
    System.out.print("Seleccione una opción: ");
    sc = teclado.nextInt();
    teclado.nextLine();
    

    switch (sc) {
      
      case 1: 
        buscarUsuario();
        break;
      case 2: 
        actualizar();
        break;
        case 3:
        cerrarSesion();
        seguir = false;
        break;
      case 4: 
      System.out.println("Gracias por usar el sistema");
      System.exit(0);
    
      default:
      System.out.println("OPCION NO VALIDA");
        break;
    }
    }while(seguir);
  }
  public void cerrarSesion(){
    usuarioActual = null;
    System.out.println("Cerrando sesion. Volviendo al menu principal");
  }
  }
  
   

   
  
         

            
        
    



