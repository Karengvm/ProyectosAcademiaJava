
public class sms implements Notificacion{
	
    private String remitente;

    public sms(String  remitente) {
        this.remitente = remitente;
    }
    
    @Override
    public void enviar(String mensaje) {
    	System.out.println("TIENES UN SMS DE "+ remitente + " MENSAJE: " + mensaje);
    }
}


