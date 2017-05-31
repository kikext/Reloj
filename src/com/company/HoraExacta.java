package com.company;

/**
 * Created by e-imb on 31/05/2017.
 */
public class HoraExacta extends Hora{
    protected int seg;

    public HoraExacta(int hora, int minuto, int seg) {
        super(hora, minuto);
        this.seg = seg;
    }

    public void setSeg(int seg) {
        if(seg>=1 && seg<=59) {
            this.seg = seg;
        }
    }

    @Override
    public String toString() {
        return "HoraExacta{" +
                "hora=" + hora +
                ", minuto=" + minuto +
                ", seg=" + seg +

                '}';
    }

    @Override
    public void inc() {

        seg++;
        if(seg>59){
            seg = 0;
            seg++;
            super.inc();
        }

    }
}
