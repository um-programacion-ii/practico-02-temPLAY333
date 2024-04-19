package interfaces;

import entidades.Despensa;
import entidades.Receta;

public interface Cocinable {
    public void cocinar (Despensa despensa, Receta receta);
}
