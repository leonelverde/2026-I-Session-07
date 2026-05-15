
package modelo;

import java.util.ArrayList;
import java.util.List;

public class Zona{
    private String nombre;
    private int capacidad;
    private int precio;
    private List<Entrada> entradas; 

    public Zona(String nombre, int capacidad, int precio){
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.precio = precio;
        this.entradas = new ArrayList<>();
    }

    public boolean generarEntradas(){return true;}

    public Entrada[] mostrarEntrada(){return new Entrada[0];}

    public Entrada[] venderEntrada(int numero){return new Entrada[0];}
}
