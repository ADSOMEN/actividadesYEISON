import javax.swing.JOptionPane;

public class SumaYPromedioYEISON {
    public static void main(String[] args) {
        double num, suma = 0, contador = 0, promedio=0 ;

        num=Double.parseDouble(JOptionPane.showInputDialog("ingrese un numero (negativo para terminar)"));

        while (num>0) {
            suma=suma+num;
            contador=contador+1;

            num=Double.parseDouble(JOptionPane.showInputDialog("ingrese un numero (negativo para terminar)"));
            
        }
        JOptionPane.showMessageDialog(null,"La suma total es: "+suma);

        if (contador>0) {
            promedio=suma/contador;
            JOptionPane.showMessageDialog(null,"el promedio es: "+promedio);

            
        }else{
            JOptionPane.showMessageDialog(null,"no se ingresaron numeros validos");

        }


        
    }
    
}
