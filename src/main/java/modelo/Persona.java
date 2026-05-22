package modelo;

import modelo.excepciones.EntradaLimiteException;

public abstract class Persona {
    private String nombres;
    private String apellidos;
    private String dni;
    private String contraseña;
    
    public Persona(String nombres, String apellidos, String dni, String contraseña){ 
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.contraseña = contraseña;
    }
    public Boolean registrarTarjeta(){return true;}
    public Boolean eliminarTarjeta(){return true;}
    public Boolean anularVenta(){return true;}
    
    public abstract Boolean comprar(int cantidad) throws EntradaLimiteException;
}
