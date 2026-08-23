package com.adricodev.interfaces.ejercicio06;

public class NotificacionEmail implements CanalNotificacion{

    @Override
    public void enviar(String mensaje, String destinatario) {
        System.out.println("Enviando un email a " + destinatario + " el siguiente mensaje: " + mensaje);
    }
}
