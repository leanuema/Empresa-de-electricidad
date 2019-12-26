package com.leandro.utn;

public class CentralAsociada {

    String tipoDeCentralAsociada;

    public CentralAsociada(){

    }

    public String getTipoDeCentralAsociada(){
        return tipoDeCentralAsociada;
    }

    public void setTipoDeCentralAsociada(String tipoDeCentralAsociada){
        if (tipoDeCentralAsociada.equals("baja")){
            this.tipoDeCentralAsociada=tipoDeCentralAsociada;
        }

        else if (tipoDeCentralAsociada.equals("media")){
            this.tipoDeCentralAsociada=tipoDeCentralAsociada;
        }

        else if (tipoDeCentralAsociada.equals("alta")) {
            this.tipoDeCentralAsociada=tipoDeCentralAsociada;
        }
    }
}
