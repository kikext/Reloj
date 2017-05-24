package com.company;


import java.util.ArrayList;
        import java.util.List;

public class Main {

    public static void main(String[] args) {
	List<Hora>Hora= new ArrayList();
	Hora h1 = new Hora(20,38);
	Hora.add(h1);

        System.out.println(h1.getHora()+":"+h1.getMinuto());
    }
}
