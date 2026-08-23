package com.adricodev.interfaces.ejercicio06;

public class NotificacionSMS implements CanalNotificacion{

    @Override
    public void enviar(String mensaje, String destinatario) {
        System.out.println("Enviando un SMS a " + destinatario + " el siguiente mensaje de texto: " + mensaje);
    }
}
