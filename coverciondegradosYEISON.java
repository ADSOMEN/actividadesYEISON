import javax.swing.JOptionPane;

public class coverciondegradosYEISON {

    public static void main(String[] args) {
        float gradosc=0, gradosf=0;
        gradosc=Float.parseFloat(JOptionPane.showInputDialog("Digite los grados celsius"));
        gradosf=(float) ((gradosc*1.8)+32);
        JOptionPane.showMessageDialog(null, "engrados farenheit equivale a: "+gradosf);

    }
}