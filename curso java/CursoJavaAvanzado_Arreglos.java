import java.util.Arrays;

public class Arreglos {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i * 2;
        }
        
        System.out.println("Arreglo de números:");
        System.out.println(Arrays.toString(numeros));
        
        String[][] matriz = {
            {"A", "B", "C"},
            {"D", "E", "F"},
            {"G", "H", "I"}
        };
        
        System.out.println("\nMatriz de strings:");
        for (String[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }
    }
}

