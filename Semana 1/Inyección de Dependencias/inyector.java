
// Servicio que utiliza una instancia de Notificacion para enviar mensajes
public class inyector {
	
    private final Notificacion notificacion;// Dependencia inyectada

    
    // Constructor que recibe la implementación concreta de Notificacion (inyección de dependencias)
	    public inyector(Notificacion notificacion) {
	        this.notificacion = notificacion;
	    }
	    
	 // Método para enviar notificaciones utilizando la instancia inyectada
	    public void enviarNotificacion(String mensaje) {
	        notificacion.enviar(mensaje);
	    }
	}


