package com.tt1.test;

import java.util.List;

public interface IRepositorio {
    boolean guardarTodo(ToDo todo);
    ToDo encontrarTodo(String nombre);
    boolean marcarComoCompletada(String nombre);
    List<ToDo> obtenerPendientes();
    boolean guardarEmail(String email);
    List<String> getEmails();
}