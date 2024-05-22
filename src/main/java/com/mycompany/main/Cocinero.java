
package com.mycompany.main;

import java.util.Scanner;

public class Cocinero extends Empleado {
    private String rango;
    private String especialidad;
    private float anosDeExperiencia;

    public Cocinero(String nombre, int edad, String genero, double salario, String horario, int numTelefono, String rango, String especialidad, float anosDeExperiencia) {
        super(nombre, edad, genero, salario, horario, numTelefono);
        this.rango = rango;
        this.especialidad = especialidad;
        this.anosDeExperiencia = anosDeExperiencia;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Rango: " + rango);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Años de Experiencia: " + anosDeExperiencia);
    }

    public void registrarCocinero() {
        Scanner scanner = new Scanner(System.in);
        super.registrarEmpleado(); // Utiliza el método de la clase padre para registrar datos comunes
        System.out.println("Ingrese el rango del cocinero:");
        rango = scanner.nextLine();
        System.out.println("Ingrese la especialidad del cocinero:");
        especialidad = scanner.nextLine();
        System.out.println("Ingrese los años de experiencia del cocinero:");
        anosDeExperiencia = scanner.nextFloat();
    }

    public void editarCocinero() {
        Scanner scanner = new Scanner(System.in);
        super.editarEmpleado(); // Utiliza el método de la clase padre para editar datos comunes
        System.out.println("Editar rango del cocinero (actual: " + rango + "):");
        rango = scanner.nextLine();
        System.out.println("Editar especialidad del cocinero (actual: " + especialidad + "):");
        especialidad = scanner.nextLine();
        System.out.println("Editar años de experiencia del cocinero (actual: " + anosDeExperiencia + "):");
        anosDeExperiencia = scanner.nextFloat();
    }
}
