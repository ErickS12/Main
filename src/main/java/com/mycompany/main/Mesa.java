package com.mycompany.main;

import java.util.Scanner;

public class Mesa {
    private int numero;
    private String estado;
    private int capacidad;

    public Mesa(int numero, String estado, int capacidad) {
        this.numero = numero;
        this.estado = estado;
        this.capacidad = capacidad;
    }

    public void mostrarDatosMesa() {
        System.out.println("Número de Mesa: " + numero);
        System.out.println("Estado: " + estado);
        System.out.println("Capacidad: " + capacidad + " personas");
    }

    // Método para registrar los datos de una mesa
    public void registrarMesa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de mesa:");
        numero = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea después de nextInt
        System.out.println("Ingrese el estado de la mesa:");
        estado = scanner.nextLine();
        System.out.println("Ingrese la capacidad de la mesa:");
        capacidad = scanner.nextInt();
    }

    // Método para editar los datos de una mesa
    public void editarMesa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Editar número de mesa (actual: " + numero + "):");
        numero = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea después de nextInt
        System.out.println("Editar estado de la mesa (actual: " + estado + "):");
        estado = scanner.nextLine();
        System.out.println("Editar capacidad de la mesa (actual: " + capacidad + " personas):");
        capacidad = scanner.nextInt();
    }

    // Getters y Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
