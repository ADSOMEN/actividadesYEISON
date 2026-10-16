import javax.swing.JOptionPane;

public class calculadoraYEISON {
    public static void main(String[] args) {
        double num1 = 0, num2 = 0, resultado = 0;
        String operacion = null;

        operacion = JOptionPane.showInputDialog(null, "que operacion desea realizar");
        num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "digite su numero 1"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "digite su numero 2"));

        switch (operacion) {
            case "suma":
                resultado = (num1 + num2);
                break;

            case "resta":
                resultado = (num1 - num2);
                break;

            case "multiplicacion":
                resultado = (num1 * num2);
                break;

            case "dividir":
                resultado = (num1 / num2);
                break;

            default:
                JOptionPane.showMessageDialog(null, "error de operacion");

                break;
        }
        JOptionPane.showMessageDialog(null, "su resultado es" + resultado);

    }
}
