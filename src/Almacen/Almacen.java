
package Almacen;

public class Almacen {
    
    private int n;
    private String fecha;
    public String [] matricula, descripcion,tipoAlmacen;
    public int [] cantidad;

    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = n;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String[] getMatricula() {
        return matricula;
    }
    public void setMatricula(String[] matricula) {
        this.matricula = matricula;
    }
    public String[] getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String[] descripcion) {
        this.descripcion = descripcion;
    }
    public String[] getTipoAlmacen() {
        return tipoAlmacen;
    }
    public void setTipoAlmacen(String[] tipoAlmacen) {
        this.tipoAlmacen = tipoAlmacen;
    }
    public int[] getCantidad() {
        return cantidad;
    }
    public void setCantidad(int[] cantidad) {
        this.cantidad = cantidad;
    }

    public void Registrar(int x) {
        matricula = new String [x];
        cantidad = new int [x];        
        descripcion = new String [x];
        tipoAlmacen = new String[x];
    }
    
    
    
    
}
