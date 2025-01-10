public class Operadores {
    public static void main(String[] args) {
        int a = 10, b = 5;
        
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        System.out.println("Módulo: " + (a % b));
        
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        
        System.out.println("AND lógico: " + (true && false));
        System.out.println("OR lógico: " + (true || false));
        System.out.println("NOT lógico: " + (!true));
    }
}

