import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        List<Integer> pares = numeros.stream()
                                     .filter(n -> n % 2 == 0)
                                     .collect(Collectors.toList());
        System.out.println("Números pares: " + pares);
        
        List<Integer> cuadrados = numeros.stream()
                                         .map(n -> n * n)
                                         .collect(Collectors.toList());
        System.out.println("Cuadrados: " + cuadrados);
        
        int suma = numeros.stream()
                          .reduce(0, (a, b) -> a + b);
        System.out.println("Suma de todos los números: " + suma);
    }
}

