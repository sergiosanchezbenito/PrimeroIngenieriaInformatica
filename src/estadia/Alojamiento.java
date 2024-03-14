package estadia;

import java.util.Objects;

public class Alojamiento {
    // atributos
    protected String nombre;
    protected String direccion;
    protected double precio;

    // constructor

    public Alojamiento(String nombre, String direccion, double precio) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.precio = precio;
    }

    // constructor sin el precio
    public Alojamiento(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    // getters

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public double getPrecio() {
        return precio;
    }


    // toString
    /*
    @Override
    public String toString () {
        return "Alojamiento{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", precio=" + precio +
                '}';
    }
     */

    // equals
    //NO FUNCIONA EL METODO, NO COMPARA
    

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (!(o instanceof Alojamiento that)) return false;
        return Double.compare (precio, that.precio) == 0 && Objects.equals (nombre, that.nombre) && Objects.equals (direccion, that.direccion);
    }
}
