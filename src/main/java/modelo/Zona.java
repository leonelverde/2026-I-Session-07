
package modelo;

import java.util.ArrayList;
import java.util.List;
import modelo.excepciones.CapacidadExcedidaException;
import modelo.excepciones.EntradaNoDisponibleException;

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

    public boolean generarEntradas(int cantidad) throws CapacidadExcedidaException {
        if (entradas.size() + cantidad > capacidad) {
            throw new CapacidadExcedidaException("No se pueden generar " + cantidad + " entradas. "
                    + "La capacidad máxima de la zona " + nombre + " es " + capacidad + ".");
    
        }
        for (int i = 0; i < cantidad; i++) {
            entradas.add(new Entrada(entradas.size() + 1, "Disponible"));
        }
        return true;
    }

    public Entrada[] mostrarEntrada(){return new Entrada[0];}

    public Entrada[] venderEntrada(int numero) throws CapacidadExcedidaException, EntradaNoDisponibleException{
        int disponibles = 0;
        for (Entrada e : entradas) {
            disponibles++; 
        }

        if (numero > disponibles) {
            throw new CapacidadExcedidaException("Solo quedan " + disponibles + " entradas disponibles en la zona " + nombre + ".");
        }
        
        return new Entrada[numero];
    }
}
