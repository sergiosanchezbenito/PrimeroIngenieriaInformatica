package estadia;

public class Apartamento extends Alojamiento{
    // atributos
    int numeroHoteles;

    // constructor
    public Apartamento(String nombre, String direccion, double precio) {
        super(nombre, direccion, precio);
    }

    // getters
    public int getNumeroHoteles() {
        return numeroHoteles;
    }

    // toString

    @Override
    public String toString() {
        return "HOTEL: " +
                "\nNombre: " + nombre + "; Direccion: " + direccion + "; Precio/noche: " + precio;
    }
}
