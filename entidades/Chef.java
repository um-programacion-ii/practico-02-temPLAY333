package entidades;

import interfaces.Cocinable;
import servicios.CocinaService;

public class Chef implements Cocinable{
    private String nombre;
    private int estrellasMichelin;

    public Chef(String nombre, int estrellasMichelin) {
        this.nombre = nombre;
        this.estrellasMichelin = estrellasMichelin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstrellasMichelin() {
        return estrellasMichelin;
    }

    public void setEstrellasMichelin(int estrellasMichelin) {
        this.estrellasMichelin = estrellasMichelin;
    }

    public void verificarIngredientes(Despensa despensa, Receta receta) {
        CocinaService service = new CocinaService();
        service.verficarIngredientes(despensa,receta);
    }

    public void cocinar(Despensa despensa, Receta receta) {
        CocinaService service = new CocinaService();
        service.cocinar(despensa,receta);
    }

    @Override
    public String toString() {
        return "El cocinero " + this.nombre + " tiene " + this.estrellasMichelin + " estrellas Michelin!";
    }
}
