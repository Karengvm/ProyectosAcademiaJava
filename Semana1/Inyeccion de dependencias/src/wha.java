
public class wha implements Notificacion{
	
    private String remitente;

    public wha(String remitente) {
        this.remitente = remitente;
    }
    
    public void enviar(String mensaje) {
    	System.out.println("TIENES WHA DE "+ remitente + " MENSAJE: "+ mensaje);
    }
}
