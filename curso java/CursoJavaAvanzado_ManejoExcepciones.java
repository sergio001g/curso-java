import java.util.Scanner;

public class ManejoExcepciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Ingrese un número: ");
            int numero = Integer.parseInt(scanner.nextLine());
            System.out.println("El número ingresado es: " + numero);
            
            System.out.print("Ingrese otro número para dividir: ");
            int divisor = Integer.parseInt(scanner.nextLine());
            int resultado = numero / divisor;
            System.out.println("El resultado de la división es: " + resultado);
        } catch (NumberFormatException e) {
            System.out.println("Error: Ingrese un número válido.");
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Fin del programa");
        }
    }
}

