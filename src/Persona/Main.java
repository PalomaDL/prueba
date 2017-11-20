package Persona;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setNombre(JOptionPane.showInputDialog(null, "ingrese nombre:"));
        persona1.setSexo(JOptionPane.showInputDialog(null, "ingrese sexo:"));
        persona1.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese edad:")));
        persona1.setRut(JOptionPane.showInputDialog(null, "ingrese rut:"));

        String nombre = persona1.getNombre();
        String sexo = persona1.getSexo();
        int edad = persona1.getEdad();
        String rut = persona1.getRut();

        System.out.println(nombre);
        System.out.println(sexo);
        System.out.println(edad);
        System.out.println(rut);
    }

}
