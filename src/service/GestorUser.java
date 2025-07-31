package service;

import java.util.Scanner;

import model.Rol;
import model.User;

public class GestorUser {

public static Scanner teclado = new Scanner(System.in);

   User usuario1 = new User("Pedro Barreto", "1", "Pedrito", "12345", Rol.ADMIN );
    User usuario2 = new User("Sebastian Mena", "2", "Juanse", "123456", Rol.ESTANDAR);
    User[] usuario = new User[]{usuario1, usuario2};
    
  
    public void buscarUsuario(){
         
        boolean encontrado= false;
        System.out.print("Ingrese el id del usuario: ");
        var validacionId = teclado.nextLine();


    for (int i = 0; i < usuario.length; i++) {
    if(usuario[i].getId().equals(validacionId)){
    System.out.println("Usuario Encontrado");
    System.out.println(usuario[i].toString());
    encontrado=true;
    break;}}
    if (!encontrado) {
    System.out.println("Usuario no encontrado");
   }}
     public void actualizar(){
       
        System.out.print("Ingrese el id del usuario: ");
        var validacionId = teclado.nextLine();
        
    for (int i = 0; i < usuario.length; i++) {
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
        }}
   }

   public void eliminarUsuario(){
  
       
    
   }
}
   
  
         

            
        
    



