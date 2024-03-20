package entidades;

public class Despensa {
    private Ingrediente[] despensa;

    public Despensa(Ingrediente[] despensa) {
        this.despensa = despensa;
    }

    public Ingrediente[] getDespensa() {
        return despensa;
    }

    public void setDespensa(Ingrediente[] despensa) {
        this.despensa = despensa;
    }

    public void addIngrediente (Ingrediente ingrediente) {
        for (int i = 0; i < this.despensa.length; i++) {
            if (this.despensa[i] == null) {
                this.despensa[i] = ingrediente;
                break;
            }
        }
    }

    public void getIngrediente (Ingrediente ingrediente,int cantidad) {
        for (Ingrediente ingre : this.despensa) {
            if (ingre == ingrediente) {
                ingrediente.sacar(cantidad);
            }
        }
    }

    @Override
    public String toString() {
        String desc = "En la despensa; ";
        for (Ingrediente ingre : this.despensa) {
            if (ingre == null) {
                break;
            }
            desc += ingre + ", ";
        }
        return desc;
    }
}
