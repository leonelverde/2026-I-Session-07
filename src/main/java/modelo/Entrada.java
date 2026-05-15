
package modelo;

public class Entrada {
    private int numero;
    private String estado; 

    public Entrada(int numero, String estado){
        this.numero = numero;
        this.estado = estado;
    }

    public Boolean vender(){return true;}
    public Boolean liberar(){return true;}
}
