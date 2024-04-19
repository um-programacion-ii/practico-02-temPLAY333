package entidades;

import interfaces.Despensable;

import java.util.Map;

public class Receta {
    private int tiempoCoccion;
    private Map<String, Despensable> despensables;
    private String preparacion;

    public Receta(int tiempoCoccion, Map<String, Despensable> despensables, String preparacion) {
        this.tiempoCoccion = tiempoCoccion;
        this.despensables = despensables;
        this.preparacion = preparacion;
    }

    public Receta(){};

    public int getTiempoCoccion() {
        return tiempoCoccion;
    }

    public void setTiempoCoccion(int tiempoCoccion) {
        this.tiempoCoccion = tiempoCoccion;
    }

    public Map<String, Despensable> getDespensables() {
        return despensables;
    }

    public void setDespensable(Map<String, Despensable> despensables) {
        this.despensables = despensables;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    @Override
    public String toString() {
        return preparacion;
    }
}
