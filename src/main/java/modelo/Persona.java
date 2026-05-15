package modelo;

public abstract class Persona {
    private String nombres;
    private String apellidos;
    private String dni;
    private String contraseña;
    
    public Persona(String nombres, String apellidos, String dni, String contraseña){    
    }
    public Boolean registrarTarjeta(){return true;}
    public Boolean eliminarTarjeta(){return true;}
    public Boolean anularVenta(){return true;}
    public abstract Boolean comprar(); 
}
