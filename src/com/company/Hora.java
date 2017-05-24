package com.company;

/**
 * Created by e-imb on 24/05/2017.
 */
public class Hora {
    protected int hora;
    protected int minuto;

    public Hora(int hora, int minuto) {
        this.hora = 0;
        this.minuto = 0;
        setHora(hora);
        setMinuto(minuto);

    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {

        this.minuto = minuto;

    }

    public void inc(){
        minuto++;
        if(minuto>59){
            hora++;
            minuto=00;
        }if(hora>23){
            hora = 00;
        }
    }


    @Override
    public String toString() {
        return "Hora{" +
                "hora=" + hora +
                ", minuto=" + minuto +
                '}';
    }
}
