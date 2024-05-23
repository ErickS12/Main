package com.mycompany.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private final String nombre;
    private final String telefono;
    private final List<Mesa> mesas;
    private final List<Empleado> empleados;
    private final Menu menu;

    private static final int maxMeseros = 4;
    private static final int maxCocineros = 4;
    private static final int maxMesas = 5;

    public Main(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.mesas = new ArrayList<>();
        this.empleados = new ArrayList<>();
        this.menu = new Menu();
    }

    public void consultarDatosEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados en el restaurante.");
        } else {
            System.out.println("Empleados del restaurante:");
            for (Empleado empleado : empleados) {
                empleado.mostrarDatos();
            }
        }
        System.out.println("Presione Enter para volver al menú principal...");
        new Scanner(System.in).nextLine();
    }

    public void consultarMesas() {
        if (mesas.isEmpty()) {
            System.out.println("No hay mesas registradas en el restaurante.");
        } else {
            System.out.println("Mesas del restaurante:");
            for (Mesa mesa : mesas) {
                mesa.mostrarDatosMesa();
            }
        }
        System.out.println("Presione Enter para volver al menú principal...");
        new Scanner(System.in).nextLine();
    }

    public void registrarMesa() {
        if (mesas.size() >= maxMesas) {
            System.out.println("Ya se han registrado el número máximo de mesas (" + maxMesas + ").");
            return;
        }

        Mesa mesa = new Mesa(0, "", 0);
        mesa.registrarMesa();
        mesas.add(mesa);
    }

    public void editarMesa() {
        if (mesas.isEmpty()) {
            System.out.println("No hay mesas registradas en el restaurante.");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mesas del restaurante:");
        for (int i = 0; i < mesas.size(); i++) {
            System.out.println((i + 1) + ". Mesa número: " + mesas.get(i).getNumero());
        }
        System.out.println("Seleccione el número de la mesa que desea editar:");
        int opcion = scanner.nextInt();
        if (opcion > 0 && opcion <= mesas.size()) {
            Mesa mesa = mesas.get(opcion - 1);
            mesa.editarMesa();
        } else {
            System.out.println("Opción inválida.");
        }
    }

    public void consultarCombos() {
        menu.mostrarCombos();
        System.out.println("Presione Enter para volver al menú principal...");
        new Scanner(System.in).nextLine();
    }

    public void registrarCombo() {
        menu.agregarCombo();
    }

    public void editarCombo() {
        menu.editarCombo();
    }

    public void contratarMesero() {
        long countMeseros = empleados.stream().filter(e -> e instanceof Mesero).count();
        if (countMeseros >= maxMeseros) {
            System.out.println("Ya se han contratado el número máximo de meseros (" + maxMeseros + ").");
            return;
        }
        Mesero mesero = new Mesero("", 0, "", 0, "", "", 0, "", 0);
        mesero.registrarMesero();
        empleados.add(mesero);
    }

    public void contratarCocinero() {
        long countCocineros = empleados.stream().filter(e -> e instanceof Cocinero).count();
        if (countCocineros >= maxCocineros) {
            System.out.println("Ya se han contratado el número máximo de cocineros (" + maxCocineros + ").");
            return;
        }
        Cocinero cocinero = new Cocinero("", 0, "", 0, "", "", "", "", 0);
        cocinero.registrarCocinero();
        empleados.add(cocinero);
    }

    public void editarMeseros() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Editar información de meseros ***");
        if (empleados.isEmpty()) {
            System.out.println("No hay meseros registrados en el restaurante.");
            return;
        }
        System.out.println("Meseros disponibles para editar:");
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i) instanceof Mesero) {
                System.out.println((i + 1) + ". " + empleados.get(i).getNombre());
            }
        }
        System.out.println("Seleccione el número de mesero que desea editar:");
        int opcion = scanner.nextInt();
        if (opcion > 0 && opcion <= empleados.size()) {
            Mesero mesero = (Mesero) empleados.get(opcion - 1);
            mesero.editarMesero();
        } else {
            System.out.println("Opción inválida.");
        }
    }

    public void editarCocineros() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Editar información de cocineros ***");
        if (empleados.isEmpty()) {
            System.out.println("No hay cocineros registrados en el restaurante.");
            return;
        }
        System.out.println("Cocineros disponibles para editar:");
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i) instanceof Cocinero) {
                System.out.println((i + 1) + ". " + empleados.get(i).getNombre());
            }
        }
        System.out.println("Seleccione el número de cocinero que desea editar:");
        int opcion = scanner.nextInt();
        if (opcion > 0 && opcion <= empleados.size()) {
            Cocinero cocinero = (Cocinero) empleados.get(opcion - 1);
            cocinero.editarCocinero();
        } else {
            System.out.println("Opción inválida.");
        }
    }
    
    public void editarEmpleadoGeneral() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("*** Editar información de empleados ***");
    if (empleados.isEmpty()) {
        System.out.println("No hay empleados registrados en el restaurante.");
        return;
    }
    System.out.println("Empleados disponibles para editar:");
    for (int i = 0; i < empleados.size(); i++) {
        System.out.println((i + 1) + ". " + empleados.get(i).getNombre());
    }
    System.out.println("Seleccione el número de empleado que desea editar:");
    int opcion = scanner.nextInt();
    if (opcion > 0 && opcion <= empleados.size()) {
        Empleado empleado = empleados.get(opcion - 1);
        empleado.editarEmpleado();
    } else {
        System.out.println("Opción inválida.");
    }
}

public void mostrarMenu() {
    Scanner scanner = new Scanner(System.in);
    int opcion;
    do {
        System.out.println("\n*** MENÚ PRINCIPAL ***");
        System.out.println("1. Consultar datos de empleados");
        System.out.println("2. Consultar mesas");
        System.out.println("3. Consultar combos del menú");
        System.out.println("4. Registrar nuevo combo");
        System.out.println("5. Editar combo existente");
        System.out.println("6. Registrar nueva mesa");
        System.out.println("7. Editar mesa existente");
        System.out.println("8. Contratar mesero");
        System.out.println("9. Contratar cocinero");
        System.out.println("10. Editar información de meseros");
        System.out.println("11. Editar información de cocineros");
        System.out.println("12. Editar información de empleados");
        System.out.println("13. Salir");
        System.out.print("Seleccione una opción: ");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1 -> consultarDatosEmpleados();
            case 2 -> consultarMesas();
            case 3 -> consultarCombos();
            case 4 -> registrarCombo();
            case 5 -> editarCombo();
            case 6 -> registrarMesa();
            case 7 -> editarMesa();
            case 8 -> contratarMesero();
            case 9 -> contratarCocinero();
            case 10 -> editarMeseros();
            case 11 -> editarCocineros();
            case 12 -> editarEmpleadoGeneral();
            case 13 -> System.out.println("Saliendo del programa...");
            default -> System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
        }
    } while (opcion != 13);
}

    public static void main(String[] args) {
        Main restaurante = new Main("Restaurante Noyolo", "224577391");
        restaurante.mostrarMenu();
    }
}
