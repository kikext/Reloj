package com.company;

/**
 * Created by e-imb on 31/05/2017.
 */
public class Hora12 extends Hora {
    public enum Meridiano {AM, PM};
    protected  Meridiano mer;

    public Hora12(int hora, int minuto, Meridiano mer) {
        super(hora, minuto);
        this.mer = mer;
    }



    public void setMer(Meridiano mer) {
        this.mer = mer;
    }

    @Override
    public void setHora(int hora) {
        if(hora >=1 && hora <=12) {
            this.hora = hora;
        }

    }

    @Override
    public String toString() {
        return  "hora=" + hora +
                ", minuto=" + minuto +
                ", mer=" + mer +
                '}'+ super.toString() ;
    }

    @Override
    public void inc() {
        super.inc();
        if(hora>12){
            hora = 1;
        }


    }
}
