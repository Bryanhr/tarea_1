package Sesion01;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class Ejemplo04 {
    public static void main(String[] args) {
       Scanner equipo = new Scanner(System.in);
        System.out.println("Ingresa tu equipo favorito: ");
        
        String hincha = equipo.nextLine().toUpperCase();
        System.out.println(hincha + " Campeon 2026!!");
    }
}
