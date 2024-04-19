package excepciones;

public class VidaUtilInsifuciente extends Exception{
    public VidaUtilInsifuciente(){
        super("El tiempo de vida restante no alcanza para cocinar");
    }

    public VidaUtilInsifuciente(String msg) {
        super(msg);
    }
}
