package com.leandro.utn;

public class Reclamo {

    int reclamo;

    public Reclamo(){

    }

    public int getReclamo(){
        return reclamo;
    }

    public void setReclamo(int reclamo){
        for (int i=0;i<5;i++) {
            reclamo=i;
            this.reclamo = reclamo;
        }
    }
}
