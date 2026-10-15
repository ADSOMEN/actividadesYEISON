import javax.swing.JOptionPane;

public class horasextraSWICH {
    public static void main(String[] args) {
        int id, nhed, nhen, nhefd, nhefn, estrato, nh;
        String nom, cargo;
        float sb, sh, se, sn, abono, vhed, vhen, vhefd, vhefn;

        id = Integer.parseInt(JOptionPane.showInputDialog("Digite la Identificación: "));
        nom = JOptionPane.showInputDialog("Digite el Nombre: ");
        cargo = JOptionPane.showInputDialog("Digite el nicvel del Cargo (1 o 2): ");
        estrato = Integer.parseInt(JOptionPane.showInputDialog("Digite el Estrato 1-6 : "));
        nh = Integer.parseInt(JOptionPane.showInputDialog("Cuantos hijos Tiene: "));
        nhed = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de Horas Extras Diurnas Ordinarias: "));
        nhen = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de Horas Extras Nocturnas Ordinarias: "));
        nhefd = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de Horas Extras Diurnas Festivas: "));
        nhefn = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de Horas Extras Nocturnas Festivas: "));
        

        switch (cargo) {
            case "1":
                sb = 3950000;
                break;

            case "2":
                sb = 5500000;
                break;

            default:
                sb = 0;
                JOptionPane.showMessageDialog(null, "El cargo no Existe", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        vhed = (float) ((sb / 210) * 1.25);
        vhen = (float) (sb / 210) * 2;
        vhefd = (float) ((sb / 210) * 2.15);
        vhefn = (float) ((sb / 210) * 2.65);

        if (estrato < 1 || estrato > 6) {// Primer IF
            se = 0;
            JOptionPane.showMessageDialog(null, "El Estrato no Existe", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        else {

            

            switch (estrato) {

                case 1:
                    se = (float) (sb * 0.18);

                    break;

                case 2:
                    se = (float) (sb * 0.14);

                    break;

                case 3:
                    se = (float) (sb * 0.10);

                default:
                    se = 0;
            }

        }

        if (nh <= 0) {// IF 1
            sh = 0;
        } else {
            if (nh == 1 || nh == 2) {// IF 2
                sh = (float) (sb * 0.1);
            } else {
                if (nh == 3 || nh == 4) {// IF 3
                    sh = (float) (sb * 0.14);
                } else {
                    if (nh >= 5 && nh <= 10) {// IF 4
                        sh = (float) (sb * 0.03) * nh;
                    } else {
                        sh = (float) (sb * 0.03) * 10;
                    } // IF 4
                } // IF 3
            } // IF 2
        } // IF 1

        sn = (sb + se + sh + (vhed * nhed) + (vhen * nhen) + (vhefd * nhefd) + (vhefn * nhefn));

        if (se != 0 && sh != 0) {
            abono = (float) (sn * 0.01);
        } else {
            if (se != 0 || sh != 0) {
                abono = (float) (sn * 0.05);
            } else {
                abono = 0;
            }
        }

        sn = sn - abono;

        JOptionPane.showMessageDialog(null, "Empleado: " + nom + "\n"
                + "identificado con id: " + id + "\n"
                + "Sueldo Basico: " + sb + "\n"
                + "Subsidio Estrato: $" + se + "\n"
                + "Subsidio Hijos: $" + sh + "\n"
                + "Numero HED: " + nhed + "\n"
                + "Numero HEN: " + nhen + "\n"
                + "Numero HEDF: " + nhefd + "\n"
                + "Numero HENF: " + nhefn + "\n"
                + "Valor HED: " + vhed + "\n"
                + "Valor HEN: " + vhen + "\n"
                + "Valor HEDF: " + vhefd + "\n"
                + "Valor HENF: " + vhefn + "\n"
                + "Abono: $" + abono + "\n"
                + "Sueldo Neto: $" + sn + "\n");

    }

}
