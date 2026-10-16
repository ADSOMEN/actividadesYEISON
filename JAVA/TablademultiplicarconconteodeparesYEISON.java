import javax.swing.JOptionPane;

public class TablademultiplicarconconteodeparesYEISON {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int n, resultado = 0, contadorpares = 0;

        n = Integer.parseInt(JOptionPane.showInputDialog(null, "digite su numero "));

        for (int i = 1; i <= 10; i++) {
            resultado = n * i;
            JOptionPane.showMessageDialog(null, +n + " x " + i + "=" + resultado);

            if (resultado % 2 == 0) {
                contadorpares++;
            }
        }
        JOptionPane.showMessageDialog(null, "cantidad de resltador pares: " + contadorpares);

    }

}
