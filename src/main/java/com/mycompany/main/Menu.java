package com.mycompany.main;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    private final List<Combo> combos;
    private final String archivoCombos = "combos.txt"; // Nombre del archivo para guardar los combos

    public Menu() {
        this.combos = new ArrayList<>();
    }

    public void agregarCombo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del combo:");
        String nombre = scanner.nextLine();

        double precio = obtenerPrecioCombo(scanner);

        Combo combo = new Combo(nombre, precio);
        combos.add(combo);
        System.out.println("El combo se ha agregado al menú.");

        // Guardar el combo en el archivo
        Archivo.escribirEnArchivo(archivoCombos, combo.toString());
    }

    // Método para obtener el precio del combo
    private double obtenerPrecioCombo(Scanner scanner) {
        double precio;
        while (true) {
            System.out.println("Ingrese el precio del combo:");
            try {
                precio = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: formato de precio incorrecto. Por favor, ingrese un número válido.");
            }
        }
        return precio;
    }

    public void editarCombo() {
        Scanner scanner = new Scanner(System.in);
        if (combos.isEmpty()) {
            System.out.println("No hay combos en el menú para editar.");
            return;
        }
        System.out.println("Combos en el menú:");
        for (int i = 0; i < combos.size(); i++) {
            System.out.println((i + 1) + ". " + combos.get(i).getNombre() + " - Precio: $" + combos.get(i).getPrecio());
        }
        System.out.println("Seleccione el número del combo que desea editar:");
        int opcion = scanner.nextInt();
        scanner.nextLine();
        if (opcion > 0 && opcion <= combos.size()) {
            Combo combo = combos.get(opcion - 1);
            System.out.println("Ingrese el nuevo nombre del combo:");
            String nuevoNombre = scanner.nextLine();
            double nuevoPrecio = obtenerPrecioCombo(scanner);
            combo.setNombre(nuevoNombre);
            combo.setPrecio(nuevoPrecio);
            System.out.println("El combo se ha editado correctamente.");

            // Actualizar el archivo con la información del combo editado
            Archivo.escribirEnArchivo(archivoCombos, combo.toString());
        } else {
            System.out.println("Opción inválida.");
        }
    }

    public void mostrarCombos() {
        if (combos.isEmpty()) {
            System.out.println("No hay combos en el menú.");
        } else {
            System.out.println("Combos en el menú:");
            for (int i = 0; i < combos.size(); i++) {
                System.out.println((i + 1) + ". " + combos.get(i).getNombre() + " - Precio: $" + combos.get(i).getPrecio());
            }
        }
    }
 }
