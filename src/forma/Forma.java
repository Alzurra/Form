/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forma;

import static java.lang.System.exit;

/**
 *
 * @author Thiago
 */
public abstract class Forma {

    protected String figura;
    protected Double diametro;
    protected Double base;
    protected Double altura;

    public abstract void cadastrar();

    public abstract void calcular();

    public abstract void mostrar();

    public static void main(String[] args) {
        System.out.println("BIDIMENSIONAL");
        Bidimensional b = new Bidimensional();
        b.cadastrar();
        b.calcular();
        b.mostrar();
        
        System.out.println("**********************");
        System.out.println("TRIDIMENSIONAL");
        Tridimensional t = new Tridimensional();
        t.cadastrar();
        t.calcular();
        t.calcular1();
        t.calcular2();
        t.mostrar();
        
        System.out.println("**********************");
        System.out.println("CIRCULO");
        Circulo c = new Circulo() {};
        c.cadastrar();
        c.calcular();
        c.mostrar();
        System.out.println("**********************");
        System.out.println("FINALIZANDO O PROGRAMA");
        exit(0);

    }

}
