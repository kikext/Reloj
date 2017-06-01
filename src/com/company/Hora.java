package com.company;

/**
 * Created by e-imb on 24/05/2017.
 */
public class Hora {
    protected int hora;
    protected int minuto;



    public Hora(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;

    }

    public void setHora(int hora) {
        if(hora>=0 && hora<24)
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        if(minuto<=59 && minuto<=0)
        this.minuto = minuto;

    }

    public void inc(){
        minuto++;
        if(minuto>59){
            minuto=0;



            if (hora>23)
                    hora=0;
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
