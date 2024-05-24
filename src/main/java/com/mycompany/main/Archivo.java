import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class Archivo {
    public static void crearArchivo(String nombreArchivo) {
        try {
            File archivo = new File(nombreArchivo);
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al crear el archivo.");
            e.printStackTrace();
        }
    }

    public static void escribirEnArchivo(String nombreArchivo, String contenido) {
        try {
            FileWriter escritor = new FileWriter(nombreArchivo, true); // El segundo parámetro true indica que se agregará contenido al final del archivo
            escritor.write(contenido + "\n"); // Agregar una nueva línea para separar los combos
            escritor.close();
            System.out.println("Contenido agregado al archivo.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo.");
            e.printStackTrace();
        }
    }

    public static void leerArchivo(String nombreArchivo) {
        try {
            File archivo = new File(nombreArchivo);
            BufferedReader lector = new BufferedReader(new FileReader(archivo));
            String linea;
            System.out.println("Combos guardados en el archivo:");
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
            lector.close();
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo.");
            e.printStackTrace();
        }
    }
}

