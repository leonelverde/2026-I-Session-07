
package modelo;

public class Cliente extends Persona{
    private Integer puntos;
    
    public Cliente(String nombres, String apellidos, String dni, String contraseña, Integer puntos){
        super(nombres, apellidos, dni, contraseña);
        this.puntos = puntos;
    }
    private void ingresar (String usuario, String clave){}
    public Boolean comprar(){return true;}
}
