import java.io.*;
import java.nio.file.*;

public class Archivos {
    public static void main(String[] args) {
        String contenido = "Hola, este es un archivo de prueba.\nEscrito desde Java.";
        String nombreArchivo = "archivo_prueba.txt";
        
        try {
            Files.write(Paths.get(nombreArchivo), contenido.getBytes());
            System.out.println("Archivo creado exitosamente.");
            
            String contenidoLeido = new String(Files.readAllBytes(Paths.get(nombreArchivo)));
            System.out.println("Contenido del archivo:");
            System.out.println(contenidoLeido);
        } catch (IOException e) {
            System.out.println("Error al manejar el archivo: " + e.getMessage());
        }
    }
}

