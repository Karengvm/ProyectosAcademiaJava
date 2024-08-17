
public class Main {
	
    public static void main(String[] args) {
    	
        // Configurar la inyección de dependencias para email
    	Notificacion email = new email("Juan");
        inyector emailservice = new inyector(email);// Inyección de email
        emailservice.enviarNotificacion("Este es un mensaje de prueba por email.");

        // Configurar la inyección de dependencias para SMS
        Notificacion sms = new sms("Juan");
        inyector smsservice = new inyector(sms); // Inyección de SMS
        smsservice.enviarNotificacion("Este es un mensaje de prueba por SMS.");

        // Configurar la inyección de dependencias para notificaciones push
        Notificacion wha = new wha("Juan");
        inyector whaservice = new inyector(wha); // Inyección de wha
        whaservice.enviarNotificacion("Este es un mensaje de prueba por wha.");
    }
}
