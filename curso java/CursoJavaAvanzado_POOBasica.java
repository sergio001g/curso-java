class Persona {
    String nombre;
    int edad;
    
    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    void presentarse() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }
}

public class POOBasica {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Ana", 25);
        persona1.presentarse();
        
        Persona persona2 = new Persona("Carlos", 30);
        persona2.presentarse();
    }
}

