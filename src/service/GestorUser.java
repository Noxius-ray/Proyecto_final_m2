package service;

import java.util.Scanner;

import model.Rol;
import model.User;

public class GestorUser {

    User usuario1 = new User("Pedro Barreto", "1", "Pedrito", "12345", Rol.ADMIN );
    User usuario2 = new User("Sebastian Mena", "2", "Juanse", "123456", Rol.ESTANDAR);
    User[] usuario = new User[]{usuario1, usuario2};
    
  
    public void buscarUsuario(){
        var teclado = new Scanner(System.in);
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
   }
    
}
    }



