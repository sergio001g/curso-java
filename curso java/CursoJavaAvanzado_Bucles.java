public class Bucles {
    public static void main(String[] args) {
        System.out.println("Bucle for:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteración: " + i);
        }
        
        System.out.println("\nBucle while:");
        int j = 0;
        while (j < 5) {
            System.out.println("Mientras: " + j);
            j++;
        }
        
        System.out.println("\nBucle do-while:");
        int k = 0;
        do {
            System.out.println("Hacer mientras: " + k);
            k++;
        } while (k < 5);
        
        System.out.println("\nBucle for-each:");
        String[] frutas = {"Manzana", "Banana", "Cereza", "Durazno"};
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }
}

