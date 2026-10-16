
import javax.swing.JOptionPane;

public class parEimparYEISON {
    public static void main(String[] args) {
        double numero=0;

        numero=Double.parseDouble(JOptionPane.showInputDialog(null, "digite su numero"));

            if (numero % 2==0) {
                JOptionPane.showMessageDialog(null, "su numero es par");
                
            }else{
                JOptionPane.showMessageDialog(null, "su numero es impar");

            }

            if(numero==0){
                JOptionPane.showMessageDialog(null, "su numero es cero");
                JOptionPane.showMessageDialog(null, "su numero es positivo");
            }else if(numero>0){
                JOptionPane.showMessageDialog(null, "su numero es positivo");
            }else{
                JOptionPane.showMessageDialog(null, "su numero es negativo");
            }
            


















        
        
    }
    
}
