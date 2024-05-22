package com.mycompany.main;

import java.util.Scanner;

public abstract class Empleado {
    protected String nombre;
    protected int edad;
    protected String genero;
    protected double salario;
    protected String horario;
    protected int numTelefono;

    public Empleado(String nombre, int edad, String genero, double salario, String horario, int numTelefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.salario = salario;
        this.horario = horario;
        this.numTelefono = numTelefono;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Género: " + genero);
        System.out.println("Salario: " + salario);
        System.out.println("Horario: " + horario);
        System.out.println("Número de teléfono: " + numTelefono);
    }

    public void registrarEmpleado() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado:");
        nombre = scanner.nextLine();
        System.out.println("Ingrese la edad del empleado:");
        edad = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea después de nextInt
        System.out.println("Ingrese el género del empleado:");
        genero = scanner.nextLine();
        System.out.println("Ingrese el salario del empleado:");
        salario = scanner.nextDouble();
        scanner.nextLine(); // Consumir la nueva línea después de nextDouble
        System.out.println("Ingrese el horario del empleado:");
        horario = scanner.nextLine();
        System.out.println("Ingrese el número de teléfono del empleado:");
        numTelefono = scanner.nextInt();
    }

    public void editarEmpleado() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Editar nombre del empleado (actual: " + nombre + "):");
        nombre = scanner.nextLine();
        System.out.println("Editar edad del empleado (actual: " + edad + "):");
        edad = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea después de nextInt
        System.out.println("Editar género del empleado (actual: " + genero + "):");
        genero = scanner.nextLine();
        System.out.println("Editar salario del empleado (actual: " + salario + "):");
        salario = scanner.nextDouble();
        scanner.nextLine(); // Consumir la nueva línea después de nextDouble
        System.out.println("Editar horario del empleado (actual: " + horario + "):");
        horario = scanner.nextLine();
        System.out.println("Editar número de teléfono del empleado (actual: " + numTelefono + "):");
        numTelefono = scanner.nextInt();
    }
}
