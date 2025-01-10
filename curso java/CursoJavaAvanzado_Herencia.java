class Animal {
    String nombre;
    
    Animal(String nombre) {
        this.nombre = nombre;
    }
    
    void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {
    Perro(String nombre) {
        super(nombre);
    }
    
    @Override
    void hacerSonido() {
        System.out.println(nombre + " hace: Guau guau!");
    }
    
    void moverCola() {
        System.out.println(nombre + " mueve la cola");
    }
}

class Gato extends Animal {
    Gato(String nombre) {
        super(nombre);
    }
    
    @Override
    void hacerSonido() {
        System.out.println(nombre + " hace: Miau miau!");
    }
    
    void arañar() {
        System.out.println(nombre + " araña el sofá");
    }
}

public class Herencia {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal genérico");
        animal.hacerSonido();
        
        Perro perro = new Perro("Firulais");
        perro.hacerSonido();
        perro.moverCola();
        
        Gato gato = new Gato("Michi");
        gato.hacerSonido();
        gato.arañar();
    }
}

