package com.tt1.test.Mocks;

import com.tt1.test.IMailer;

public class MMailer implements IMailer {
    private String ultimoMensaje = null;
    private boolean enviado = false;

    @Override
    public Boolean enviarMail() {
        enviado = true;
        return true;
    }
    public boolean seEnvio() {
        return enviado;
    }

    public void reset() {
        enviado = false;
    }
}