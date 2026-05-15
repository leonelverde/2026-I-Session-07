
package modelo;

import modelo.Persona;

public class Usuario extends Persona{
    private Boolean estado;
    
    public Usuario(String nombres, String apellidos, String dni, String contraseña, Boolean estado){
        super(nombres, apellidos, dni, contraseña);
        this.estado = estado;
    }
    
    public void registrarZonas(){}
    public Boolean comprar(){return true;}
}
