
public class email implements Notificacion{
	
    private String remitente;

    public email(String remitente) {
        this.remitente = remitente;
    }
    
    @Override
    public void enviar(String mensaje) {
    	System.out.println("TIENES EMAIL DE "+ remitente + " MENSAJE: "+ mensaje);
    }
}
