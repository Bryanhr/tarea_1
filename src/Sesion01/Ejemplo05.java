package Sesion01;

import javax.swing.JOptionPane;

/**
 *
 * @author bryan
 */
public class Ejemplo05 {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese tu nombre: ");
        String apaterno = JOptionPane.showInputDialog("Ingrese tu apellido paterno: ");
        String amaterno = JOptionPane.showInputDialog("Ingrese tu apellido materno: ");
        
        JOptionPane.showMessageDialog(null, "Estimado " + nombre + " " + apaterno + " " + amaterno);
    }
}
