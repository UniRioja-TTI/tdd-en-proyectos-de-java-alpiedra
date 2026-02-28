package com.tt1.test.Mocks;

import com.tt1.test.IRepositorio;
import com.tt1.test.ToDo;

import java.util.*;

public class MRepositorio implements IRepositorio {

    private final Map<String, ToDo> tareas = new HashMap<>();
    private final List<String> emails = new ArrayList<>();

    @Override
    public boolean guardarTodo(ToDo todo) {
        tareas.put(todo.getNombre(), todo);
        return true;
    }

    @Override
    public ToDo encontrarTodo(String nombre) {
        return tareas.get(nombre);
    }

    @Override
    public boolean marcarComoCompletada(String nombre) {
        ToDo t = tareas.get(nombre);
        if (t == null) return false;
        t.setCompletado(true);
        return true;
    }

    @Override
    public List<ToDo> obtenerPendientes() {
        List<ToDo> pendientes = new ArrayList<>();
        for (ToDo t : tareas.values()) {
            if (!t.getCompletado()) pendientes.add(t);
        }
        return pendientes;
    }

    @Override
    public boolean guardarEmail(String email) {
        emails.add(email);
        return true;
    }

    @Override
    public List<String> getEmails() {
        return emails;
    }
}