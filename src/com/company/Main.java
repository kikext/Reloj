package com.company;


import java.util.ArrayList;
        import java.util.List;

public class Main {

    public static void main(String[] args) {


        Hora h1 = new Hora(23, 0);

        for (int x = 0; x<120 ; x++) {
            h1.inc();
            System.out.println(h1);
        }
    }
}