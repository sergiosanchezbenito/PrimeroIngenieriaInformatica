package estadia;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // crear todos los alojamietnos
        Hotel hotel1 = new Hotel ("Campanile", "Rue Moulin, 32", 115.0);
        Apartamento apart1 = new Apartamento ("Garderobe", "Rue de I'Oust,43", 88);
        Hotel hotel2 = new Hotel ("Eiffle","Avenue des Princes, 71",143);
        Hotel hotel3 = new Hotel ("Chevalier", "Rue Oudinot, 59", 95.0);
        Apartamento apart2 = new Apartamento ("Porte de Versailles", "Avenue de Javel, 33", 120.0);
        Apartamento apart3 = new Apartamento ("Montrouge", "Rue Perier, 128", 116.0);
        Hotel hotel4 = new Hotel ("Felicien", "Avenue Letellier, 87", 163.0);


        // crear el array que se pide en el apartado c.1
        Alojamiento[] alojamientos = {hotel1, apart1, hotel2, hotel3, apart2, apart3, hotel4};
        //PREGUNTAR SI UTILIZAR UN UNICO ARRAY Y RECORRERLO PARA MOSTRAR LOS OBJETOS
        //O TENER DOS SUPLEMENTARIOS SEPARADOS HOTEL Y APARTAMENTO
        //O PODER HACER UN ARRAY CON DOS FILAS TIPO MATRIZ
        Hotel[] hoteles = {hotel1, hotel2, hotel3, hotel4};
        Apartamento[] apartamentos = {apart1,apart2, apart3};


        // menú
        Scanner teclado = new Scanner (System.in);

        System.out.println("\nBienvenido a nuestro buscador de alojamientos en París. Actualmente disponemos de 4 \nhoteles y 3 apartamentos. ¿Qué quieres consultar?");
        System.out.println("1.- Hoteles");
        System.out.println("2.- Apartamentos");
        System.out.println("3.- Ver todo");
        System.out.println("4.- Quiero buscar un sitio concreto");

        int opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Mostrando hoteles...");

                // mostrar los hoteles
                for (Hotel hotel: hoteles){
                    System.out.println ("Nombre: " + hotel.getNombre() + "; Dirección: " + hotel.getDireccion() + "; Precio: " + hotel.getPrecio());
                }
                break;

            case 2:
                System.out.println("Mostrando apartamentos...");

                // mostrar los apartamentos
                for (Apartamento apartamento: apartamentos){
                    System.out.println ("Nombre: " + apartamento.getNombre() + "; Dirección: " + apartamento.getDireccion() + "; Precio: " + apartamento.getPrecio());

                }
                break;


            case 3:
                System.out.println("Mostrando hoteles y apartamentos...");
                
                // mostrar toodo
                for (Alojamiento alojamiento : alojamientos) {
                    System.out.println ("Nombre: " + alojamiento.getNombre() + "; Dirección: " + alojamiento.getDireccion() + "; Precio: " + alojamiento.getPrecio());
                }

                break;

            case 4:
                System.out.println("Perfecto. ¿Cómo se llama el alojamiento al que quieres ir?:");
                opcion = teclado.nextInt();
                System.out.println("¿Y cuál es la dirección?");
                opcion = teclado.nextInt();
                System.out.println("¡Lo tenemos! Este es el alojamiento que buscando: ");
                // mostrar los alojamientos

                break;

            default:
                System.out.println("Opción no válida. Por favor, selecciona una opción válida.");

        }
    }
}
