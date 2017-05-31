package com.company;


import java.util.ArrayList;
        import java.util.List;

public class Main {

    public static void main(String[] args) {


        Hora h1 = new Hora(23, 0);

        for (int x = 0; x<120 ; x++) {
            h1.inc();
            System.out.println(h1);

           /*

           Objeto de Hora12 (Hora, Minutos, AM/PM)

            Hora12 h2 = new Hora12(10, 0, Hora12.Meridiano.PM);

            for (int i = 0; i<120 ; i++) {
            h2.inc();
            System.out.println(h2);
            }
            */

           /*

           Objeto de HoraExacta (Horas, Minutos, Segundos)

            HoraExacta h3 = new HoraExacta(23, 0, 30);

            for (int z = 0; z<120 ; z++) {
                h3.inc();
                System.out.println(h3);
            }
            */
        }
    }
}