package com.leandro.utn;

public class Vivienda {

    String tipoDeVivienda;
    String calle;
    int cantidadDePisos;

    public Vivienda() {

    }

    public String getTipoDeVivienda() {
        return tipoDeVivienda;
    }

    public void setTipoDeVivienda(String tipoDeVivienda, int cantidadDePisos) {

        if (tipoDeVivienda.equals("casa")) {
            this.tipoDeVivienda = tipoDeVivienda;
        }

        else if (tipoDeVivienda.equals("edificio")){

            if (cantidadDePisos < 10){
                this.tipoDeVivienda=tipoDeVivienda;
            }

            else if (cantidadDePisos > 10){
                this.cantidadDePisos=cantidadDePisos;
            }
        }
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }
}
