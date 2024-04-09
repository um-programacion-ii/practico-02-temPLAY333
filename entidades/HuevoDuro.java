package entidades;

class HuevoDuro extends Receta {
    public HuevoDuro() {
        super(10,
                new Ingrediente[]{
                        new Ingrediente("huevo", 1),
                        new Ingrediente("agua", 100)},
                "Hervir los huevos en agua durante 10 minutos.");
    }
}

