package com.leandro.utn;

public class Satisfaccion {

    String satisfaccionDelCliente;

    public Satisfaccion(){

    }

    public String getSatisfaccionDelCliente(){
        return satisfaccionDelCliente;
    }

    public void setSatisfaccionDelCliente(String satisfaccionDelCliente) {

        if (satisfaccionDelCliente.equals("bien")) {
            this.satisfaccionDelCliente = satisfaccionDelCliente;
        }

        else if (satisfaccionDelCliente.equals("normal")){
            this.satisfaccionDelCliente=satisfaccionDelCliente;
        }

        else if (satisfaccionDelCliente.equals("enojado")){
            this.satisfaccionDelCliente=satisfaccionDelCliente;
        }
    }
}
