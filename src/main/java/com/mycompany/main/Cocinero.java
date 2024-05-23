
package com.mycompany.main;
import java.util.Scanner;

public class Cocinero extends Empleado {
    private String rango;
    private String especialidad;
    private float anosDeExperiencia;

    public Cocinero(String nombre, int edad, String genero, double salario, String horario, String numTelefono, String rango, String especialidad, float anosDeExperiencia) {
        super(nombre, edad, genero, salario, horario, numTelefono);
        this.rango = rango;
        this.especialidad = especialidad;
        this.anosDeExperiencia = anosDeExperiencia;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Rango: " + getRango());
        System.out.println("Especialidad: " + getEspecialidad());
        System.out.println("Años de Experiencia: " + getAnosDeExperiencia());
    }

    public void registrarCocinero() {
        Scanner scanner = new Scanner(System.in);
        super.registrarEmpleado(); // Utiliza el método de la clase padre para registrar datos comunes
        System.out.println("Ingrese el rango del cocinero:");
        setRango(scanner.nextLine());
        System.out.println("Ingrese la especialidad del cocinero:");
        setEspecialidad(scanner.nextLine());
        System.out.println("Ingrese los años de experiencia del cocinero:");
        setAnosDeExperiencia(scanner.nextFloat());
    }

public void editarCocinero() {
    Scanner scanner = new Scanner(System.in);
    boolean salir = false;

    do {
        System.out.println("*** Editar información del cocinero ***");
        System.out.println("1. Editar rango");
        System.out.println("2. Editar especialidad");
        System.out.println("3. Editar años de experiencia");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea después de nextInt

        switch (opcion) {
            case 1:
                System.out.println("Editar rango del cocinero (actual: " + getRango() + "):");
                setRango(scanner.nextLine());
                break;
            case 2:
                System.out.println("Editar especialidad del cocinero (actual: " + getEspecialidad() + "):");
                setEspecialidad(scanner.nextLine());
                break;
            case 3:
                System.out.println("Editar años de experiencia del cocinero (actual: " + getAnosDeExperiencia() + "):");
                setAnosDeExperiencia(scanner.nextFloat());
                scanner.nextLine(); // Consumir la nueva línea después de nextFloat
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

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public float getAnosDeExperiencia() {
        return anosDeExperiencia;
    }

    public void setAnosDeExperiencia(float anosDeExperiencia) {
        this.anosDeExperiencia = anosDeExperiencia;
    }
}

       
   
   
