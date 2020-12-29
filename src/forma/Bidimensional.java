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
    public class Bidimensional extends Forma {

        @Override
        public void cadastrar() {
            figura = JOptionPane.showInputDialog(null, "\n[BIDIMENSIONAL]"
                    + "\nPor gentileza insira o tipo de figura[FORMA]:");
            validar(1);
            JOptionPane.showMessageDialog(null, "\nFIGURA: " + figura);
        }

        @Override
        public void calcular() {
            diametro = Double.parseDouble(JOptionPane.showInputDialog(null, "\n[BIDIMENSIONAL]"
                    + "\nPor gentileza insira o valor do diâmetro:"));
            validar(2);
            JOptionPane.showMessageDialog(null, "\nDIÂMETRO: " + diametro);
            diametro = (diametro / 2);
            diametro = (3.14) * (diametro * diametro);
        }

        @Override
        public void mostrar() {
            JOptionPane.showMessageDialog(null,"\n[CÁLCULO UTLIZADO]" + "\nÁREA = π(R^2)");
            JOptionPane.showMessageDialog(null, "A área total do " + figura +  " é = " + diametro);
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
                    while (diametro <= 0) {
                        diametro = Double.parseDouble(JOptionPane.showInputDialog("[DADO INCOMPATÍVEL]\n" + "Digite novamente o diâmetro: "));
                    }
                    break;
                default:
                    break;
            }
        }



    }
