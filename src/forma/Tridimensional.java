/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forma;

import javax.swing.JOptionPane;

/**
 *
 * @author Thiago
 */
public class Tridimensional extends Forma {

    @Override
    public void cadastrar() {
        figura = JOptionPane.showInputDialog(null, "\n[TRIDIMENSIONAL]"
                + "\nPor gentileza insira o tipo de figura[FORMA]:");
        validar(1);
        JOptionPane.showMessageDialog(null, "\nFIGURA[FORMA]: " + figura);
    }

    @Override
    public void calcular() {
        base = Double.parseDouble(JOptionPane.showInputDialog(null, "\n[TRIDIMENSIONAL]"
                + "\nPor gentileza insira o valor da base:"));
        validar(2);
        JOptionPane.showMessageDialog(null, "\nBASE: " + base);
    }

    public void calcular1() {
        altura = Double.parseDouble(JOptionPane.showInputDialog(null, "\n[TRIDIMENSIONAL]"
                + "\nPor gentileza insira o valor da altura:"));
        validar(3);
        JOptionPane.showMessageDialog(null, "\nALTURA: " + altura);
    }

    public void calcular2() {
        base = (base * altura) / 2;
        JOptionPane.showMessageDialog(null, "\nÁREA " + figura + " = " + base);
    }

    @Override
    public void mostrar() {
        JOptionPane.showMessageDialog(null, "\n[CÁLCULO UTLIZADO]" + "\nÁREA = (b.h)/ 2");
        JOptionPane.showMessageDialog(null, "A área total do " + figura + " é = " + base);
    }

    public void validar(int etapa) {
        switch (etapa) {
            case 1:
                while ("".equals(figura)) {
                    figura = JOptionPane.showInputDialog(null, "\n[BIDIMENSIONAL]" + "\n[O CAMPO NÃO PODE FICAR VAZIO!!]"
                            + "\nPor gentileza insira o tipo de figura:");
                }
                break;
            case 2:
                while (base <= 0) {
                    base = Double.parseDouble(JOptionPane.showInputDialog("[DADO INCOMPATÍVEL]\n" + "Digite novamente o valor da base: "));
                }
                break;
            case 3:
                while (altura <= 0) {
                    altura = Double.parseDouble(JOptionPane.showInputDialog("[DADO INCOMPATÍVEL]\n" + "Digite novamente o valor da altura: "));
                }
                break;
            default:
                break;
        }
    }
}
