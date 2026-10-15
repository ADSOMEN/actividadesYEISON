/*crear un algoritmo para una carniseria que pida el tipo de carne de la venta y la cantidad en kilos. existen 3 opciones res, bufalo y cerdo
 si el tipo de carne es cerdo y la cantidad es mayor o igual a 5k el valor de k es 24.000 */

/*si el tipo de carne es cerdo y la cantidad es mayor o igual a 5k el valor de k es 24.000 
si el tipo de carne es cerdo y la cantidad es menor o igual a 5k el valor de k es 28.000 

si el tipo de carne es res y la cantidad es mayor o igual a 10k el valor de k es 30.000*
si el tipo de carne es res y la cantidad es mayor o igual a 10k el valor de k es 35.000

si el tipo de carne es bufalo y la cantidad es mayor o igual a 7k el valor de k es 40.000
si el tipo de carne es bufalo y la cantidad es menor o igual a 7k el valor de k es 43.000*/

/*imprimir la cantidad y el total */

import javax.swing.JOptionPane;

public class carniceria2 {

    public static void main(String[] args) {
        float total, valorkilo = 0;
        String tcarne;
        int peso;

        tcarne = JOptionPane.showInputDialog("Digite el tipo de carne");
        peso = Integer.parseInt(JOptionPane.showInputDialog("Digite el peso"));
        
        if (peso <= 0) {
            JOptionPane.showMessageDialog(null, "error de peso", "ERROR",JOptionPane.ERROR_MESSAGE);

        }

        if (tcarne.equalsIgnoreCase("cerdo")) {
            if (peso >= 5) {
                valorkilo = 24000;

            } else if (tcarne.equalsIgnoreCase("cerdo")) {
                if (peso <= 5) {
                    valorkilo = 28000;
                }

            } else if (tcarne.equalsIgnoreCase("res")) {
                if (peso <= 10) {
                    valorkilo = 30000;

                } else if (tcarne.equalsIgnoreCase("res")) {
                    if (peso <= 10) {
                        valorkilo = 35000;

                    } else if (tcarne.equalsIgnoreCase("bufalo")) {
                        if (peso <= 7) {
                            valorkilo = 40000;

                        }
                    } else if (tcarne.equalsIgnoreCase("bufalo")) {
                        if (peso <= 7) {
                            valorkilo = 43000;

                        }
                    }
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "tipo de carne erroneo", "ERROR",JOptionPane.ERROR_MESSAGE);
        }
        total = peso * valorkilo;
        JOptionPane.showMessageDialog(null,
                "su tipo de carne es: " + tcarne + "\npeso: " + peso + "\nsu valor total a pagar es: " + total);

    }
}
