package entidades;

public class Ingrediente {
    private String nombre;
    private int cantidad;

    public Ingrediente(String nombre, int cantidad){
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void sacar(int numero) {
        if (numero <= this.cantidad) {
            setCantidad(this.cantidad-numero);
            System.out.println("Sacado Exitoso de " + this.nombre);
        } else {
            System.out.println("No hay tal cantidad de " + this.nombre);
        }
    }

    @Override
    public String toString() {
        return "Del ingrediente " + nombre + " hay " + cantidad;
    }
}
