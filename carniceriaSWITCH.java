import javax.swing.JOptionPane;

public class carniceriaSWITCH {
    public static void main(String[] args) {

        String tcarne;
        float peso = 0, valor, total;

        tcarne = JOptionPane.showInputDialog("Digite el tipo de carne: "
                + "\n cerdo"
                + "\n res"
                + "\n bufalo");
        switch (tcarne.toLowerCase()) {
            case "cerdo":
                peso = Float.parseFloat(JOptionPane.showInputDialog("digite el peso"));
                if (peso >= 5) {
                    valor = 24000;
                } else {
                    valor = 28000;
                }

                break;

            case "res":
                peso = Float.parseFloat(JOptionPane.showInputDialog("digite el peso"));
                if (peso >= 10) {
                    valor = 30000;
                } else {
                    valor = 35000;
                }

                break;

            case "bufalo":
                peso = Float.parseFloat(JOptionPane.showInputDialog("digite el peso"));
                if (peso >= 7) {
                    valor = 40000;
                } else {
                    valor = 43000;
                }

                break;

            default:
                valor = 0;
                break;
        }
        total = valor * peso;
        JOptionPane.showMessageDialog(null, "tipo de carne: " + tcarne + "\npeso: " + peso + "\n total: " + total);

    }
}
