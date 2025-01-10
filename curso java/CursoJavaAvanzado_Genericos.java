class Contenedor<T> {
    private T contenido;
    
    public void setContenido(T contenido) {
        this.contenido = contenido;
    }
    
    public T getContenido() {
        return contenido;
    }
}

public class Genericos {
    public static void main(String[] args) {
        Contenedor<String> contenedorString = new Contenedor<>();
        contenedorString.setContenido("Hola, Generics!");
        System.out.println(contenedorString.getContenido());
        
        Contenedor<Integer> contenedorInteger = new Contenedor<>();
        contenedorInteger.setContenido(42);
        System.out.println(contenedorInteger.getContenido());
    }
}

