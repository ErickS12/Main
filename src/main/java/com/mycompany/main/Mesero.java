package com.mycompany.main;

import java.util.Scanner;

public class Mesero extends Empleado {
    private int numDeMesas;
    private String quejas;
    private double propinas;
    
    private static final int maxMesas = 3;

    public Mesero(String nombre, int edad, String genero, double salario, String horario, int numTelefono, int numDeMesas, String quejas, double propinas) {
        super(nombre, edad, genero, salario, horario, numTelefono);
        this.numDeMesas = numDeMesas;
        this.quejas = quejas;
        this.propinas = propinas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Número de Mesas: " + numDeMesas);
        System.out.println("Quejas: " + quejas);
        System.out.println("Propinas: " + propinas);
    }

    public void registrarMesero() {
        Scanner scanner = new Scanner(System.in);
        super.registrarEmpleado(); // Utiliza el método de la clase padre para registrar datos comunes
        do{
        System.out.println("Ingrese el número de mesas del mesero:");
        numDeMesas = scanner.nextInt();
        if(numDeMesas < 1 || numDeMesas > maxMesas){
         System.out.println("Número de mesas inválido. Debe ser entre 1 y " + maxMesas + "."); 
        }
        } while (numDeMesas < 1 || numDeMesas > maxMesas);
        
        
        scanner.nextLine(); // Consumir la nueva línea después de nextInt
        System.out.println("Ingrese las quejas del mesero:");
        quejas = scanner.nextLine();
        System.out.println("Ingrese las propinas del mesero:");
        propinas = scanner.nextDouble();
    }

    public void editarMesero() {
        Scanner scanner = new Scanner(System.in);
        super.editarEmpleado(); // Utiliza el método de la clase padre para editar datos comunes
        System.out.println("Editar número de mesas del mesero (actual: " + numDeMesas + "):");
        numDeMesas = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea después de nextInt
        System.out.println("Editar quejas del mesero (actual: " + quejas + "):");
        quejas = scanner.nextLine();
        System.out.println("Editar propinas del mesero (actual: " + propinas + "):");
        propinas = scanner.nextDouble();
    }
}
