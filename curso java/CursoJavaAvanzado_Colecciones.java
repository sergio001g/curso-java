import java.util.*;

public class Colecciones {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Manzana");
        lista.add("Banana");
        lista.add("Cereza");
        System.out.println("Lista: " + lista);
        
        Set<Integer> conjunto = new HashSet<>();
        conjunto.add(1);
        conjunto.add(2);
        conjunto.add(2);
        conjunto.add(3);
        System.out.println("Conjunto: " + conjunto);
        
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("Uno", 1);
        mapa.put("Dos", 2);
        mapa.put("Tres", 3);
        System.out.println("Mapa: " + mapa);
        
        for (String clave : mapa.keySet()) {
            System.out.println(clave + " = " + mapa.get(clave));
        }
    }
}

