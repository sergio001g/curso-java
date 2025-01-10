public class Funciones {
    public static void main(String[] args) {
        saludar("Juan");
        int suma = sumar(5, 3);
        System.out.println("Suma: " + suma);
        
        double promedio = calcularPromedio(85, 90, 78);
        System.out.println("Promedio: " + promedio);
        
        int factorial = calcularFactorial(5);
        System.out.println("Factorial de 5: " + factorial);
    }
    
    static void saludar(String nombre) {
        System.out.println("Hola, " + nombre);
    }
    
    static int sumar(int a, int b) {
        return a + b;
    }
    
    static double calcularPromedio(double... numeros) {
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }
    
    static int calcularFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calcularFactorial(n - 1);
    }
}

