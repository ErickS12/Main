package com.mycompany.main;

import java.util.Scanner;

public class Mesero extends Empleado {
    private int numDeMesas;
    private String quejas;
    private double propinas;
    
    private static int maxMesas = 3;

    public Mesero(String nombre, int edad, String genero, double salario, String horario, String numTelefono, int numDeMesas, String quejas, double propinas) {
        super(nombre, edad, genero, salario, horario, numTelefono);
        this.numDeMesas = numDeMesas;
        this.quejas = quejas;
        this.propinas = propinas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Número de Mesas: " + getNumDeMesas());
        System.out.println("Quejas: " + getQuejas());
        System.out.println("Propinas: " + getPropinas());
    }

    public void registrarMesero() {
        Scanner scanner = new Scanner(System.in);
        super.registrarEmpleado(); // Utiliza el método de la clase padre para registrar datos comunes
        do{
        System.out.println("Ingrese el número de mesas del mesero:");
            setNumDeMesas(scanner.nextInt());
        if( getNumDeMesas() < 1 || getNumDeMesas() > getMaxMesas()){
         System.out.println("Número de mesas inválido. Debe ser entre 1 y " + getMaxMesas() + "."); 
        }
        } while (getNumDeMesas() < 1 || getNumDeMesas() > getMaxMesas());
        scanner.nextLine(); // Consumir la nueva línea después de nextInt
        System.out.println("Ingrese las quejas del mesero:");
        setQuejas(scanner.nextLine());
        System.out.println("Ingrese las propinas del mesero:");
        setPropinas(scanner.nextDouble());
    }

public void editarMesero() {
    Scanner scanner = new Scanner(System.in);
    boolean salir = false;

    do {
        System.out.println("*** Editar información del mesero ***");
        System.out.println("1. Editar número de mesas");
        System.out.println("2. Editar quejas");
        System.out.println("3. Editar propinas");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea después de nextInt

        switch (opcion) {
            case 1:
                System.out.println("Editar número de mesas del mesero (actual: " + getNumDeMesas() + "):");
                setNumDeMesas(scanner.nextInt());
                scanner.nextLine(); // Consumir la nueva línea después de nextInt
                break;
            case 2:
                System.out.println("Editar quejas del mesero (actual: " + getQuejas() + "):");
                setQuejas(scanner.nextLine());
                break;
            case 3:
                System.out.println("Editar propinas del mesero (actual: " + getPropinas() + "):");
                setPropinas(scanner.nextDouble());
                scanner.nextLine(); // Consumir la nueva línea después de nextDouble
                break;
            case 4:
                salir = true;
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                break;
        }
    } while (!salir);
}

    public int getNumDeMesas() {
        return numDeMesas;
    }

    public void setNumDeMesas(int numDeMesas) {
        this.numDeMesas = numDeMesas;
    }

    public String getQuejas() {
        return quejas;
    }

    public void setQuejas(String quejas) {
        this.quejas = quejas;
    }

    public double getPropinas() {
        return propinas;
    }

    public void setPropinas(double propinas) {
        this.propinas = propinas;
    }

    public static int getMaxMesas() {
        return maxMesas;
    }

    public static void setMaxMesas(int aMaxMesas) {
        maxMesas = aMaxMesas;
    }
}

