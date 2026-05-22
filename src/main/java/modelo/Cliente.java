
package modelo;

import modelo.excepciones.EntradaLimiteException;

public class Cliente extends Persona{
    private Integer puntos;
    
    public Cliente(String nombres, String apellidos, String dni, String contraseña, Integer puntos){
        super(nombres, apellidos, dni, contraseña);
        this.puntos = puntos;
    }
    private void ingresar (String usuario, String clave){}
    
    @Override
    public Boolean comprar(int cantidad) throws EntradaLimiteException {
        if (cantidad > 4) {
            throw new EntradaLimiteException("Error en Cliente: No se pueden comprar mas de 4 entradas por transaccion.");
        }
        if (cantidad <= 0) {
            throw new EntradaLimiteException("Error en Cliente: La cantidad debe ser mayor a 0.");
        }
        return true;
    }
}
