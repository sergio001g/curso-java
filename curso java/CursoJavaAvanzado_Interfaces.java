interface Volador {
    void volar();
    void aterrizar();
}

interface Nadador {
    void nadar();
    void sumergir();
}

class Pato implements Volador, Nadador {
    public void volar() {
        System.out.println("El pato vuela");
    }
    
    public void aterrizar() {
        System.out.println("El pato aterriza en el agua");
    }
    
    public void nadar() {
        System.out.println("El pato nada en la superficie");
    }
    
    public void sumergir() {
        System.out.println("El pato se sumerge para buscar comida");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Pato pato = new Pato();
        pato.volar();
        pato.aterrizar();
        pato.nadar();
        pato.sumergir();
    }
}

