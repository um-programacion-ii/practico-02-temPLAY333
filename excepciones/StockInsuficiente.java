package excepciones;

public class StockInsuficiente extends Exception{
    public StockInsuficiente(){
        super("La despensa no tiene suficienets ingredientes para cocinar");
    }

    public StockInsuficiente(String msg){
        super(msg);
    }
}
