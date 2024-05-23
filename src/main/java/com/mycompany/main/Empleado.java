package com.mycompany.main;

import java.util.Scanner;

public abstract class Empleado {
    private String nombre;
    private int edad;
    private String genero;
    private double salario;
    private String horario;
    private double numTelefono;

    public Empleado(String nombre, int edad, String genero, double salario, String horario, double numTelefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.salario = salario;
        this.horario = horario;
        this.numTelefono = numTelefono;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Género: " + getGenero());
        System.out.println("Salario: " + getSalario());
        System.out.println("Horario: " + getHorario());
        System.out.println("Número de teléfono: " + getNumTelefono());
    }

    public void registrarEmpleado() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado:");
        setNombre(scanner.nextLine());
        System.out.println("Ingrese la edad del empleado:");
        setEdad(scanner.nextInt());
        scanner.nextLine(); // Consumir la nueva línea después de nextInt
        System.out.println("Ingrese el género del empleado:");
        setGenero(scanner.nextLine());
        System.out.println("Ingrese el salario quincenal del empleado:");
        setSalario(scanner.nextDouble());
        scanner.nextLine(); // Consumir la nueva línea después de nextDouble
        System.out.println("Ingrese el horario del empleado (maturino/vespertino):");
        setHorario(scanner.nextLine());
        System.out.println("Ingrese el número de teléfono del empleado:");
        setNumTelefono(scanner.nextDouble());
    }

public void editarEmpleado() {
    Scanner scanner = new Scanner(System.in);
    boolean salir = false;

    do {
        System.out.println("*** Editar información del empleado ***");
        System.out.println("1. Editar nombre");
        System.out.println("2. Editar edad");
        System.out.println("3. Editar género");
        System.out.println("4. Editar salario");
        System.out.println("5. Editar horario");
        System.out.println("6. Editar número de teléfono");
        System.out.println("7. Salir");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea después de nextInt

        switch (opcion) {
            case 1:
                System.out.println("Editar nombre del empleado (actual: " + getNombre() + "):");
                setNombre(scanner.nextLine());
                break;
            case 2:
                System.out.println("Editar edad del empleado (actual: " + getEdad() + "):");
                setEdad(scanner.nextInt());
                scanner.nextLine(); // Consumir la nueva línea después de nextInt
                break;
            case 3:
                System.out.println("Editar género del empleado (actual: " + getGenero() + "):");
                setGenero(scanner.nextLine());
                break;
            case 4:
                System.out.println("Editar salario quincenal del empleado (actual: " + getSalario() + "):");
                setSalario(scanner.nextDouble());
                scanner.nextLine(); // Consumir la nueva línea después de nextDouble
                break;
            case 5:
                System.out.println("Editar horario del empleado (maturino/vespertino) (actual: " + getHorario() + "):");
                setHorario(scanner.nextLine());
                break;
            case 6:
                System.out.println("Editar número de teléfono del empleado (actual: " + getNumTelefono() + "):");
                setNumTelefono(scanner.nextInt());
                scanner.nextLine(); // Consumir la nueva línea después de nextInt
                break;
            case 7:
                salir = true;
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                break;
        }
    } while (!salir);
}

// Getters y setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    public double getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(double numTelefono) {
        this.numTelefono = numTelefono;
    }
}
