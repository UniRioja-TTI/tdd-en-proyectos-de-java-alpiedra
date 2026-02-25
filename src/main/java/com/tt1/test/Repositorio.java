package com.tt1.test;

import java.util.List;

public class Repositorio {
    private DBStub db;
    public Repositorio(DBStub db) {
        this.db=db;
    }

    public boolean guardarTodo(ToDo todo) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public ToDo encontrarTodo(String nombre) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public boolean marcarCompletada(String nombre) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public List<ToDo> pendientes() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public boolean guardarEmail(String email) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public List<String> getEmails() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
}
