package com.tt1.test;

import java.util.List;

public class Servicio {
    private Repositorio repositorio;
    private MailerStub mailer;
    public Servicio(Repositorio repositorio, MailerStub mailer) {
        this.repositorio = repositorio;
        this.mailer = mailer;
    }

    public boolean crearTodo(String nombre, String fechaLimite) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public boolean añadirEmail(String email) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public boolean marcarCompletada(String nombre) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public List<ToDo> listarPendientes() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
}
