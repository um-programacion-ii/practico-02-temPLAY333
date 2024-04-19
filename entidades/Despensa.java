package entidades;

import interfaces.Despensable;

import java.util.HashMap;
import java.util.Map;

public class Despensa {
    private Map<String, Despensable> despensa;

    public Despensa() {
        this.despensa = new HashMap<>();
    }

    public Map<String, Despensable> getDespensa() {
        return despensa;
    }

    public void setDespensa(Map<String, Despensable> despensa) {
        this.despensa = despensa;
    }

    public void addDespensable(Despensable desp) {
        this.despensa.put(desp.getNombre(), desp);
    }

    public void getIngrediente(String nombre, int cantidad) {
        Despensable despensable = this.despensa.get(nombre);
        if (despensable instanceof Ingrediente) {
            Ingrediente ingrediente = (Ingrediente) despensable;
            ingrediente.sacar(cantidad);
            if (ingrediente.getCantidad() <= 0) {
                this.despensa.remove(nombre);
            }
        }
    }

    @Override
    public String toString() {
        String descripcion = "En la despensa; ";
        for (Map.Entry<String, Despensable> entry : this.despensa.entrySet()) {
            descripcion += entry.getKey() + ", ";
        }
        return descripcion;
    }
}
