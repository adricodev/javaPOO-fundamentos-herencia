package com.adricodev.interfaces.ejercicio06;

public class Main {
    public static void main(String[] args) {
        NotificacionEmail notificacionemail = new NotificacionEmail();
        NotificacionSMS notificacionsms = new NotificacionSMS();

        notificacionemail.enviar("Recuerde renovar su suscripción", "adrian@email.com");
        notificacionsms.enviar("Recuerde su cita para el próximo lunes", "692982982");
    }
}
