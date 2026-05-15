
package modelo;

import java.util.Date;

public class Venta {
    private Date fecha;
    private int monto;

    public Venta(Date fecha, int monto){
        this.fecha = fecha;
        this.monto = monto;
    }

    public boolean anular(){return true;}
}
